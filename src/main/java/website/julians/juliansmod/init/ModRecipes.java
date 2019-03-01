package website.julians.juliansmod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistryModifiable;

@Mod.EventBusSubscriber
public class ModRecipes
{
    public static void init()
    {
        GameRegistry.addSmelting(ModItems.DOUGH, new ItemStack(Items.BREAD, 1), 100F);
    }

    @SubscribeEvent
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event)
    {
        ResourceLocation location = new ResourceLocation("minecraft:bread");
        ((IForgeRegistryModifiable)event.getRegistry()).remove(location);
    }
}
