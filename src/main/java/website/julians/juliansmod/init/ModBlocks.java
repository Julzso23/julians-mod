package website.julians.juliansmod.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import website.julians.juliansmod.blocks.BlockBase;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks
{
    public static List<Block> BLOCKS = new ArrayList<Block>();
    public static final Block GRINDSTONE = new BlockBase("grindstone_block", Material.IRON);
}
