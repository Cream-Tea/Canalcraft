package com.canalcraft.proxy;

import com.canalcraft.client.renderer.entity.RenderCanalBoat;
import com.canalcraft.entities.EntityCanalBoat;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {
	@SuppressWarnings("deprecation")
	public void registerRenderers() 
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityCanalBoat.class, new RenderCanalBoat(Minecraft.getMinecraft().getRenderManager()));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(CanalBoat, 0, new ModelResourceLocation("canalcraft:canal_boat"));
	}
}
