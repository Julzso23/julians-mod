package website.julians.juliansmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import website.julians.juliansmod.JuliansMod;
import website.julians.juliansmod.init.ModItems;
import website.julians.juliansmod.util.IHasModel;

public class ItemBase extends Item implements IHasModel
{
    public ItemBase(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        ModItems.ITEMS.add(this);
    }

    public void registerModels()
    {
        JuliansMod.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
