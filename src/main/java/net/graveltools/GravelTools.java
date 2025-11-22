package net.graveltools;

import net.fabricmc.api.ModInitializer;

import net.graveltools.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GravelTools implements ModInitializer {
	public static final String MOD_ID = "gravel-tools";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.initialize();
	}
}