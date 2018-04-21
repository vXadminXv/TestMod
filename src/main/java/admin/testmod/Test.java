package admin.testmod;

import admin.testmod.common.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Test.MODID, name = Test.NAME, version = Test.VERSION)
public class Test
{
    public static final String MODID = "testmod";
    public static final String NAME = "Test Mod";
    public static final String VERSION = "1.0.0";

    @SidedProxy(clientSide = "admin.testmod.client.ClientProxy",
            serverSide = "admin.testmod.common.CommonProxy")
    public static CommonProxy proxy;

    @Instance(MODID)
    public static Test instance;

    private Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    public Logger getLogger()
    {
        return logger;
    }
}
