package me.corda616.races.blocks.crops;

import me.corda616.races.items.ItemInstances;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

/**
 * Created by Jazz616 on 2017-05-31.
 */
public class BlockCropRose extends BlockCrops{
    public BlockCropRose() {
        setUnlocalizedName("crop_rose");
        setRegistryName("crop_rose");
    }

    @Override
    protected Item getSeed() {
        return ItemInstances.roseSeed;
    }

    @Override
    protected Item getCrop() {
        return ItemInstances.rose;
    }

}
