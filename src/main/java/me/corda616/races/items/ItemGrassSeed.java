package me.corda616.races.items;

import me.corda616.races.Main;
import me.corda616.races.blocks.BlockInstances;
import me.corda616.races.blocks.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;

/**
 * Created by CorDa616 on 5/30/2017.
 */
public class ItemGrassSeed extends ItemSeeds implements ItemModelProvider {
    public ItemGrassSeed() {
        super(BlockInstances.cropGrass, Blocks.FARMLAND);
        setUnlocalizedName("grass_seed");
        setRegistryName("grass_seed");
    }

    @Override
    public void registerItemModel(Item item) {
        Main.proxy.registerItemRenderer(item, 0, "grass_seed");
    }

}
