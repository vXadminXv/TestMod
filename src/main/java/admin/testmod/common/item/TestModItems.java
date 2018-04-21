package admin.testmod.common.item;

import admin.testmod.common.block.TestModBlocks;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

public class TestModItems
{
    public static Item itemTestSword = new ItemTestSword().setUnlocalizedName("testSword");
    public static Item itemTestIngot = new ItemTestIngot().setUnlocalizedName("testIngot");

    public static void init()
    {
        ForgeRegistries.ITEMS.register(itemTestSword.setRegistryName("test_sword"));

        ForgeRegistries.ITEMS.register(itemTestIngot.setRegistryName("test_ingot"));
        OreDictionary.registerOre("ingotTest", itemTestIngot);
    }

    @SideOnly(Side.CLIENT)
    public static void clientInit()
    {
        ModelLoader.setCustomModelResourceLocation(itemTestSword, 0,
                new ModelResourceLocation(itemTestSword.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(itemTestIngot, 0,
                new ModelResourceLocation(itemTestIngot.getRegistryName(), "inventory"));
    }

    public static void addSmelting()
    {
        GameRegistry.addSmelting(TestModBlocks.blockTestOre, new ItemStack(itemTestIngot), 0.5f);
    }
}
