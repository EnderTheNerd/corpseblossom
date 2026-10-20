package net.ender.corpseblossom.datagen;

import net.ender.corpseblossom.registries.CBItemRegistry;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class CBRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public CBRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.ROTTEN_FLESH, 1)
                .requires(CBItemRegistry.ROTTEN_SEEDS.get())
                .unlockedBy("has_rotten_seeds", has(CBItemRegistry.ROTTEN_SEEDS))
                .save(recipeOutput);


    }
}
