package com.canalcraft;

import com.canalcraft.proxy.CommonProxy;
<<<<<<< HEAD

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
=======
>>>>>>> origin/master
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid=Canalcraft.modid, name=Canalcraft.name, version=Canalcraft.version, acceptedMinecraftVersions="[1.10.2]")

public class Canalcraft
{
	@SidedProxy(clientSide = "com.canalcraft.proxy.ClientProxy", serverSide = "com.canalcraft.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	public static final String modid = "canalcraft";
	public static final String name = "Canalcraft";
	public static final String version = "1.0b";
	
	@Mod.Instance(modid)
	public static Canalcraft instance;
	
	public static CreativeTabs tabCanalcraft = new CreativeTabs("tabCanalcraft") {

		@Override
		public Item getTabIconItem() {
			return proxy.CanalBoat;
		}
		
	};
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.registerItems();
		proxy.registerRenderers();
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
