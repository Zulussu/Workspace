
package net.mcreator.infusedcrystals.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.infusedcrystals.InfusedCrystalsModElements;

@InfusedCrystalsModElements.ModElement.Tag
public class InfusedcoaliumhoeItem extends InfusedCrystalsModElements.ModElement {
	@ObjectHolder("infused_crystals:infusedcoaliumhoe")
	public static final Item block = null;

	public InfusedcoaliumhoeItem(InfusedCrystalsModElements instance) {
		super(instance, 57);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 1820;
			}

			public float getEfficiency() {
				return 11f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(InfusedCoaliumCrystalItem.block));
			}
		}, 0, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("infusedcoaliumhoe"));
	}
}
