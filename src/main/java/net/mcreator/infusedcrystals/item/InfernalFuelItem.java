
package net.mcreator.infusedcrystals.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.infusedcrystals.InfusedCrystalsModElements;

@InfusedCrystalsModElements.ModElement.Tag
public class InfernalFuelItem extends InfusedCrystalsModElements.ModElement {
	@ObjectHolder("infused_crystals:infernal_fuel")
	public static final Item block = null;

	public InfernalFuelItem(InfusedCrystalsModElements instance) {
		super(instance, 64);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("infernal_fuel");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
