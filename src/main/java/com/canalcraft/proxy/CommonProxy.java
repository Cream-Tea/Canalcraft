package com.canalcraft.proxy;

import com.canalcraft.Canalcraft;
import com.canalcraft.entities.EntityCanalBoat;
import com.canalcraft.items.ItemCanalBoat;

import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy
{
	
	public ItemCanalBoat CanalBoat;
	
	public void registerItems()
	{
		CanalBoat = new ItemCanalBoat(null);
		CanalBoat.setRegistryName("canal_boat");
		CanalBoat.setUnlocalizedName("canal_boat");
		GameRegistry.register(CanalBoat);
		EntityRegistry.registerModEntity(EntityCanalBoat.class, "canal_boat", 0, Canalcraft.instance, 256, 3, true);
	}
	
	public void registerRenderers() {
		
	}
}
