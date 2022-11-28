package net.mcreator.infusedcrystals.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;

import net.mcreator.infusedcrystals.InfusedCrystalsMod;

import java.util.Map;

public class AnimProcedure {

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				InfusedCrystalsMod.LOGGER.warn("Failed to load dependency world for procedure Anim!");
			return false;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				InfusedCrystalsMod.LOGGER.warn("Failed to load dependency x for procedure Anim!");
			return false;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				InfusedCrystalsMod.LOGGER.warn("Failed to load dependency y for procedure Anim!");
			return false;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				InfusedCrystalsMod.LOGGER.warn("Failed to load dependency z for procedure Anim!");
			return false;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		double craftingTime = 0;
		craftingTime = ((new Object() {
			public double getValue(IWorld world, BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "craftingTime")) / 10);
		if (new Object() {
			public double getValue(IWorld world, BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "craftingProgress") > 0 && new Object() {
			public double getValue(IWorld world, BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "craftingProgress") <= craftingTime) {
			return true;
		}
		return false;
	}
}
