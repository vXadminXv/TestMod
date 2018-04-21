package admin.testmod.client;

import admin.testmod.common.CommonProxy;
import admin.testmod.common.block.TestModBlocks;
import admin.testmod.common.item.TestModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
        super.preInit(event);
        TestModBlocks.clientInit();
        TestModItems.clientInit();
    }

    public void init(FMLInitializationEvent event)
    {
        super.init(event);
    }
}
