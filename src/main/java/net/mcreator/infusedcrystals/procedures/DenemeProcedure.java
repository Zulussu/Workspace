package net.mcreator.infusedcrystals.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.block.BlockState;

import net.mcreator.infusedcrystals.item.RedstoniumCrystalItem;
import net.mcreator.infusedcrystals.item.LapisiumCrystalItem;
import net.mcreator.infusedcrystals.item.IroniumCrystalItem;
import net.mcreator.infusedcrystals.item.InfusedRedstoniumCrystalItem;
import net.mcreator.infusedcrystals.item.InfusedLapisiumCrystalItem;
import net.mcreator.infusedcrystals.item.InfusedIroniumCrystalItem;
import net.mcreator.infusedcrystals.item.InfusedEmeraldiumCrystalItem;
import net.mcreator.infusedcrystals.item.InfusedDiamondiumCrystalItem;
import net.mcreator.infusedcrystals.item.InfusedCoaliumCrystalItem;
import net.mcreator.infusedcrystals.item.InfernalFuelItem;
import net.mcreator.infusedcrystals.item.EmeraldiumCrystalItem;
import net.mcreator.infusedcrystals.item.DiamondiumCrystalItem;
import net.mcreator.infusedcrystals.item.CoaliumCrystalItem;
import net.mcreator.infusedcrystals.InfusedCrystalsMod;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Map;

