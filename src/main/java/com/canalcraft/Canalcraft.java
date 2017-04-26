package com.canalcraft;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modId=Canalcraft.modId, name=Canalcraft.name, version=Canalcraft.version, acceptedMinecraftVersions="[1.10.2]")

public class Canalcraft
{
	@SidedProxy(serverSide = "com.canalcraft.proxy.CommonProxy", clientSide = "com.canalcraft.proxy.ClientProxy")
	public CommonProxy proxy;
	
	public static final String modId = "canalcraft";
	public static final String name = "Canalcraft";
	public static final String version "1.0b";
	
	@Mod.Instance(modId)
	public static Canalcraft instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
