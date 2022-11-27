
package net.mcreator.infusedcrystals.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.infusedcrystals.InfusedCrystalsModElements;

@InfusedCrystalsModElements.ModElement.Tag
public class InfusedEmeraldiumShovelItem extends InfusedCrystalsModElements.ModElement {
	@ObjectHolder("infused_crystals:infused_emeraldium_shovel")
	public static final Item block = null;

	public InfusedEmeraldiumShovelItem(InfusedCrystalsModElements instance) {
		super(instance, 51);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 1820;
			}

			public float getEfficiency() {
				return 22f;
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
				return Ingredient.fromStacks(new ItemStack(InfusedEmeraldiumCrystalItem.block));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("infused_emeraldium_shovel"));
	}
}
