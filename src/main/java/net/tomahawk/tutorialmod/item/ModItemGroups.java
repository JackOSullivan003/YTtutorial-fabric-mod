package net.tomahawk.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.tomahawk.tutorialmod.TutorialMod;
import net.tomahawk.tutorialmod.block.ModBlocks;

public class ModItemGroups {

    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering Item Groups for " + TutorialMod.MOD_ID);

        Registry.register(Registries.ITEM_GROUP, new Identifier(TutorialMod.MOD_ID, "moditems"),
                FabricItemGroup.builder().displayName(Text.translatable("itemgroup.moditems"))
                        .icon(() -> new ItemStack(ModItems.METALDETECT)).entries((displayContext, entries) -> {
                            entries.add(ModItems.METALDETECT);
                            entries.add(ModItems.MOSS);
                        }).build());

        Registry.register(Registries.ITEM_GROUP, new Identifier(TutorialMod.MOD_ID, "modblocks"),
                FabricItemGroup.builder().displayName(Text.translatable("itemgroup.modblocks"))
                        .icon(() -> new ItemStack(Items.OAK_PLANKS)).entries((displayContext, entries) -> entries.add(ModBlocks.MOSSYPLANKS)).build());

        Registry.register(Registries.ITEM_GROUP, new Identifier(TutorialMod.MOD_ID, "modfood"),
                FabricItemGroup.builder().displayName(Text.translatable("itemgroup.modfood"))
                        .icon(() -> new ItemStack(Items.BREAD)).entries((displayContext, entries) -> {
                            entries.add(ModItems.HAM_AND_CHEESE);
                            entries.add(ModItems.CHEESESLICE);
                            entries.add(ModItems.CHEESEWEDGE);
                            entries.add(ModItems.HAMSLICE);
                        }).build());

        Registry.register(Registries.ITEM_GROUP, new Identifier(TutorialMod.MOD_ID, "modcombat"),
                FabricItemGroup.builder().displayName(Text.translatable("itemgroup.modcombat"))
                        .icon(() -> new ItemStack(ModItems.COPPER_SWORD)).entries((displayContext, entries) -> {
                            entries.add(ModItems.COPPER_SWORD);
                            entries.add(ModItems.COPPER_AXE);
                            entries.add(ModItems.COPPER_HELMET);
                            entries.add(ModItems.COPPER_CHESTPLATE);
                            entries.add(ModItems.COPPER_LEGGINGS);
                            entries.add(ModItems.COPPER_BOOTS);
                            entries.add(ModItems.TNT_BOW);
                            entries.add(ModItems.WATER_BOW);
                            entries.add(ModItems.EXPLOSION_BOW);
                            entries.add(ModItems.MOLTEN_BOW);
                            entries.add(ModItems.ABILITY_ARROW);


                        }).build());
        Registry.register(Registries.ITEM_GROUP, new Identifier(TutorialMod.MOD_ID, "modtools"),
                FabricItemGroup.builder().displayName(Text.translatable("itemgroup.modtools"))
                        .icon(() -> new ItemStack(ModItems.COPPER_PICKAXE)).entries((displayContext, entries) -> {
                            entries.add(ModItems.COPPER_PICKAXE);
                            entries.add(ModItems.COPPER_SHOVEL);
                            entries.add(ModItems.COPPER_AXE);
                            entries.add(ModItems.COPPER_HOE);

                        }).build());
    }
}
