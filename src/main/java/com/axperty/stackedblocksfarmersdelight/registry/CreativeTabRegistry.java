package com.axperty.stackedblocksfarmersdelight.registry;

import com.axperty.stackedblocksfarmersdelight.StackedBlocksFarmersDelight;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CreativeTabRegistry {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StackedBlocksFarmersDelight.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> STACKEDBLOCKSFARMERSDELIGHT_ITEMGROUP = TABS.register("stackedblocksfarmersdelight_itemgroup",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.stackedblocksfarmersdelight"))
                    .icon(() -> new ItemStack(BlockRegistry.STACKED_RICH_SOIL))
                    .displayItems((displayContext, entries) -> {

                        entries.accept(BlockRegistry.STACKED_RICH_SOIL);
                        entries.accept(BlockRegistry.STACKED_STONE_BLOCKS);
                        entries.accept(BlockRegistry.STACKED_COBBLESTONE_BLOCKS);
                        entries.accept(BlockRegistry.STACKED_NETHERRACK_BLOCKS);
                        entries.accept(BlockRegistry.STACKED_BRICKS);
                        entries.accept(BlockRegistry.STACKED_RESIN_BLOCKS);
                        entries.accept(BlockRegistry.STACKED_RESIN_BRICKS);
                        entries.accept(BlockRegistry.STACKED_MELONS);
                        entries.accept(BlockRegistry.STACKED_PUMPKINS);

                        entries.accept(BlockRegistry.STACKED_RAW_IRON_BLOCKS);
                        entries.accept(BlockRegistry.STACKED_RAW_GOLD_BLOCKS);
                        entries.accept(BlockRegistry.STACKED_RAW_COPPER_BLOCKS);

                        entries.accept(BlockRegistry.STACKED_LAPIS_BLOCKS);
                        entries.accept(BlockRegistry.STACKED_REDSTONE_BLOCKS);
                        entries.accept(BlockRegistry.STACKED_COAL_BLOCKS);
                        entries.accept(BlockRegistry.STACKED_IRON_BLOCKS);
                        entries.accept(BlockRegistry.STACKED_GOLD_BLOCKS);
                        entries.accept(BlockRegistry.STACKED_EMERALD_BLOCKS);
                        entries.accept(BlockRegistry.STACKED_DIAMOND_BLOCKS);
                        entries.accept(BlockRegistry.STACKED_NETHERITE_BLOCKS);
                        entries.accept(BlockRegistry.STACKED_QUARTZ_BLOCKS);

                        entries.accept(BlockRegistry.STACKED_OAK_LOGS);
                        entries.accept(BlockRegistry.STACKED_STRIPPED_OAK_LOGS);
                        entries.accept(BlockRegistry.STACKED_OAK_PLANKS);

                        entries.accept(BlockRegistry.STACKED_SPRUCE_LOGS);
                        entries.accept(BlockRegistry.STACKED_STRIPPED_SPRUCE_LOGS);
                        entries.accept(BlockRegistry.STACKED_SPRUCE_PLANKS);

                        entries.accept(BlockRegistry.STACKED_BIRCH_LOGS);
                        entries.accept(BlockRegistry.STACKED_STRIPPED_BIRCH_LOGS);
                        entries.accept(BlockRegistry.STACKED_BIRCH_PLANKS);

                        entries.accept(BlockRegistry.STACKED_JUNGLE_LOGS);
                        entries.accept(BlockRegistry.STACKED_STRIPPED_JUNGLE_LOGS);
                        entries.accept(BlockRegistry.STACKED_JUNGLE_PLANKS);

                        entries.accept(BlockRegistry.STACKED_ACACIA_LOGS);
                        entries.accept(BlockRegistry.STACKED_STRIPPED_ACACIA_LOGS);
                        entries.accept(BlockRegistry.STACKED_ACACIA_PLANKS);

                        entries.accept(BlockRegistry.STACKED_DARK_OAK_LOGS);
                        entries.accept(BlockRegistry.STACKED_STRIPPED_DARK_OAK_LOGS);
                        entries.accept(BlockRegistry.STACKED_DARK_OAK_PLANKS);

                        entries.accept(BlockRegistry.STACKED_MANGROVE_LOGS);
                        entries.accept(BlockRegistry.STACKED_STRIPPED_MANGROVE_LOGS);
                        entries.accept(BlockRegistry.STACKED_MANGROVE_PLANKS);

                        entries.accept(BlockRegistry.STACKED_CHERRY_LOGS);
                        entries.accept(BlockRegistry.STACKED_STRIPPED_CHERRY_LOGS);
                        entries.accept(BlockRegistry.STACKED_CHERRY_PLANKS);

                        entries.accept(BlockRegistry.STACKED_PALE_OAK_LOGS);
                        entries.accept(BlockRegistry.STACKED_STRIPPED_PALE_OAK_LOGS);
                        entries.accept(BlockRegistry.STACKED_PALE_OAK_PLANKS);

                        entries.accept(BlockRegistry.STACKED_BAMBOO_BLOCKS);
                        entries.accept(BlockRegistry.STACKED_STRIPPED_BAMBOO_BLOCKS);
                        entries.accept(BlockRegistry.STACKED_BAMBOO_PLANKS);

                        entries.accept(BlockRegistry.STACKED_CRIMSON_STEMS);
                        entries.accept(BlockRegistry.STACKED_STRIPPED_CRIMSON_STEMS);
                        entries.accept(BlockRegistry.STACKED_CRIMSON_PLANKS);

                        entries.accept(BlockRegistry.STACKED_WARPED_STEMS);
                        entries.accept(BlockRegistry.STACKED_STRIPPED_WARPED_STEMS);
                        entries.accept(BlockRegistry.STACKED_WARPED_PLANKS);
                    })
                    .build());

    public static void register(IEventBus modBus) {
        TABS.register(modBus);
    }
}
