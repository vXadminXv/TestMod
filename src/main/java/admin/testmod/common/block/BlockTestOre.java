package admin.testmod.common.block;

import admin.testmod.common.creativetab.CreativeTabsTestMod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockTestOre extends Block
{
    public BlockTestOre()
    {
        super(Material.ROCK);
        this.setSoundType(SoundType.STONE);
        this.setHardness(50.0f);
        this.setHarvestLevel("pickaxe", 2);
        this.setCreativeTab(CreativeTabsTestMod.tabTestMod);
    }
}
