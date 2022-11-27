
package net.mcreator.infusedcrystals.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.infusedcrystals.InfusedCrystalsModElements;

@InfusedCrystalsModElements.ModElement.Tag
public class InfusedDiamondiumShovelItem extends InfusedCrystalsModElements.ModElement {
	@ObjectHolder("infused_crystals:infused_diamondium_shovel")
	public static final Item block = null;

	public InfusedDiamondiumShovelItem(InfusedCrystalsModElements instance) {
		super(instance, 36);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2000;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 12f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(InfusedDiamondiumCrystalItem.block));
			}
		}, 1, 2f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("infused_diamondium_shovel"));
	}
}
