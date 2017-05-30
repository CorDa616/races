package me.corda616.races.blocks;

import me.corda616.races.items.ItemModelProvider;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.concurrent.BlockingDeque;

/**
 * Created by CorDa616 on 5/30/2017.
 */
public class ModBlocks {
    public static void init(){
        BlockInstances.soulLite = register(new BlockOre("soulLite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS));
        BlockInstances.elfMosiac = register(new BlockGlass("elfMosiac").setCreativeTab(CreativeTabs.BUILDING_BLOCKS));
        BlockInstances.cropGrass = register(new BlockCropGrass(),null);

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
