/*
 * BluSunrize
 * Copyright (c) 2020
 *
 * This code is licensed under "Blu's License of Common Sense"
 * Details can be found in the license file in the root folder of this project
 *
 */

package blusunrize.immersiveengineering.common.crafting.builders;

import blusunrize.immersiveengineering.api.crafting.BlastFurnaceFuel;
import blusunrize.immersiveengineering.api.crafting.IngredientWithSize;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tags.Tag;
import net.minecraft.util.IItemProvider;

public class BlastFurnaceFuelBuilder extends IEFinishedRecipe<BlastFurnaceFuelBuilder>
{
	private BlastFurnaceFuelBuilder()
	{
		super(BlastFurnaceFuel.SERIALIZER.get());
		this.maxResultCount = 0;
	}

	public static BlastFurnaceFuelBuilder builder(IItemProvider input)
	{
		return new BlastFurnaceFuelBuilder().addInput(input);
	}

	public static BlastFurnaceFuelBuilder builder(ItemStack input)
	{
		return new BlastFurnaceFuelBuilder().addInput(input);
	}

	public static BlastFurnaceFuelBuilder builder(Tag<Item> input, int count)
	{
		return new BlastFurnaceFuelBuilder().addInput(new IngredientWithSize(input, count));
	}
}
