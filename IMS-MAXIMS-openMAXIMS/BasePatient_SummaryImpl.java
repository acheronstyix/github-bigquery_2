//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
//#                                                                           #
//#  This program is free software: you can redistribute it and/or modify     #
//#  it under the terms of the GNU Affero General Public License as           #
//#  published by the Free Software Foundation, either version 3 of the       #
//#  License, or (at your option) any later version.                          # 
//#                                                                           #
//#  This program is distributed in the hope that it will be useful,          #
//#  but WITHOUT ANY WARRANTY; without even the implied warranty of           #
//#  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the            #
//#  GNU Affero General Public License for more details.                      #
//#                                                                           #
//#  You should have received a copy of the GNU Affero General Public License #
//#  along with this program.  If not, see <http://www.gnu.org/licenses/>.    #
//#                                                                           #
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5589.25814)
// Copyright (C) 1995-2015 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.clinical.domain.base.impl;

import ims.domain.impl.DomainImpl;

public abstract class BasePatient_SummaryImpl extends DomainImpl implements ims.clinical.domain.Patient_Summary, ims.domain.impl.Transactional
{
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	public void validatelistCareSpellsByPatient(ims.core.patient.vo.PatientRefVo patientRefVo)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistProcedureByClinicalContact(ims.core.admin.vo.ClinicalContactRefVo clinicalContactRefVo)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistProcedureByPatient(ims.core.patient.vo.PatientRefVo patientRefVo)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistProblemsByClinicalContact(ims.core.admin.vo.ClinicalContactRefVo clinicalcontact)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistProblemsByPatient(ims.core.patient.vo.PatientRefVo patient)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistPatientComplications(ims.core.patient.vo.PatientRefVo patrefvo)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistPatientDiagnoses(ims.core.patient.vo.PatientRefVo patrefvo)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistContactComplications(ims.core.admin.vo.ClinicalContactRefVo clinicalcontactrefVo)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistContactDiagnoses(ims.core.admin.vo.ClinicalContactRefVo clinicalcontactrefVo)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistDiagnosisComplicationsContact(ims.core.admin.vo.ClinicalContactRefVo clinicalcontactrefVo)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistDiagnosisComplicationsPatient(ims.core.patient.vo.PatientRefVo patrefVo)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistClinicalDiAssociationByPatientDiagnosis(ims.core.clinical.vo.PatientDiagnosisRefVo voRefPatDiag)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistClinicalDiAssociationByPatientProcedure(ims.core.clinical.vo.PatientProcedureRefVo voRefPatProc)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistClinicalDiAssociationByPatientProblem(ims.core.clinical.vo.PatientProblemRefVo voRefPatProb)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistCareContextComplications(ims.core.admin.vo.CareContextRefVo careContextRefVo)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistCareContextDiagnoses(ims.core.admin.vo.CareContextRefVo careContextRefVo)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistEpisodeOfCareComplications(ims.core.admin.vo.EpisodeOfCareRefVo episodeOfCareRefVo)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistEpisodeOfCareDiagnoses(ims.core.admin.vo.EpisodeOfCareRefVo episodeOfCareRefVo)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistProblemsByCareContext(ims.core.admin.vo.CareContextRefVo careContextRefVo)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistProblemsByEpisodeOfCare(ims.core.admin.vo.EpisodeOfCareRefVo episodeOfCareRefVo)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistDiagnosisComplicationsCareContext(ims.core.admin.vo.CareContextRefVo careContextRefVo)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistDiagnosisComplicationEpisodeOfCare(ims.core.admin.vo.EpisodeOfCareRefVo episodeOfCareRefVo)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistDiagnosisComplicationCareSpell(ims.core.admin.vo.CareSpellRefVo careSpellRefVo)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistCareSpellDiagnoses(ims.core.admin.vo.CareSpellRefVo careSpellRefVo)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistCareSpellComplications(ims.core.admin.vo.CareSpellRefVo careSpellRefVo)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistProceduresByEpisodeOfCare(ims.core.admin.vo.EpisodeOfCareRefVo episodeOfCareRefVo)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistProceduresByCareSpell(ims.core.admin.vo.CareSpellRefVo careSpellRefVo)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistProceduresByCareContextPatientSummary(ims.core.admin.vo.CareContextRefVo careContextRefVo)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistProblemsByCareSpell(ims.core.admin.vo.CareSpellRefVo careSpellRefVo)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistClinicalContacts(ims.core.vo.ClinicalContactFilterVo filter, Boolean bOnlyRootClinicalContacts)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistClinicalContactsShort(ims.core.vo.PatientShort voPatientShort, ims.core.vo.ClinicalContactFilterVo voClinicalContactFilter, Boolean bOnlyRootClinicalContacts)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistProcedureByPatientAndStatus(ims.core.patient.vo.PatientRefVo patientRefVo, ims.core.vo.lookups.PatientProcedureStatus status)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistProcedureByClinicalContactAndStatus(ims.core.admin.vo.ClinicalContactRefVo clinicalContactRefVo, ims.core.vo.lookups.PatientProcedureStatus status)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistProceduresByCareContextPatientSummaryAndStatus(ims.core.admin.vo.CareContextRefVo careContextRefVo, ims.core.vo.lookups.PatientProcedureStatus status)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistProceduresByEpisodeOfCareAndStatus(ims.core.admin.vo.EpisodeOfCareRefVo episodeOfCareRefVo, ims.core.vo.lookups.PatientProcedureStatus status)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistProceduresByCareSpellAndStatus(ims.core.admin.vo.CareSpellRefVo careSpellRefVo, ims.core.vo.lookups.PatientProcedureStatus status)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistPrimaryDiagnosisAndProblems(ims.core.admin.vo.CareSpellRefVo careSpellRefVo)
	{
	}

