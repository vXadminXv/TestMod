package admin.testmod.common.creativetab;

import admin.testmod.common.item.TestModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabsTestMod extends CreativeTabs
{
    public static CreativeTabsTestMod tabTestMod = new CreativeTabsTestMod();

    public CreativeTabsTestMod()
    {
        super("testmod");
    }

    public ItemStack getTabIconItem()
    {
        return new ItemStack(TestModItems.itemTestSword);
    }
}
