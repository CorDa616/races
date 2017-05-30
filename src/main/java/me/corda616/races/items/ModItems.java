package me.corda616.races.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by CorDa616 on 5/28/2017.
 */
public class ModItems {



    public static void init(){
        //ELVES
            //WEAPONS
        ItemInstances.elfBow1 = register(new ItemBase("elfBow1").setCreativeTab(CreativeTabs.COMBAT));
            //SOULS
        ItemInstances.elfSoul = register(new ItemBase("elfSoul").setCreativeTab(CreativeTabs.MISC));
            //FOOD
        ItemInstances.laprasBread = register(new ItemBase("lapras").setCreativeTab(CreativeTabs.FOOD));

        //ORCS
            //SOULS
        ItemInstances.orcSoul = register(new ItemBase("orcSoul")).setCreativeTab(CreativeTabs.MISC);

        //HUMANS
            //SOULS
        ItemInstances.humanSoul = register((new ItemBase("humanSoul")).setCreativeTab(CreativeTabs.MISC));
        //ITEMS
        ItemInstances.ingotCopper = register(new ItemBase("ingotcopper").setCreativeTab(CreativeTabs.MATERIALS));
        ItemInstances.grassSeed = register(new ItemGrassSeed());
        ItemInstances.grass = register(new ItemBase("grass").setCreativeTab(CreativeTabs.FOOD));
    }

    private static <T extends Item> T register(T item){
        GameRegistry.register(item);
        if(item instanceof ItemModelProvider){
            ((ItemModelProvider)item).registerItemModel(item);
        }
        return item;
    }
}
