package admin.testmod.common;

import admin.testmod.common.block.TestModBlocks;
import admin.testmod.common.item.TestModItems;
import admin.testmod.common.world.gen.OreGenEventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
        TestModItems.init();
        TestModBlocks.init();
    }

    public void init(FMLInitializationEvent event)
    {
        TestModItems.addSmelting();
        OreGenEventHandler.init();
    }
}
