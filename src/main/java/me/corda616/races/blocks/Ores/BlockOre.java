package me.corda616.races.blocks.Ores;

import me.corda616.races.blocks.BlockBase;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by CorDa616 on 5/30/2017.
 */
public class BlockOre extends BlockBase {

    public BlockOre(String name){
        super(Material.ROCK, name);

        setHardness(3f);
        setResistance(5f);
        setLightLevel(1f);

    }

    @Override
    public BlockOre setCreativeTab(CreativeTabs tab){
        super.setCreativeTab(tab);
        return this;
    }


}
