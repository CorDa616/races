package me.corda616.races.blocks;

import me.corda616.races.blocks.Ores.BlockOre;
import me.corda616.races.blocks.crops.BlockCropCosmo;
import me.corda616.races.blocks.crops.BlockCropGrass;
import me.corda616.races.blocks.crops.BlockCropHyacinth;
import me.corda616.races.items.ItemModelProvider;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by CorDa616 on 5/30/2017.
 */
public class ModBlocks {
    public static void init(){
        BlockInstances.soulLite = register(new BlockOre("soulLite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS));
        BlockInstances.cropGrass = register(new BlockCropGrass(),null);
        BlockInstances.crophyacinth = register(new BlockCropHyacinth(),null);
        BlockInstances.cropCosmo = register(new BlockCropCosmo(),null);

    }

    private static <T extends Block> T register(T block, ItemBlock itemBlock) {
        GameRegistry.register(block);
        if(itemBlock != null) {
            GameRegistry.register(itemBlock);

            if (block instanceof ItemModelProvider) {
                ((ItemModelProvider) block).registerItemModel(itemBlock);
            }
        }
            return block;

    }

    private static <T extends Block> T register(T block) {
        ItemBlock itemBlock = new ItemBlock(block);
        itemBlock.setRegistryName(block.getRegistryName());
        return register(block, itemBlock);
    }
}
