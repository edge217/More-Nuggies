/*
 * Copyright (c) 2023 Edgeburn Media. All rights reserved.
 */

package com.edgeburnmedia.morenuggies.more_nuggies.init;

import static com.edgeburnmedia.morenuggies.more_nuggies.MoreNuggies.MODID;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistration {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
	private final IEventBus modEventBus;

	public static final RegistryObject<Item> LEATHER_NUGGET = ITEMS.register("leather_nugget", () -> new Item(new Item.Properties().tab(
		CreativeModeTab.TAB_MATERIALS)));

	public ItemRegistration(IEventBus modEventBus) {
		this.modEventBus = modEventBus;
	}

	public void registerItems() {
		ITEMS.register(modEventBus);
	}

}
