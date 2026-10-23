package com.axperty.stackedblocksfarmersdelight;

import com.axperty.stackedblocksfarmersdelight.registry.BlockRegistry;
import com.axperty.stackedblocksfarmersdelight.registry.CreativeTabRegistry;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(StackedBlocksFarmersDelight.MOD_ID)
public class StackedBlocksFarmersDelight {
    public static final String MOD_ID = "stackedblocksfarmersdelight";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public StackedBlocksFarmersDelight(IEventBus modBus) {
        BlockRegistry.register(modBus);
        CreativeTabRegistry.register(modBus);
        LOGGER.info("Stacked Blocks: Farmer's Delight loaded");
    }
}
