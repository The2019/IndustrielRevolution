package net.the2019.fabricmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.the2019.fabricmod.Fabricmod;

public class ModItemGroup {
    public static final ItemGroup METAL = FabricItemGroupBuilder.build(new Identifier(Fabricmod.MOD_ID, "metal"), () -> new ItemStack(ModItems.ELECTRUM_INGOT));
}