public class DenemeProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				InfusedCrystalsMod.LOGGER.warn("Failed to load dependency world for procedure Deneme!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				InfusedCrystalsMod.LOGGER.warn("Failed to load dependency x for procedure Deneme!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				InfusedCrystalsMod.LOGGER.warn("Failed to load dependency y for procedure Deneme!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				InfusedCrystalsMod.LOGGER.warn("Failed to load dependency z for procedure Deneme!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		double previousRecipe = 0;
		if ((new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
				}
				return _retval.get();
			}
		}.getItemStack(new BlockPos(x, y, z), (int) (0))).getItem() == RedstoniumCrystalItem.block && (new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
				}
				return _retval.get();
			}
		}.getItemStack(new BlockPos(x, y, z), (int) (1))).getItem() == InfernalFuelItem.block && (new Object() {
			public int getAmount(IWorld world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), (int) (2)) == 0 || (new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
				}
				return _retval.get();
			}
		}.getItemStack(new BlockPos(x, y, z), (int) (2))).getItem() == InfusedRedstoniumCrystalItem.block && new Object() {
			public int getAmount(IWorld world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos(x, y, z), (int) (2)) <= 63)) {
			if (!world.isRemote()) {
				BlockPos _bp = new BlockPos(x, y, z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().putDouble("craftingTime", 50);
				if (world instanceof World)
					((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (!world.isRemote()) {
				BlockPos _bp = new BlockPos(x, y, z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().putDouble("craftingProgress", (new Object() {
						public double getValue(IWorld world, BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "craftingProgress") + 1));
				if (world instanceof World)
					((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (new Object() {
				public double getValue(IWorld world, BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 50) {
				{
					TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
					if (_ent != null) {
						final int _sltid = (int) (0);
						final int _amount = (int) 1;
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								ItemStack _stk = capability.getStackInSlot(_sltid).copy();
								_stk.shrink(_amount);
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
							}
						});
					}
				}
				{
					TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
					if (_ent != null) {
						final int _sltid = (int) (1);
						final int _amount = (int) 1;
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								ItemStack _stk = capability.getStackInSlot(_sltid).copy();
								_stk.shrink(_amount);
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
							}
						});
					}
				}
				{
					TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
					if (_ent != null) {
						final int _sltid = (int) (2);
						final ItemStack _setstack = new ItemStack(InfusedRedstoniumCrystalItem.block);
						_setstack.setCount((int) (new Object() {
							public int getAmount(IWorld world, BlockPos pos, int sltid) {
								AtomicInteger _retval = new AtomicInteger(0);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null) {
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										_retval.set(capability.getStackInSlot(sltid).getCount());
									});
								}
								return _retval.get();
							}
						}.getAmount(world, new BlockPos(x, y, z), (int) (2)) + 1));
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
				if (!world.isRemote()) {
					BlockPos _bp = new BlockPos(x, y, z);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().putDouble("craftingProgress", 0);
					if (world instanceof World)
						((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
			}
		} else {
			if ((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos(x, y, z), (int) (0))).getItem() == DiamondiumCrystalItem.block && (new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos(x, y, z), (int) (1))).getItem() == InfernalFuelItem.block && (new Object() {
				public int getAmount(IWorld world, BlockPos pos, int sltid) {
					AtomicInteger _retval = new AtomicInteger(0);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).getCount());
						});
					}
					return _retval.get();
				}
			}.getAmount(world, new BlockPos(x, y, z), (int) (2)) == 0 || (new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos(x, y, z), (int) (2))).getItem() == InfusedDiamondiumCrystalItem.block && new Object() {
				public int getAmount(IWorld world, BlockPos pos, int sltid) {
					AtomicInteger _retval = new AtomicInteger(0);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).getCount());
						});
					}
					return _retval.get();
				}
			}.getAmount(world, new BlockPos(x, y, z), (int) (2)) <= 63)) {
				if (!world.isRemote()) {
					BlockPos _bp = new BlockPos(x, y, z);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().putDouble("craftingTime", 50);
					if (world instanceof World)
						((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
				if (!world.isRemote()) {
					BlockPos _bp = new BlockPos(x, y, z);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().putDouble("craftingProgress", (new Object() {
							public double getValue(IWorld world, BlockPos pos, String tag) {
								TileEntity tileEntity = world.getTileEntity(pos);
								if (tileEntity != null)
									return tileEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos(x, y, z), "craftingProgress") + 1));
					if (world instanceof World)
						((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
				if (new Object() {
					public double getValue(IWorld world, BlockPos pos, String tag) {
						TileEntity tileEntity = world.getTileEntity(pos);
						if (tileEntity != null)
							return tileEntity.getTileData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 50) {
					{
						TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
						if (_ent != null) {
							final int _sltid = (int) (0);
							final int _amount = (int) 1;
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable) {
									ItemStack _stk = capability.getStackInSlot(_sltid).copy();
									_stk.shrink(_amount);
									((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
								}
							});
						}
					}
					{
						TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
						if (_ent != null) {
							final int _sltid = (int) (1);
							final int _amount = (int) 1;
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable) {
									ItemStack _stk = capability.getStackInSlot(_sltid).copy();
									_stk.shrink(_amount);
									((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
								}
							});
						}
					}
					{
						TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
						if (_ent != null) {
							final int _sltid = (int) (2);
							final ItemStack _setstack = new ItemStack(InfusedDiamondiumCrystalItem.block);
							_setstack.setCount((int) (new Object() {
								public int getAmount(IWorld world, BlockPos pos, int sltid) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null) {
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).getCount());
										});
									}
									return _retval.get();
								}
							}.getAmount(world, new BlockPos(x, y, z), (int) (2)) + 1));
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable) {
									((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
								}
							});
						}
					}
					if (!world.isRemote()) {
						BlockPos _bp = new BlockPos(x, y, z);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().putDouble("craftingProgress", 0);
						if (world instanceof World)
							((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
			} else {
				if ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						TileEntity _ent = world.getTileEntity(pos);
						if (_ent != null) {
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
						}
						return _retval.get();
					}
				}.getItemStack(new BlockPos(x, y, z), (int) (0))).getItem() == EmeraldiumCrystalItem.block && (new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						TileEntity _ent = world.getTileEntity(pos);
						if (_ent != null) {
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
						}
						return _retval.get();
					}
				}.getItemStack(new BlockPos(x, y, z), (int) (1))).getItem() == InfernalFuelItem.block && (new Object() {
					public int getAmount(IWorld world, BlockPos pos, int sltid) {
						AtomicInteger _retval = new AtomicInteger(0);
						TileEntity _ent = world.getTileEntity(pos);
						if (_ent != null) {
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).getCount());
							});
						}
						return _retval.get();
					}
				}.getAmount(world, new BlockPos(x, y, z), (int) (2)) == 0 || (new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						TileEntity _ent = world.getTileEntity(pos);
						if (_ent != null) {
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
						}
						return _retval.get();
					}
				}.getItemStack(new BlockPos(x, y, z), (int) (2))).getItem() == InfusedEmeraldiumCrystalItem.block && new Object() {
					public int getAmount(IWorld world, BlockPos pos, int sltid) {
						AtomicInteger _retval = new AtomicInteger(0);
						TileEntity _ent = world.getTileEntity(pos);
						if (_ent != null) {
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).getCount());
							});
						}
						return _retval.get();
					}
				}.getAmount(world, new BlockPos(x, y, z), (int) (2)) <= 63)) {
					if (!world.isRemote()) {
						BlockPos _bp = new BlockPos(x, y, z);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().putDouble("craftingTime", 50);
						if (world instanceof World)
							((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
					if (!world.isRemote()) {
						BlockPos _bp = new BlockPos(x, y, z);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().putDouble("craftingProgress", (new Object() {
								public double getValue(IWorld world, BlockPos pos, String tag) {
									TileEntity tileEntity = world.getTileEntity(pos);
									if (tileEntity != null)
										return tileEntity.getTileData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, y, z), "craftingProgress") + 1));
						if (world instanceof World)
							((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
					if (new Object() {
						public double getValue(IWorld world, BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 50) {
						{
							TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
							if (_ent != null) {
								final int _sltid = (int) (0);
								final int _amount = (int) 1;
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable) {
										ItemStack _stk = capability.getStackInSlot(_sltid).copy();
										_stk.shrink(_amount);
										((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
									}
								});
							}
						}
						{
							TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
							if (_ent != null) {
								final int _sltid = (int) (1);
								final int _amount = (int) 1;
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable) {
										ItemStack _stk = capability.getStackInSlot(_sltid).copy();
										_stk.shrink(_amount);
										((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
									}
								});
							}
						}
						{
							TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
							if (_ent != null) {
								final int _sltid = (int) (2);
								final ItemStack _setstack = new ItemStack(InfusedEmeraldiumCrystalItem.block);
								_setstack.setCount((int) (new Object() {
									public int getAmount(IWorld world, BlockPos pos, int sltid) {
										AtomicInteger _retval = new AtomicInteger(0);
										TileEntity _ent = world.getTileEntity(pos);
										if (_ent != null) {
											_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
												_retval.set(capability.getStackInSlot(sltid).getCount());
											});
										}
										return _retval.get();
									}
								}.getAmount(world, new BlockPos(x, y, z), (int) (2)) + 1));
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable) {
										((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
									}
								});
							}
						}
						if (!world.isRemote()) {
							BlockPos _bp = new BlockPos(x, y, z);
							TileEntity _tileEntity = world.getTileEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_tileEntity != null)
								_tileEntity.getTileData().putDouble("craftingProgress", 0);
							if (world instanceof World)
								((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
						}
					}
				} else {
					if ((new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							TileEntity _ent = world.getTileEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
							}
							return _retval.get();
						}
					}.getItemStack(new BlockPos(x, y, z), (int) (0))).getItem() == CoaliumCrystalItem.block && (new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							TileEntity _ent = world.getTileEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
							}
							return _retval.get();
						}
					}.getItemStack(new BlockPos(x, y, z), (int) (1))).getItem() == InfernalFuelItem.block && (new Object() {
						public int getAmount(IWorld world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							TileEntity _ent = world.getTileEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos(x, y, z), (int) (2)) == 0 || (new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							TileEntity _ent = world.getTileEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
							}
							return _retval.get();
						}
					}.getItemStack(new BlockPos(x, y, z), (int) (2))).getItem() == InfusedCoaliumCrystalItem.block && new Object() {
						public int getAmount(IWorld world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							TileEntity _ent = world.getTileEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos(x, y, z), (int) (2)) <= 63)) {
						if (!world.isRemote()) {
							BlockPos _bp = new BlockPos(x, y, z);
							TileEntity _tileEntity = world.getTileEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_tileEntity != null)
								_tileEntity.getTileData().putDouble("craftingTime", 50);
							if (world instanceof World)
								((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
						}
						if (!world.isRemote()) {
							BlockPos _bp = new BlockPos(x, y, z);
							TileEntity _tileEntity = world.getTileEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_tileEntity != null)
								_tileEntity.getTileData().putDouble("craftingProgress", (new Object() {
									public double getValue(IWorld world, BlockPos pos, String tag) {
										TileEntity tileEntity = world.getTileEntity(pos);
										if (tileEntity != null)
											return tileEntity.getTileData().getDouble(tag);
										return -1;
									}
								}.getValue(world, new BlockPos(x, y, z), "craftingProgress") + 1));
							if (world instanceof World)
								((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
						}
						if (new Object() {
							public double getValue(IWorld world, BlockPos pos, String tag) {
								TileEntity tileEntity = world.getTileEntity(pos);
								if (tileEntity != null)
									return tileEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 50) {
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
								if (_ent != null) {
									final int _sltid = (int) (0);
									final int _amount = (int) 1;
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										if (capability instanceof IItemHandlerModifiable) {
											ItemStack _stk = capability.getStackInSlot(_sltid).copy();
											_stk.shrink(_amount);
											((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
										}
									});
								}
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
								if (_ent != null) {
									final int _sltid = (int) (1);
									final int _amount = (int) 1;
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										if (capability instanceof IItemHandlerModifiable) {
											ItemStack _stk = capability.getStackInSlot(_sltid).copy();
											_stk.shrink(_amount);
											((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
										}
									});
								}
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
								if (_ent != null) {
									final int _sltid = (int) (2);
									final ItemStack _setstack = new ItemStack(InfusedCoaliumCrystalItem.block);
									_setstack.setCount((int) (new Object() {
										public int getAmount(IWorld world, BlockPos pos, int sltid) {
											AtomicInteger _retval = new AtomicInteger(0);
											TileEntity _ent = world.getTileEntity(pos);
											if (_ent != null) {
												_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
													_retval.set(capability.getStackInSlot(sltid).getCount());
												});
											}
											return _retval.get();
										}
									}.getAmount(world, new BlockPos(x, y, z), (int) (2)) + 1));
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										if (capability instanceof IItemHandlerModifiable) {
											((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
										}
									});
								}
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x, y, z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("craftingProgress", 0);
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						}
					} else {
						if ((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null) {
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										_retval.set(capability.getStackInSlot(sltid).copy());
									});
								}
								return _retval.get();
							}
						}.getItemStack(new BlockPos(x, y, z), (int) (0))).getItem() == IroniumCrystalItem.block && (new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null) {
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										_retval.set(capability.getStackInSlot(sltid).copy());
									});
								}
								return _retval.get();
							}
						}.getItemStack(new BlockPos(x, y, z), (int) (1))).getItem() == InfernalFuelItem.block && (new Object() {
							public int getAmount(IWorld world, BlockPos pos, int sltid) {
								AtomicInteger _retval = new AtomicInteger(0);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null) {
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										_retval.set(capability.getStackInSlot(sltid).getCount());
									});
								}
								return _retval.get();
							}
						}.getAmount(world, new BlockPos(x, y, z), (int) (2)) == 0 || (new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null) {
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										_retval.set(capability.getStackInSlot(sltid).copy());
									});
								}
								return _retval.get();
							}
						}.getItemStack(new BlockPos(x, y, z), (int) (2))).getItem() == InfusedIroniumCrystalItem.block && new Object() {
							public int getAmount(IWorld world, BlockPos pos, int sltid) {
								AtomicInteger _retval = new AtomicInteger(0);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null) {
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										_retval.set(capability.getStackInSlot(sltid).getCount());
									});
								}
								return _retval.get();
							}
						}.getAmount(world, new BlockPos(x, y, z), (int) (2)) <= 63)) {
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x, y, z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("craftingTime", 50);
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x, y, z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("craftingProgress", (new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z), "craftingProgress") + 1));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							if (new Object() {
								public double getValue(IWorld world, BlockPos pos, String tag) {
									TileEntity tileEntity = world.getTileEntity(pos);
									if (tileEntity != null)
										return tileEntity.getTileData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 50) {
								{
									TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
									if (_ent != null) {
										final int _sltid = (int) (0);
										final int _amount = (int) 1;
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											if (capability instanceof IItemHandlerModifiable) {
												ItemStack _stk = capability.getStackInSlot(_sltid).copy();
												_stk.shrink(_amount);
												((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
											}
										});
									}
								}
								{
									TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
									if (_ent != null) {
										final int _sltid = (int) (1);
										final int _amount = (int) 1;
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											if (capability instanceof IItemHandlerModifiable) {
												ItemStack _stk = capability.getStackInSlot(_sltid).copy();
												_stk.shrink(_amount);
												((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
											}
										});
									}
								}
								{
									TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
									if (_ent != null) {
										final int _sltid = (int) (2);
										final ItemStack _setstack = new ItemStack(InfusedIroniumCrystalItem.block);
										_setstack.setCount((int) (new Object() {
											public int getAmount(IWorld world, BlockPos pos, int sltid) {
												AtomicInteger _retval = new AtomicInteger(0);
												TileEntity _ent = world.getTileEntity(pos);
												if (_ent != null) {
													_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
														_retval.set(capability.getStackInSlot(sltid).getCount());
													});
												}
												return _retval.get();
											}
										}.getAmount(world, new BlockPos(x, y, z), (int) (2)) + 1));
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											if (capability instanceof IItemHandlerModifiable) {
												((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
											}
										});
									}
								}
								if (!world.isRemote()) {
									BlockPos _bp = new BlockPos(x, y, z);
									TileEntity _tileEntity = world.getTileEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().putDouble("craftingProgress", 0);
									if (world instanceof World)
										((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
							}
						} else {
							if ((new Object() {
								public ItemStack getItemStack(BlockPos pos, int sltid) {
									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null) {
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).copy());
										});
									}
									return _retval.get();
								}
							}.getItemStack(new BlockPos(x, y, z), (int) (0))).getItem() == LapisiumCrystalItem.block && (new Object() {
								public ItemStack getItemStack(BlockPos pos, int sltid) {
									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null) {
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).copy());
										});
									}
									return _retval.get();
								}
							}.getItemStack(new BlockPos(x, y, z), (int) (1))).getItem() == InfernalFuelItem.block && (new Object() {
								public int getAmount(IWorld world, BlockPos pos, int sltid) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null) {
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).getCount());
										});
									}
									return _retval.get();
								}
							}.getAmount(world, new BlockPos(x, y, z), (int) (2)) == 0 || (new Object() {
								public ItemStack getItemStack(BlockPos pos, int sltid) {
									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null) {
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).copy());
										});
									}
									return _retval.get();
								}
							}.getItemStack(new BlockPos(x, y, z), (int) (2))).getItem() == InfusedLapisiumCrystalItem.block && new Object() {
								public int getAmount(IWorld world, BlockPos pos, int sltid) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null) {
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).getCount());
										});
									}
									return _retval.get();
								}
							}.getAmount(world, new BlockPos(x, y, z), (int) (2)) <= 63)) {
								if (!world.isRemote()) {
									BlockPos _bp = new BlockPos(x, y, z);
									TileEntity _tileEntity = world.getTileEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().putDouble("craftingTime", 50);
									if (world instanceof World)
										((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
								if (!world.isRemote()) {
									BlockPos _bp = new BlockPos(x, y, z);
									TileEntity _tileEntity = world.getTileEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().putDouble("craftingProgress", (new Object() {
											public double getValue(IWorld world, BlockPos pos, String tag) {
												TileEntity tileEntity = world.getTileEntity(pos);
												if (tileEntity != null)
													return tileEntity.getTileData().getDouble(tag);
												return -1;
											}
										}.getValue(world, new BlockPos(x, y, z), "craftingProgress") + 1));
									if (world instanceof World)
										((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
								if (new Object() {
									public double getValue(IWorld world, BlockPos pos, String tag) {
										TileEntity tileEntity = world.getTileEntity(pos);
										if (tileEntity != null)
											return tileEntity.getTileData().getDouble(tag);
										return -1;
									}
								}.getValue(world, new BlockPos(x, y, z), "craftingProgress") >= 50) {
									{
										TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
										if (_ent != null) {
											final int _sltid = (int) (0);
											final int _amount = (int) 1;
											_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
												if (capability instanceof IItemHandlerModifiable) {
													ItemStack _stk = capability.getStackInSlot(_sltid).copy();
													_stk.shrink(_amount);
													((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
												}
											});
										}
									}
									{
										TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
										if (_ent != null) {
											final int _sltid = (int) (1);
											final int _amount = (int) 1;
											_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
												if (capability instanceof IItemHandlerModifiable) {
													ItemStack _stk = capability.getStackInSlot(_sltid).copy();
													_stk.shrink(_amount);
													((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
												}
											});
										}
									}
									{
										TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
										if (_ent != null) {
											final int _sltid = (int) (2);
											final ItemStack _setstack = new ItemStack(InfusedLapisiumCrystalItem.block);
											_setstack.setCount((int) (new Object() {
												public int getAmount(IWorld world, BlockPos pos, int sltid) {
													AtomicInteger _retval = new AtomicInteger(0);
													TileEntity _ent = world.getTileEntity(pos);
													if (_ent != null) {
														_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																.ifPresent(capability -> {
																	_retval.set(capability.getStackInSlot(sltid).getCount());
																});
													}
													return _retval.get();
												}
											}.getAmount(world, new BlockPos(x, y, z), (int) (2)) + 1));
											_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
												if (capability instanceof IItemHandlerModifiable) {
													((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
												}
											});
										}
									}
									if (!world.isRemote()) {
										BlockPos _bp = new BlockPos(x, y, z);
										TileEntity _tileEntity = world.getTileEntity(_bp);
										BlockState _bs = world.getBlockState(_bp);
										if (_tileEntity != null)
											_tileEntity.getTileData().putDouble("craftingProgress", 0);
										if (world instanceof World)
											((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
									}
								}
							} else {
								if (!world.isRemote()) {
									BlockPos _bp = new BlockPos(x, y, z);
									TileEntity _tileEntity = world.getTileEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().putDouble("craftingProgress", 0);
									if (world instanceof World)
										((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
							}
						}
					}
				}
			}
		}
	}
}
