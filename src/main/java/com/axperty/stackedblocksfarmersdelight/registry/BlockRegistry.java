package com.axperty.stackedblocksfarmersdelight.registry;

import com.axperty.stackedblocksfarmersdelight.StackedBlocksFarmersDelight;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class BlockRegistry {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(StackedBlocksFarmersDelight.MOD_ID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(StackedBlocksFarmersDelight.MOD_ID);

    // Stacked Rich Soil
    public static final DeferredBlock<Block> STACKED_RICH_SOIL = registerBlock("stacked_rich_soil", () -> Block.Properties.ofFullCopy(Blocks.DIRT));

    // Stacked Stone Blocks
    public static final DeferredBlock<Block> STACKED_STONE_BLOCKS = registerBlock("stacked_stone_blocks", () -> Block.Properties.ofFullCopy(Blocks.STONE));

    // Stacked Cobblestone Blocks
    public static final DeferredBlock<Block> STACKED_COBBLESTONE_BLOCKS = registerBlock("stacked_cobblestone_blocks", () -> Block.Properties.ofFullCopy(Blocks.COBBLESTONE));

    // Stacked Netherrack Blocks
    public static final DeferredBlock<Block> STACKED_NETHERRACK_BLOCKS = registerBlock("stacked_netherrack_blocks", () -> Block.Properties.ofFullCopy(Blocks.NETHERRACK));

    // Stacked Bricks
    public static final DeferredBlock<Block> STACKED_BRICKS = registerBlock("stacked_bricks", () -> Block.Properties.ofFullCopy(Blocks.BRICKS));

    // Stacked Resin Blocks
    public static final DeferredBlock<Block> STACKED_RESIN_BLOCKS = registerBlock("stacked_resin_blocks", () -> Block.Properties.ofFullCopy(Blocks.RESIN_BLOCK));

    // Stacked Resin Bricks
    public static final DeferredBlock<Block> STACKED_RESIN_BRICKS = registerBlock("stacked_resin_bricks", () -> Block.Properties.ofFullCopy(Blocks.RESIN_BRICKS));

    // Stacked Raw Iron Blocks
    public static final DeferredBlock<Block> STACKED_RAW_IRON_BLOCKS = registerBlock("stacked_raw_iron_blocks", () -> Block.Properties.ofFullCopy(Blocks.RAW_IRON_BLOCK));

    // Stacked Raw Gold Blocks
    public static final DeferredBlock<Block> STACKED_RAW_GOLD_BLOCKS = registerBlock("stacked_raw_gold_blocks", () -> Block.Properties.ofFullCopy(Blocks.RAW_GOLD_BLOCK));

    // Stacked Raw Copper Blocks
    public static final DeferredBlock<Block> STACKED_RAW_COPPER_BLOCKS = registerBlock("stacked_raw_copper_blocks", () -> Block.Properties.ofFullCopy(Blocks.RAW_COPPER_BLOCK));

    // Stacked Lapis Blocks
    public static final DeferredBlock<Block> STACKED_LAPIS_BLOCKS = registerBlock("stacked_lapis_blocks", () -> Block.Properties.ofFullCopy(Blocks.LAPIS_BLOCK));

    // Stacked Redstone Blocks
    public static final DeferredBlock<Block> STACKED_REDSTONE_BLOCKS = registerBlock("stacked_redstone_blocks", () -> Block.Properties.ofFullCopy(Blocks.REDSTONE_BLOCK));

    // Stacked Coal Blocks
    public static final DeferredBlock<Block> STACKED_COAL_BLOCKS = registerBlock("stacked_coal_blocks", () -> Block.Properties.ofFullCopy(Blocks.COAL_BLOCK));

    // Stacked Iron Blocks
    public static final DeferredBlock<Block> STACKED_IRON_BLOCKS = registerBlock("stacked_iron_blocks", () -> Block.Properties.ofFullCopy(Blocks.IRON_BLOCK));

    // Stacked Gold Blocks
    public static final DeferredBlock<Block> STACKED_GOLD_BLOCKS = registerBlock("stacked_gold_blocks", () -> Block.Properties.ofFullCopy(Blocks.GOLD_BLOCK));

    // Stacked Emerald Blocks
    public static final DeferredBlock<Block> STACKED_EMERALD_BLOCKS = registerBlock("stacked_emerald_blocks", () -> Block.Properties.ofFullCopy(Blocks.EMERALD_BLOCK));

    // Stacked Diamond Blocks
    public static final DeferredBlock<Block> STACKED_DIAMOND_BLOCKS = registerBlock("stacked_diamond_blocks", () -> Block.Properties.ofFullCopy(Blocks.DIAMOND_BLOCK));

    // Stacked Netherite Blocks
    public static final DeferredBlock<Block> STACKED_NETHERITE_BLOCKS = registerBlock("stacked_netherite_blocks", () -> Block.Properties.ofFullCopy(Blocks.NETHERITE_BLOCK));

    // Stacked Quartz Blocks
    public static final DeferredBlock<Block> STACKED_QUARTZ_BLOCKS = registerBlock("stacked_quartz_blocks", () -> Block.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK));

    // Stacked Melons
    public static final DeferredBlock<Block> STACKED_MELONS = registerBlock("stacked_melons", () -> Block.Properties.ofFullCopy(Blocks.MELON));

    // Stacked Pumpkins
    public static final DeferredBlock<Block> STACKED_PUMPKINS = registerBlock("stacked_pumpkins", () -> Block.Properties.ofFullCopy(Blocks.PUMPKIN));

    // Stacked Oak Logs
    public static final DeferredBlock<Block> STACKED_OAK_LOGS = registerBlock("stacked_oak_logs", () -> Block.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    // Stacked Stripped Oak Logs
    public static final DeferredBlock<Block> STACKED_STRIPPED_OAK_LOGS = registerBlock("stacked_stripped_oak_logs", () -> Block.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    // Stacked Oak Planks
    public static final DeferredBlock<Block> STACKED_OAK_PLANKS = registerBlock("stacked_oak_planks", () -> Block.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    // Stacked Spruce Logs
    public static final DeferredBlock<Block> STACKED_SPRUCE_LOGS = registerBlock("stacked_spruce_logs", () -> Block.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS));

    // Stacked Stripped Spruce Logs
    public static final DeferredBlock<Block> STACKED_STRIPPED_SPRUCE_LOGS = registerBlock("stacked_stripped_spruce_logs", () -> Block.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS));

    // Stacked Spruce Planks
    public static final DeferredBlock<Block> STACKED_SPRUCE_PLANKS = registerBlock("stacked_spruce_planks", () -> Block.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS));

    // Stacked Birch Logs
    public static final DeferredBlock<Block> STACKED_BIRCH_LOGS = registerBlock("stacked_birch_logs", () -> Block.Properties.ofFullCopy(Blocks.BIRCH_PLANKS));

    // Stacked Stripped Birch Logs
    public static final DeferredBlock<Block> STACKED_STRIPPED_BIRCH_LOGS = registerBlock("stacked_stripped_birch_logs", () -> Block.Properties.ofFullCopy(Blocks.BIRCH_PLANKS));

    // Stacked Birch Planks
    public static final DeferredBlock<Block> STACKED_BIRCH_PLANKS = registerBlock("stacked_birch_planks", () -> Block.Properties.ofFullCopy(Blocks.BIRCH_PLANKS));

    // Stacked Jungle Logs
    public static final DeferredBlock<Block> STACKED_JUNGLE_LOGS = registerBlock("stacked_jungle_logs", () -> Block.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS));

    // Stacked Stripped Jungle Logs
    public static final DeferredBlock<Block> STACKED_STRIPPED_JUNGLE_LOGS = registerBlock("stacked_stripped_jungle_logs", () -> Block.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS));

    // Stacked Jungle Planks
    public static final DeferredBlock<Block> STACKED_JUNGLE_PLANKS = registerBlock("stacked_jungle_planks", () -> Block.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS));

    // Stacked Acacia Logs
    public static final DeferredBlock<Block> STACKED_ACACIA_LOGS = registerBlock("stacked_acacia_logs", () -> Block.Properties.ofFullCopy(Blocks.ACACIA_PLANKS));

    // Stacked Stripped Acacia Logs
    public static final DeferredBlock<Block> STACKED_STRIPPED_ACACIA_LOGS = registerBlock("stacked_stripped_acacia_logs", () -> Block.Properties.ofFullCopy(Blocks.ACACIA_PLANKS));

    // Stacked Acacia Planks
    public static final DeferredBlock<Block> STACKED_ACACIA_PLANKS = registerBlock("stacked_acacia_planks", () -> Block.Properties.ofFullCopy(Blocks.ACACIA_PLANKS));

    // Stacked Dark Oak Logs
    public static final DeferredBlock<Block> STACKED_DARK_OAK_LOGS = registerBlock("stacked_dark_oak_logs", () -> Block.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS));

    // Stacked Stripped Dark Oak Logs
    public static final DeferredBlock<Block> STACKED_STRIPPED_DARK_OAK_LOGS = registerBlock("stacked_stripped_dark_oak_logs", () -> Block.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS));

    // Stacked Dark Oak Planks
    public static final DeferredBlock<Block> STACKED_DARK_OAK_PLANKS = registerBlock("stacked_dark_oak_planks", () -> Block.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS));

    // Stacked Mangrove Logs
    public static final DeferredBlock<Block> STACKED_MANGROVE_LOGS = registerBlock("stacked_mangrove_logs", () -> Block.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS));

    // Stacked Stripped Mangrove Logs
    public static final DeferredBlock<Block> STACKED_STRIPPED_MANGROVE_LOGS = registerBlock("stacked_stripped_mangrove_logs", () -> Block.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS));

    // Stacked Mangrove Planks
    public static final DeferredBlock<Block> STACKED_MANGROVE_PLANKS = registerBlock("stacked_mangrove_planks", () -> Block.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS));

    // Stacked Cherry Logs
    public static final DeferredBlock<Block> STACKED_CHERRY_LOGS = registerBlock("stacked_cherry_logs", () -> Block.Properties.ofFullCopy(Blocks.CHERRY_PLANKS));

    // Stacked Stripped Cherry Logs
    public static final DeferredBlock<Block> STACKED_STRIPPED_CHERRY_LOGS = registerBlock("stacked_stripped_cherry_logs", () -> Block.Properties.ofFullCopy(Blocks.CHERRY_PLANKS));

    // Stacked Cherry Planks
    public static final DeferredBlock<Block> STACKED_CHERRY_PLANKS = registerBlock("stacked_cherry_planks", () -> Block.Properties.ofFullCopy(Blocks.CHERRY_PLANKS));

    // Stacked Pale Oak Logs
    public static final DeferredBlock<Block> STACKED_PALE_OAK_LOGS = registerBlock("stacked_pale_oak_logs", () -> Block.Properties.ofFullCopy(Blocks.PALE_OAK_PLANKS));

    // Stacked Stripped Pale Oak Logs
    public static final DeferredBlock<Block> STACKED_STRIPPED_PALE_OAK_LOGS = registerBlock("stacked_stripped_pale_oak_logs", () -> Block.Properties.ofFullCopy(Blocks.PALE_OAK_PLANKS));

    // Stacked Pale Oak Planks
    public static final DeferredBlock<Block> STACKED_PALE_OAK_PLANKS = registerBlock("stacked_pale_oak_planks", () -> Block.Properties.ofFullCopy(Blocks.PALE_OAK_PLANKS));

    // Stacked Bamboo Blocks
    public static final DeferredBlock<Block> STACKED_BAMBOO_BLOCKS = registerBlock("stacked_bamboo_blocks", () -> Block.Properties.ofFullCopy(Blocks.BAMBOO_PLANKS));

    // Stacked Stripped Bamboo Blocks
    public static final DeferredBlock<Block> STACKED_STRIPPED_BAMBOO_BLOCKS = registerBlock("stacked_stripped_bamboo_blocks", () -> Block.Properties.ofFullCopy(Blocks.BAMBOO_PLANKS));

    // Stacked Bamboo Planks
    public static final DeferredBlock<Block> STACKED_BAMBOO_PLANKS = registerBlock("stacked_bamboo_planks", () -> Block.Properties.ofFullCopy(Blocks.BAMBOO_PLANKS));

    // Stacked Crimson Logs
    public static final DeferredBlock<Block> STACKED_CRIMSON_STEMS = registerBlock("stacked_crimson_stems", () -> Block.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS));

    // Stacked Stripped Crimson Logs
    public static final DeferredBlock<Block> STACKED_STRIPPED_CRIMSON_STEMS = registerBlock("stacked_stripped_crimson_stems", () -> Block.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS));

    // Stacked Crimson Planks
    public static final DeferredBlock<Block> STACKED_CRIMSON_PLANKS = registerBlock("stacked_crimson_planks", () -> Block.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS));

    // Stacked Warped Logs
    public static final DeferredBlock<Block> STACKED_WARPED_STEMS = registerBlock("stacked_warped_stems", () -> Block.Properties.ofFullCopy(Blocks.WARPED_PLANKS));

    // Stacked Stripped Warped Logs
    public static final DeferredBlock<Block> STACKED_STRIPPED_WARPED_STEMS = registerBlock("stacked_stripped_warped_stems", () -> Block.Properties.ofFullCopy(Blocks.WARPED_PLANKS));

    // Stacked Warped Planks
    public static final DeferredBlock<Block> STACKED_WARPED_PLANKS = registerBlock("stacked_warped_planks", () -> Block.Properties.ofFullCopy(Blocks.WARPED_PLANKS));

    private static DeferredBlock<Block> registerBlock(String path, Supplier<BlockBehaviour.Properties> properties) {
        DeferredBlock<Block> block = BLOCKS.registerSimpleBlock(path, properties);
        ITEMS.registerSimpleBlockItem(block);
        return block;
    }

    public static void register(IEventBus modBus) {
        BLOCKS.register(modBus);
        ITEMS.register(modBus);
    }
}
