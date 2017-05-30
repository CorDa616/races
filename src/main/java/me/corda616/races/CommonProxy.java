package me.corda616.races;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by CorDa616 on 5/28/2017.
 */
public class CommonProxy {
    public static void init(FMLInitializationEvent e){}
    public static void preInit(FMLPreInitializationEvent e){}
    public static void postInit(FMLPostInitializationEvent e){}
    public void registerItemRenderer(Item item, int meta, String id){}
}
