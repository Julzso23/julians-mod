package website.julians.juliansmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockGrindstone extends BlockBase
{
    public BlockGrindstone(String name, Material material)
    {
        super(name, material);

        setSoundType(SoundType.STONE);
        setHardness(3.0F);
        setResistance(30.0F);
        setHarvestLevel("pickaxe", 1);
    }
}
