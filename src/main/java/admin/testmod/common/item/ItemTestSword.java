package admin.testmod.common.item;

import admin.testmod.common.creativetab.CreativeTabsTestMod;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ItemTestSword extends ItemSword
{
    public ItemTestSword()
    {
        super(EnumHelper.addToolMaterial("TEST", 4, 2000, 15.0F, 20.0F, 50));
        this.setCreativeTab(CreativeTabsTestMod.tabTestMod);
    }
}
