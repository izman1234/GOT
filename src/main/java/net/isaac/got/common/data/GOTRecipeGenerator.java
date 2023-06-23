package net.isaac.got.common.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.isaac.got.common.item.other.GOTOther;
import net.isaac.got.common.item.tool.GOTTools;
import net.isaac.got.common.item.weapon.GOTWeapons;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class GOTRecipeGenerator extends FabricRecipeProvider { /*DOESN'T WORK YET */
    public GOTRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        /* WEAPONS */
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, GOTWeapons.Alloy_Steel_Sword)
                .pattern("X")
                .pattern("X")
                .pattern("/")
                .input('X', GOTOther.Alloy_Steel_Ingot)
                .input('/', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(GOTOther.Alloy_Steel_Ingot),
                        FabricRecipeProvider.conditionsFromItem((GOTOther.Alloy_Steel_Ingot)))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(GOTWeapons.Alloy_Steel_Sword)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, GOTWeapons.Alloy_Steel_Dagger)
                .pattern("X")
                .pattern("/")
                .input('X', GOTOther.Alloy_Steel_Ingot)
                .input('/', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(GOTOther.Alloy_Steel_Ingot),
                        FabricRecipeProvider.conditionsFromItem((GOTOther.Alloy_Steel_Ingot)))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(GOTWeapons.Alloy_Steel_Dagger)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, GOTWeapons.Bronze_Sword)
                .pattern("X")
                .pattern("X")
                .pattern("/")
                .input('X', GOTOther.Bronze_Ingot)
                .input('/', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(GOTOther.Bronze_Ingot),
                        FabricRecipeProvider.conditionsFromItem((GOTOther.Bronze_Ingot)))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(GOTWeapons.Bronze_Sword)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, GOTWeapons.Bronze_Dagger)
                .pattern("X")
                .pattern("/")
                .input('X', GOTOther.Bronze_Ingot)
                .input('/', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(GOTOther.Bronze_Ingot),
                        FabricRecipeProvider.conditionsFromItem((GOTOther.Bronze_Ingot)))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(GOTWeapons.Bronze_Dagger)));
        /* Tools */
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, GOTTools.Alloy_Steel_Pickaxe)
                .pattern("XXX")
                .pattern(" / ")
                .pattern(" / ")
                .input('X', GOTOther.Alloy_Steel_Ingot)
                .input('/', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(GOTOther.Alloy_Steel_Ingot),
                        FabricRecipeProvider.conditionsFromItem((GOTOther.Alloy_Steel_Ingot)))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(GOTTools.Alloy_Steel_Pickaxe)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, GOTTools.Bronze_Pickaxe)
                .pattern("XXX")
                .pattern(" / ")
                .pattern(" / ")
                .input('X', GOTOther.Bronze_Ingot)
                .input('/', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(GOTOther.Bronze_Ingot),
                        FabricRecipeProvider.conditionsFromItem((GOTOther.Bronze_Ingot)))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(GOTTools.Bronze_Pickaxe)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, GOTTools.Valyrian_Pickaxe)
                .pattern("XXX")
                .pattern(" / ")
                .pattern(" / ")
                .input('X', GOTOther.Valyrian_Ingot)
                .input('/', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(GOTOther.Valyrian_Ingot),
                        FabricRecipeProvider.conditionsFromItem((GOTOther.Valyrian_Ingot)))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(GOTTools.Valyrian_Pickaxe)));

    }
}
