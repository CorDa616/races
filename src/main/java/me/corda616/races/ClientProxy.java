package me.corda616.races;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.item.Item;


/**
 * Created by CorDa616 on 5/28/2017.
 */
public class ClientProxy extends CommonProxy {

    public static void init(FMLInitializationEvent e){}
    public static void preInit(FMLPreInitializationEvent e){}
    public static void postInit(FMLPostInitializationEvent e){}

    @Override
    public void registerItemRenderer(Item item, int meta, String id){
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Main.MODID + ":" + id,"inventory"));
    }

}
