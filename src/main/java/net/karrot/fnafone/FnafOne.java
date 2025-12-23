package net.karrot.fnafone;

import net.fabricmc.api.ModInitializer;

import net.karrot.fnafone.block.ModBlocks;
import net.karrot.fnafone.item.ModItemGroups;
import net.karrot.fnafone.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//idfk, the thing?
public class FnafOne implements ModInitializer {
	public static final String MOD_ID = "fnaf-one";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}