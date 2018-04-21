package admin.testmod.common.block;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

public class TestModBlocks
{
    public static Block blockTestOre = new BlockTestOre().setUnlocalizedName("testore");

    public static void init()
    {
        ForgeRegistries.BLOCKS.register(blockTestOre.setRegistryName("testore"));
        ForgeRegistries.ITEMS.register(new ItemBlock(blockTestOre).setRegistryName(blockTestOre.getRegistryName()));
        OreDictionary.registerOre("oreChromite", blockTestOre);
    }

    @SideOnly(Side.CLIENT)
    public static void clientInit()
    {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockTestOre), 0,
                new ModelResourceLocation(blockTestOre.getRegistryName(), "inventory"));
    }
}
