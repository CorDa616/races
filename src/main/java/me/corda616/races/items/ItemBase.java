package me.corda616.races.items;

import me.corda616.races.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by CorDa616 on 5/28/2017.
 */
public class ItemBase extends Item implements ItemModelProvider {
    protected String name;

    public ItemBase(String name){
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);

    }

    @Override
    public void registerItemModel(Item item){
        Main.proxy.registerItemRenderer(item, 0, name);
    }

    @Override
    public ItemBase setCreativeTab(CreativeTabs tab){
        super.setCreativeTab(tab);
        return this;
    }

}
