
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
public class InfusedEmeraldiumAxeItem extends InfusedCrystalsModElements.ModElement {
	@ObjectHolder("infused_crystals:infused_emeraldium_axe")
	public static final Item block = null;

	public InfusedEmeraldiumAxeItem(InfusedCrystalsModElements instance) {
		super(instance, 50);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
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
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(InfusedEmeraldiumCrystalItem.block));
			}
		}, 1, -1f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("infused_emeraldium_axe"));
	}
}
