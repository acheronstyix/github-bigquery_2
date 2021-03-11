/*
 * Copyright � 2014 - 2015 | Alexander01998 | All rights reserved.
 * 
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package tk.wurst_client.mods;

import java.util.HashSet;

import tk.wurst_client.WurstClient;
import tk.wurst_client.mods.Mod.Category;
import tk.wurst_client.mods.Mod.Info;

@Info(category = Category.MISC,
	description = "Makes other mods bypass NoCheat+ or blocks them if\n"
		+ "they can't.",
	name = "YesCheat+")
public class YesCheatMod extends Mod
{
	private HashSet<Mod> blockedMods;
	
	@Override
	public void onEnable()
	{
		if(blockedMods == null)
		{
			blockedMods = new HashSet<>();
			for(Mod mod : WurstClient.INSTANCE.modManager.getAllMods())
				if(!mod.getClass().getAnnotation(Mod.Info.class)
					.noCheatCompatible())
					blockedMods.add(mod);
		}
		for(Mod mod : blockedMods)
			mod.setBlocked(true);
	}
	
	@Override
	public void onDisable()
	{
		for(Mod mod : blockedMods)
			mod.setBlocked(false);
	}
}
