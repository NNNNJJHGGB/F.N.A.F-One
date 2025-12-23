package net.karrot.fnafone.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.karrot.fnafone.FnafOne;
import net.karrot.fnafone.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup FNAF_ONE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(FnafOne.MOD_ID, "fnaf_one_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PINK_GARNET))
                    .displayName(Text.translatable("itemgroup.fnaf-one.fnaf_one_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModItems.RAW_PINK_GARNET);
                    }).build());


    public static final ItemGroup FNAF_ONE_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(FnafOne.MOD_ID, "fnaf_one_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.PINK_GARNET_BLOCK))
                    .displayName(Text.translatable("itemgroup.fnaf-one.fnaf_one_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
                    }).build());



    public static void registerItemGroups() {
        FnafOne.LOGGER.info("Registering Item Groups for " + FnafOne.MOD_ID);
    }
}
