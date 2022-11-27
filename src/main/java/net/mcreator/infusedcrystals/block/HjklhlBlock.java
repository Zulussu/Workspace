
package net.mcreator.infusedcrystals.block;

import net.minecraft.block.material.Material;
import net.minecraft.util.SoundEvent;

@InfusedCrystalsModElements.ModElement.Tag
public class HjklhlBlock extends InfusedCrystalsModElements.ModElement {

	@ObjectHolder("infused_crystals:hjklhl")
	public static final Block block = null;

	public HjklhlBlock(InfusedCrystalsModElements instance) {
		super(instance, 58);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.GROUND).hardnessAndResistance(1f, 10f).setLightLevel(s -> 0));

			setRegistryName("hjklhl");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 15;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

}
