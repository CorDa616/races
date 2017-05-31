package me.corda616.races.items.crops;

import me.corda616.races.Main;
import me.corda616.races.blocks.BlockInstances;
import me.corda616.races.items.ItemModelProvider;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;

/**
 * Created by Jazz616 on 2017-05-31.
 */
public class ItemCosmoSeed extends ItemSeeds implements ItemModelProvider {
    public ItemCosmoSeed() {
        super(BlockInstances.cropCosmo, Blocks.FARMLAND);
        setUnlocalizedName("cosmo_seed");
        setRegistryName("cosmo_seed");
    }

    @Override
    public void registerItemModel(Item item) {
        Main.proxy.registerItemRenderer(item, 0, "cosmo_seed");
    }
}
