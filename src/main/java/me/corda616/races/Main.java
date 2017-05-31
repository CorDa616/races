package me.corda616.races;

import me.corda616.races.proxies.CommonProxy;
import me.corda616.races.blocks.ModBlocks;
import me.corda616.races.items.ModItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by CorDa616 on 5/28/2017.
 */
@Mod(modid =  Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main {
    @SidedProxy(serverSide = "me.corda616.races.proxies.CommonProxy", clientSide = "me.corda616.races.proxies.ClientProxy")
    public static CommonProxy proxy;
    public static final String MODID = "races";
    public static final String MODNAME =   "Races";
    public static final String VERSION = "1";

    @Mod.Instance(MODID)
    public static Main instance;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent e){
        ModBlocks.init();
        ModItems.init();


    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent e){}

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent e){}


}
