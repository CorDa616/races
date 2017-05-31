package me.corda616.races.blocks.crops;

import me.corda616.races.items.ItemInstances;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

/**
 * Created by Jazz616 on 2017-05-31.
 */
public class BlockCropHyacinth extends BlockCrops{
    public BlockCropHyacinth() {
        setUnlocalizedName("crop_hyacinth");
        setRegistryName("crop_hyacinth");
    }

    @Override
    protected Item getSeed() {
        return ItemInstances.hyacinthSeed;
    }

    @Override
    protected Item getCrop() {
        return ItemInstances.hyacinth;
    }

}
