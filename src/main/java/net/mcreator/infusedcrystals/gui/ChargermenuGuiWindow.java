
package net.mcreator.infusedcrystals.gui;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.infusedcrystals.procedures.AnimProcedure;
import net.mcreator.infusedcrystals.procedures.Anim9Procedure;
import net.mcreator.infusedcrystals.procedures.Anim8Procedure;
import net.mcreator.infusedcrystals.procedures.Anim7Procedure;
import net.mcreator.infusedcrystals.procedures.Anim6Procedure;
import net.mcreator.infusedcrystals.procedures.Anim5Procedure;
import net.mcreator.infusedcrystals.procedures.Anim4Procedure;
import net.mcreator.infusedcrystals.procedures.Anim3Procedure;
import net.mcreator.infusedcrystals.procedures.Anim2Procedure;
import net.mcreator.infusedcrystals.procedures.Anim1Procedure;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class ChargermenuGuiWindow extends ContainerScreen<ChargermenuGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = ChargermenuGui.guistate;

	public ChargermenuGuiWindow(ChargermenuGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("infused_crystals:textures/screens/chargermenu.png");

	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		Minecraft.getInstance().getTextureManager().bindTexture(texture);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.blit(ms, k, l, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("infused_crystals:textures/screens/zero.png"));
		this.blit(ms, this.guiLeft + 60, this.guiTop + 41, 0, 0, 54, 10, 54, 10);

		if (AnimProcedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("infused_crystals:textures/screens/one.png"));
			this.blit(ms, this.guiLeft + 60, this.guiTop + 41, 0, 0, 54, 10, 54, 10);
		}
		if (Anim1Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("infused_crystals:textures/screens/two.png"));
			this.blit(ms, this.guiLeft + 60, this.guiTop + 41, 0, 0, 54, 10, 54, 10);
		}
		if (Anim2Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("infused_crystals:textures/screens/three.png"));
			this.blit(ms, this.guiLeft + 60, this.guiTop + 41, 0, 0, 54, 10, 54, 10);
		}
		if (Anim3Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("infused_crystals:textures/screens/four.png"));
			this.blit(ms, this.guiLeft + 60, this.guiTop + 41, 0, 0, 54, 10, 54, 10);
		}
		if (Anim4Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("infused_crystals:textures/screens/five.png"));
			this.blit(ms, this.guiLeft + 60, this.guiTop + 41, 0, 0, 54, 10, 54, 10);
		}
		if (Anim5Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("infused_crystals:textures/screens/six.png"));
			this.blit(ms, this.guiLeft + 60, this.guiTop + 41, 0, 0, 54, 10, 54, 10);
		}
		if (Anim6Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("infused_crystals:textures/screens/seven.png"));
			this.blit(ms, this.guiLeft + 60, this.guiTop + 41, 0, 0, 54, 10, 54, 10);
		}
		if (Anim7Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("infused_crystals:textures/screens/eight.png"));
			this.blit(ms, this.guiLeft + 60, this.guiTop + 41, 0, 0, 54, 10, 54, 10);
		}
		if (Anim8Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("infused_crystals:textures/screens/nine.png"));
			this.blit(ms, this.guiLeft + 60, this.guiTop + 41, 0, 0, 54, 10, 54, 10);
		}
		if (Anim9Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("infused_crystals:textures/screens/ten.png"));
			this.blit(ms, this.guiLeft + 60, this.guiTop + 41, 0, 0, 54, 10, 54, 10);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
		this.font.drawString(ms, "Charger", 69, 5, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);
	}
}