	@SuppressWarnings("unused")
	public void validategetClinicalNotesForContact(ims.core.admin.vo.ClinicalContactRefVo clinicalContactRefId)
	{
	}

	@SuppressWarnings("unused")
	public void validategetClinicalNote(ims.core.clinical.vo.ClinicalNotesRefVo clinicalNoteRefVo)
	{
	}

	@SuppressWarnings("unused")
	public void validategetClinicalNotesShort(Integer id)
	{
	}

	@SuppressWarnings("unused")
	public void validaterecordReadAudit(ims.core.patient.vo.PatientRefVo patient)
	{
	}

	@SuppressWarnings("unused")
	public void validategetPASEvent(String eventID)
	{
	}

	@SuppressWarnings("unused")
	public void validategetWorklistContactTypeByExternalCode(ims.core.vo.lookups.ContactType contactType)
	{
	}

	@SuppressWarnings("unused")
	public void validategetServiceForEpisodeOfCareSpecialty(ims.core.admin.vo.EpisodeOfCareRefVo episodeOfCare)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistCareSpellsByPatientAndCriteria(ims.core.patient.vo.PatientRefVo patientRef, ims.framework.utils.Date dateFrom, ims.framework.utils.Date dateTo, Integer context, Boolean showCancelled)
	{
	}

	@SuppressWarnings("unused")
	public void validategetCareSpellById(ims.core.admin.vo.CareSpellRefVo careSpellRef)
	{
	}

	@SuppressWarnings("unused")
	public void validategetEpisodeOfCareShort(ims.core.admin.vo.EpisodeOfCareRefVo episodeRef)
	{
	}

	@SuppressWarnings("unused")
	public void validatesaveCareContext(ims.core.vo.CareContextVo careContext)
	{
	}

	@SuppressWarnings("unused")
	public void validatesaveClinicalContact(ims.core.vo.ClinicalContactShortVo clinicalContact)
	{
	}

	@SuppressWarnings("unused")
	public void validategetCareContextThatHasHistoryId(ims.core.admin.vo.CareContextRefVoCollection refVoColl)
	{
	}

	@SuppressWarnings("unused")
	public void validategetEpisodeOfCareIdThatHasHistory(ims.core.admin.vo.EpisodeOfCareRefVoCollection refVoColl)
	{
	}

	@SuppressWarnings("unused")
	public void validategetEpisodeOfCareWithHistory(ims.core.admin.vo.EpisodeOfCareRefVo refVo)
	{
	}

	@SuppressWarnings("unused")
	public void validategetCareContextWithHistory(ims.core.admin.vo.CareContextRefVo refVo)
	{
	}

	@SuppressWarnings("unused")
	public void validatesaveCareSpell(ims.core.vo.CareSpellVo careSpell)
	{
	}

	@SuppressWarnings("unused")
	public void validatesaveEpisodeOfCare(ims.core.vo.EpisodeofCareVo episodeOfCare)
	{
	}

	@SuppressWarnings("unused")
	public void validategetCareContextById(ims.core.admin.vo.CareContextRefVo careRef)
	{
	}

	@SuppressWarnings("unused")
	public void validategetEpisodeOfCare(ims.core.admin.vo.EpisodeOfCareRefVo episodeRef)
	{
	}

	@SuppressWarnings("unused")
	public void validategetPIDDiagnosisInfo(ims.core.admin.vo.CareContextRefVo careContextRefVo, ims.core.admin.vo.EpisodeOfCareRefVo episodeRefVo, ims.core.admin.vo.CareSpellRefVo careSpell)
	{
	}

	@SuppressWarnings("unused")
	public void validatehasActiveClinicalContacts(ims.core.admin.vo.CareContextRefVo careContext)
	{
	}

	@SuppressWarnings("unused")
	public void validatehasActiveCareContexts(ims.core.admin.vo.EpisodeOfCareRefVo episode)
	{
	}

	@SuppressWarnings("unused")
	public void validatehasActiveEpisodeOfCare(ims.core.admin.vo.CareSpellRefVo careSpell)
	{
	}
}
