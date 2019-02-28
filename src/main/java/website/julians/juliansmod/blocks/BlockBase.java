package website.julians.juliansmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import website.julians.juliansmod.JuliansMod;
import website.julians.juliansmod.init.ModBlocks;
import website.julians.juliansmod.init.ModItems;
import website.julians.juliansmod.util.IHasModel;

public class BlockBase extends Block implements IHasModel
{
    public BlockBase(String name, Material material)
    {
        super(material);

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(getRegistryName()));
    }

    public void registerModels()
    {
        JuliansMod.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
