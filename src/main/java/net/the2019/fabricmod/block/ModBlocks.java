package net.the2019.fabricmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.the2019.fabricmod.Fabricmod;
import net.the2019.fabricmod.item.ModItemGroup;

public class ModBlocks {

    //Electrum Block
    public static final Block ELECTRUM_BLOCK = registerBlock("electrum_block", new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.METAL);

    //Redstone Infused Block
    public static final Block REDSTONE_INFUSED_BLOCK = registerBlock("redstone_infused_block", new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.METAL);

    //Uran Block
    public static final Block URAN_BLOCK = registerBlock("uran_block", new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.METAL);

    // Uran Ore
    public static final Block URAN_ORE = registerBlock("uran_ore", new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.METAL);


    //All the Stuff for the Regestering of the BLocks
    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(Fabricmod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(Fabricmod.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlock(){
        Fabricmod.LOGGER.info("Registering ModBlock for" + Fabricmod.MOD_ID);
    }


}
