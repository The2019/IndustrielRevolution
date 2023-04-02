package net.the2019.fabricmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.the2019.fabricmod.Fabricmod;

public class ModItems {

    //Electrum Ingot
    public static final Item ELECTRUM_INGOT = registerItem("electrum_ingot", new Item(new FabricItemSettings().group(ModItemGroup.METAL)));

    //Redstone Infused Ingot
    public static final Item REDSTONE_INFUSED_INGOT = registerItem("redstone_infused_ingot", new Item(new FabricItemSettings().group(ModItemGroup.METAL)));

    //Uran Ingot
    public static final Item URAN_INGOT = registerItem("uran_ingot", new Item(new FabricItemSettings().group(ModItemGroup.METAL)));

    //Raw Uran
    public static final Item raw_uran = registerItem("raw_uran", new Item(new FabricItemSettings().group(ModItemGroup.METAL)));



    //All the Stuff for the Regestering of the Items
    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(Fabricmod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Fabricmod.LOGGER.info("Register Mod Items for" + Fabricmod.MOD_ID);
    }

}
