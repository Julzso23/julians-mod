package website.julians.juliansmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import website.julians.juliansmod.proxy.CommonProxy;
import website.julians.juliansmod.util.Reference;

@Mod(
        modid = Reference.MOD_ID,
        name = Reference.NAME,
        version = Reference.VERSION,
        acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS
)
public class JuliansMod
{
    @Mod.Instance
    public static JuliansMod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event)
    {
    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event)
    {
    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event)
    {
    }
}