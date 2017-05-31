package me.corda616.races.blocks.crops;

import me.corda616.races.items.ItemInstances;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

/**
 * Created by Jazz616 on 2017-05-31.
 */
public class BlockCropCosmo extends BlockCrops {
        public BlockCropCosmo() {
            setUnlocalizedName("crop_cosmo");
            setRegistryName("crop_cosmo");
        }

        @Override
        protected Item getSeed() {
            return ItemInstances.cosmoSeed;
        }

        @Override
        protected Item getCrop() {
            return ItemInstances.cosmo;
        }

    }
