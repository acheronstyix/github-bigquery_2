package org.ossmeter.contentclassifier.opennlptartarus.libsvm;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import libsvm.svm_model;
import libsvm.svm_node;

import org.ossmeter.libsvm.svm_predict_nofiles;

public class Classifier {

	List<ClassificationInstance> classificationInstanceList;
	Map<String, String> classificationResults; 
	Map<Double, String> classMapping; 

	public Classifier() {
		classificationInstanceList = new ArrayList<ClassificationInstance>();
		classMapping = loadFromFile("classifierFiles/classMapping");
	}

	public int instanceListSize() {
		return classificationInstanceList.size();
	}
	
	public void add(ClassificationInstance classificationInstance) {
		classificationInstanceList.add(classificationInstance);
	}
	
	public String getClassificationResult(ClassificationInstance classificationInstance) {
		String composedId = classificationInstance.getComposedId();
		if (classificationResults.containsKey(composedId))
			return classificationResults.get(composedId);
		else {
			System.out.println("No classification result found for classificationInstance: " 
									+ classificationInstance.toString());
			return null;
		}
	}
	
	public void classify() {

		FeatureGenerator featureGenerator = new FeatureGenerator(
				"classifierFiles/lemmaFeaturesList", 
				"classifierFiles/empiricalFeaturesList");

//		previousTime = printTimeMessage(startTime, previousTime, instanceListSize(), 
//										"initialised featureGenerator");

//		long taggerTime = 0; 
		for (ClassificationInstance xmlItem: classificationInstanceList) {
				featureGenerator.updateData(xmlItem.getComposedId(), 
												xmlItem.getCleanTokenSentences());
//				currentTime = System.currentTimeMillis();
//				taggerTime += (currentTime - previousTime);
//				previousTime = currentTime;
		}
//		System.err.println(time(taggerTime) + "\t" + "tagger time");
		
//		previousTime = printTimeMessage(startTime, previousTime, instanceListSize(), 
//										"updated featureGenerator");
		List<Double> target_list = featureGenerator.generateTargets(classificationInstanceList);
		List<svm_node[]> svm_node_list = featureGenerator.generateFeatures(classificationInstanceList);
		
		
//		previousTime = printTimeMessage(startTime, previousTime, instanceListSize(), 
//										"generated features");

		String path = getClass().getProtectionDomain().getCodeSource().getLocation().getFile();
		if (path.endsWith("bin/"))
			path = path.substring(0, path.lastIndexOf("bin/"));
		String argumentString = "-b 1 " + path + "classifierFiles/Test-TfIdfFeatures-Clean-AllPoS-BeginningOnly-.m";
//		String argumentString = "-b 1 " + path + "classifierFiles/Test-TfIdfFeatures-Clean-AllPoS.m";
		svm_model model = svm_predict_nofiles.parse_args_and_load_model(argumentString.split(" "));
		
		List<List<Double>> output_list = null;
		try {
			output_list = svm_predict_nofiles.predict(model, target_list, svm_node_list);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		previousTime = printTimeMessage(startTime, previousTime, instanceListSize(), 
//										"classification finished");

		classificationResults = new HashMap<String, String>();
		for (int index = 0; index < classificationInstanceList.size(); index++) {
			ClassificationInstance xmlItem = classificationInstanceList.get(index);
			List<Double> output = output_list.get(index);
			double prediction = output.get(0);
			if (classMapping.containsKey(prediction))
				classificationResults.put(xmlItem.getComposedId(), classMapping.get(prediction));
			else
				System.err.println("Irrecognisable classification output: " + prediction);
		}
		
//		previousTime = printTimeMessage(startTime, previousTime, instanceListSize(), 
//										"classification finished");
//		return previousTime;
	}

//	private long printTimeMessage(long startTime, long previousTime, int size, String message) {
//		long currentTime = System.currentTimeMillis();
//		System.err.println(time(currentTime - previousTime) + "\t" +
//						   time(currentTime - startTime) + "\t" +
//						   size + "\t" + message);
//		return currentTime;
//	}

//	private String time(long timeInMS) {
//		return DurationFormatUtils.formatDuration(timeInMS, "HH:mm:ss,SSS");
//	}

	private Map<Double, String> loadFromFile(String filename) {
        String path = getClass().getProtectionDomain().getCodeSource().getLocation().getFile();
        if (path.endsWith("bin/"))
        	path = path.substring(0, path.lastIndexOf("bin/"));
		File file = new File(path, filename);
		String content = null;
		try {
			content = readFileAsString(file);
		} catch (IOException e) {
			System.err.println("Unable to read file: " + filename);
			e.printStackTrace();
		}
		Map<Double, String> classMap = new HashMap<Double, String>();
		for (String line: content.split("\\n")) {
			String[] elements = line.split("\\t");
			double classNumber = Double.parseDouble(elements[0].trim());
			String classLabel = elements[1].trim();
			if (classLabel.length()>0)
				classMap .put(classNumber, classLabel);
		}
		return classMap;
	}

	private static String readFileAsString(File afile) throws java.io.IOException{
	    byte[] buffer = new byte[(int) afile.length()];
	    BufferedInputStream f = null;
	    try {
	        f = new BufferedInputStream(new FileInputStream(afile));
	        f.read(buffer);
	    } finally { 
	    	if (f != null) try { f.close(); } catch (IOException ignored) { }
	    }
	    return new String(buffer);
	}

}
