package net.the2019.fabricmod;

import net.fabricmc.api.ModInitializer;
import net.the2019.fabricmod.block.ModBlocks;
import net.the2019.fabricmod.item.ModItems;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Fabricmod implements ModInitializer {

    public static final String MOD_ID = "fabricmod";

    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    @Override
    public void onInitialize() {

        ModItems.registerModItems();
        ModBlocks.registerModBlock();

    }
}
