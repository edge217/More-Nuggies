/*
 * Copyright (c) 2023 Edgeburn Media. All rights reserved.
 */

package com.edgeburnmedia.morenuggies.more_nuggies;

import com.edgeburnmedia.morenuggies.more_nuggies.init.ItemRegistration;
import com.mojang.logging.LogUtils;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MoreNuggies.MODID)
public class MoreNuggies {

	// Define mod id in a common place for everything to reference
	public static final String MODID = "more_nuggies";
	// Directly reference a slf4j logger
	private static final Logger LOGGER = LogUtils.getLogger();
	private final IEventBus modEventBus;

	public MoreNuggies() {
		modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		MinecraftForge.EVENT_BUS.register(this);
		setup();
	}

	private void setup() {
		ItemRegistration itemRegistration = new ItemRegistration(modEventBus);
		itemRegistration.registerItems();
	}

	@SubscribeEvent
	public void tooltipEvent(net.minecraftforge.event.entity.player.ItemTooltipEvent event) {
		ItemStack itemStack = event.getItemStack();
		itemStack.getTags().forEach(tag -> {
			event.getToolTip().add(Component.literal(tag.location().toString()));
		});
	}
}
