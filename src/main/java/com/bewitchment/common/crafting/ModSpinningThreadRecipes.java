package com.bewitchment.common.crafting;

import com.bewitchment.api.crafting.SpinningThreadRecipe;
import com.bewitchment.common.item.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;

public class ModSpinningThreadRecipes {

	@SuppressWarnings("ConstantConditions")
	public static void init() {
		Ingredient string = Ingredient.fromItem(Items.STRING);
		Ingredient straw = Ingredient.fromItem(Items.WHEAT);
		// Ingredient gold_nugget = Ingredient.fromItem(Items.GOLD_NUGGET);
		Ingredient parrot_feather = Ingredient.fromItem(ModItems.chromatic_quill);
		Ingredient stitching = Ingredient.fromItem(ModItems.witches_stitching);
		Ingredient ectoplasm = Ingredient.fromItem(ModItems.ectoplasm);
		Ingredient soul_string = Ingredient.fromItem(ModItems.soul_string);

		SpinningThreadRecipe.REGISTRY.registerAll(
				new SpinningThreadRecipe("spider_web", new ItemStack(Blocks.WEB), string, string, string),
				new SpinningThreadRecipe("regal_silk", new ItemStack(ModItems.regal_silk, 12, 0), parrot_feather, Ingredient.fromStacks(new ItemStack(Blocks.WEB, 1, 0)), Ingredient.fromStacks(new ItemStack(Blocks.WEB, 1, 0)), Ingredient.fromStacks(new ItemStack(ModItems.fume, 1, 9))),
				new SpinningThreadRecipe("gold_thread", new ItemStack(ModItems.golden_thread, 3, 0), straw, straw, Ingredient.fromStacks(new ItemStack(Blocks.HAY_BLOCK, 1, 0)), Ingredient.fromStacks(new ItemStack(ModItems.fume, 1, 9))),
				new SpinningThreadRecipe("witches_stitching", new ItemStack(ModItems.witches_stitching, 4), string, string, Ingredient.fromStacks(new ItemStack(ModItems.fume, 1, 2)), Ingredient.fromStacks(new ItemStack(ModItems.fume, 1, 2))),
				new SpinningThreadRecipe("diabolic_vein", new ItemStack(ModItems.diabolic_vein, 4), soul_string, soul_string, Ingredient.fromStacks(new ItemStack(ModItems.fume, 1, 8)), Ingredient.fromStacks(new ItemStack(ModItems.fume, 1, 13))),
				new SpinningThreadRecipe("pure_filament", new ItemStack(ModItems.pure_filament, 4), stitching, stitching, Ingredient.fromStacks(new ItemStack(ModItems.fume, 1, 7)), Ingredient.fromStacks(new ItemStack(ModItems.fume, 1, 7))),
				new SpinningThreadRecipe("soulstring", new ItemStack(ModItems.soul_string, 2), stitching, stitching, Ingredient.fromStacks(new ItemStack(ModItems.fume, 1, 10)), ectoplasm)
		);
	}
}