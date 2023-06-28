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

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, GOTTools.Alloy_Steel_Axe)
                .pattern("XX")
                .pattern("X/")
                .pattern(" /")
                .input('X', GOTOther.Alloy_Steel_Ingot)
                .input('/', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(GOTOther.Alloy_Steel_Ingot),
                        FabricRecipeProvider.conditionsFromItem((GOTOther.Alloy_Steel_Ingot)))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(GOTTools.Alloy_Steel_Axe)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, GOTTools.Alloy_Steel_Hoe)
                .pattern("XX")
                .pattern(" /")
                .pattern(" /")
                .input('X', GOTOther.Alloy_Steel_Ingot)
                .input('/', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(GOTOther.Alloy_Steel_Ingot),
                        FabricRecipeProvider.conditionsFromItem((GOTOther.Alloy_Steel_Ingot)))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(GOTTools.Alloy_Steel_Hoe)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, GOTTools.Alloy_Steel_Shovel)
                .pattern("X")
                .pattern("/")
                .pattern("/")
                .input('X', GOTOther.Alloy_Steel_Ingot)
                .input('/', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(GOTOther.Alloy_Steel_Ingot),
                        FabricRecipeProvider.conditionsFromItem((GOTOther.Alloy_Steel_Ingot)))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(GOTTools.Alloy_Steel_Shovel)));

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

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, GOTTools.Bronze_Axe)
                .pattern("XX")
                .pattern("X/")
                .pattern(" /")
                .input('X', GOTOther.Bronze_Ingot)
                .input('/', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(GOTOther.Bronze_Ingot),
                        FabricRecipeProvider.conditionsFromItem((GOTOther.Bronze_Ingot)))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(GOTTools.Bronze_Axe)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, GOTTools.Bronze_Hoe)
                .pattern("XX")
                .pattern(" /")
                .pattern(" /")
                .input('X', GOTOther.Bronze_Ingot)
                .input('/', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(GOTOther.Bronze_Ingot),
                        FabricRecipeProvider.conditionsFromItem((GOTOther.Bronze_Ingot)))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(GOTTools.Bronze_Hoe)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, GOTTools.Bronze_Shovel)
                .pattern("X")
                .pattern("/")
                .pattern("/")
                .input('X', GOTOther.Bronze_Ingot)
                .input('/', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(GOTOther.Bronze_Ingot),
                        FabricRecipeProvider.conditionsFromItem((GOTOther.Bronze_Ingot)))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(GOTTools.Bronze_Shovel)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, GOTTools.Sothoryos_Pickaxe)
                .pattern("XXX")
                .pattern(" / ")
                .pattern(" / ")
                .input('X', GOTOther.Obsidian_Shard)
                .input('/', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(GOTOther.Obsidian_Shard),
                        FabricRecipeProvider.conditionsFromItem((GOTOther.Obsidian_Shard)))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(GOTTools.Sothoryos_Pickaxe)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, GOTTools.Sothoryos_Axe)
                .pattern("XX")
                .pattern("X/")
                .pattern(" /")
                .input('X', GOTOther.Obsidian_Shard)
                .input('/', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(GOTOther.Obsidian_Shard),
                        FabricRecipeProvider.conditionsFromItem((GOTOther.Obsidian_Shard)))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(GOTTools.Sothoryos_Axe)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, GOTTools.Sothoryos_Hoe)
                .pattern("XX")
                .pattern(" /")
                .pattern(" /")
                .input('X', GOTOther.Obsidian_Shard)
                .input('/', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(GOTOther.Obsidian_Shard),
                        FabricRecipeProvider.conditionsFromItem((GOTOther.Obsidian_Shard)))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(GOTTools.Sothoryos_Hoe)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, GOTTools.Sothoryos_Shovel)
                .pattern("X")
                .pattern("/")
                .pattern("/")
                .input('X', GOTOther.Obsidian_Shard)
                .input('/', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(GOTOther.Obsidian_Shard),
                        FabricRecipeProvider.conditionsFromItem((GOTOther.Obsidian_Shard)))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(GOTTools.Sothoryos_Shovel)));

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

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, GOTTools.Valyrian_Axe)
                .pattern("XX")
                .pattern("X/")
                .pattern(" /")
                .input('X', GOTOther.Valyrian_Ingot)
                .input('/', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(GOTOther.Valyrian_Ingot),
                        FabricRecipeProvider.conditionsFromItem((GOTOther.Valyrian_Ingot)))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(GOTTools.Valyrian_Axe)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, GOTTools.Valyrian_Hoe)
                .pattern("XX")
                .pattern(" /")
                .pattern(" /")
                .input('X', GOTOther.Valyrian_Ingot)
                .input('/', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(GOTOther.Valyrian_Ingot),
                        FabricRecipeProvider.conditionsFromItem((GOTOther.Valyrian_Ingot)))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(GOTTools.Valyrian_Hoe)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, GOTTools.Valyrian_Shovel)
                .pattern("X")
                .pattern("/")
                .pattern("/")
                .input('X', GOTOther.Valyrian_Ingot)
                .input('/', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(GOTOther.Valyrian_Ingot),
                        FabricRecipeProvider.conditionsFromItem((GOTOther.Valyrian_Ingot)))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(GOTTools.Valyrian_Shovel)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, GOTTools.Chisel)
                .pattern(" X")
                .pattern("/ ")
                .input('X', Items.IRON_INGOT)
                .input('/', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(GOTTools.Chisel)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, GOTTools.Valyrian_Chisel)
                .pattern(" X")
                .pattern("/ ")
                .input('X', GOTOther.Valyrian_Ingot)
                .input('/', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(GOTOther.Valyrian_Ingot),
                        FabricRecipeProvider.conditionsFromItem((GOTOther.Valyrian_Ingot)))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(GOTTools.Valyrian_Chisel)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, GOTTools.Valyrian_Mattock)
                .pattern("XXX")
                .pattern(" /X")
                .pattern(" / ")
                .input('X', GOTOther.Valyrian_Ingot)
                .input('/', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(GOTOther.Valyrian_Ingot),
                        FabricRecipeProvider.conditionsFromItem((GOTOther.Valyrian_Ingot)))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(GOTTools.Valyrian_Mattock)));


    }
}
