package me.corda616.races.blocks;

import me.corda616.races.items.ItemInstances;
import me.corda616.races.items.ModItems;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

/**
 * Created by CorDa616 on 5/30/2017.
 */
public class BlockCropGrass extends BlockCrops {
    public BlockCropGrass() {
        setUnlocalizedName("crop_grass");
        setRegistryName("crop_grass");
    }

    @Override
    protected Item getSeed() {
        return ItemInstances.grassSeed;
    }

    @Override
    protected Item getCrop() {
        return ItemInstances.grass;
    }

}
