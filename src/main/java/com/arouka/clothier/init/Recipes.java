package com.arouka.clothier.init;


import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Recipes
{
    public static void init()
    {
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.toughLamp), " b ", "bgb", " b ", 'b', new ItemStack(Blocks.iron_bars), 'g', "glowstone"));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.soap), "ss ", "ss ", "   ", 's', new ItemStack(ModItems.soapBar));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.man), " w ", " w ", "sss", 'w', "plankWood", 's', new ItemStack(Blocks.stone_slab)));

        //Possible TO-DO: Add OreDict support for other blue dyes
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.pattern, 1, 0), "sps", "ppp", "sbs", 's', "stickWood", 'p', new ItemStack(Items.paper), 'b' , new ItemStack(Items.dye, 1, 4)));

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.pattern, 1, 1), new ItemStack(ModItems.pattern, 1, 0), new ItemStack(Items.golden_helmet));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.pattern, 1, 2), new ItemStack(ModItems.pattern, 1, 0), new ItemStack(Items.golden_chestplate));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.pattern, 1, 3), new ItemStack(ModItems.pattern, 1, 0), new ItemStack(Items.golden_leggings));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.pattern, 1, 4), new ItemStack(ModItems.pattern, 1, 0), new ItemStack(Items.golden_boots));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.pattern, 1, 5), new ItemStack(ModItems.pattern, 1, 0), new ItemStack(Items.golden_horse_armor));

        GameRegistry.addRecipe(new ItemStack(ModItems.soapBar), " s ", " p ", " b ", 's', new ItemStack(Items.sugar), 'p', new ItemStack(Items.porkchop), 'b', new ItemStack(Items.water_bucket));

        GameRegistry.addRecipe(new ItemStack(ModArmor.goldArmorHelmet), "ggg", "g g", "   ", 'g', new ItemStack(Items.golden_helmet));
        GameRegistry.addRecipe(new ItemStack(ModArmor.goldArmorChestplate), "g g", "ggg", "ggg", 'g', new ItemStack(Items.golden_chestplate));
        GameRegistry.addRecipe(new ItemStack(ModArmor.goldArmorLeggings), "ggg", "g g", "g g", 'g', new ItemStack(Items.golden_leggings));
        GameRegistry.addRecipe(new ItemStack(ModArmor.goldArmorBoots), "   ", "g g", "g g", 'g', new ItemStack(Items.golden_boots));
    }
}
