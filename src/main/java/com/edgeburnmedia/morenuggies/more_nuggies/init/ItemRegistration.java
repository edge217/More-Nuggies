/*
 * Copyright (c) 2023 Edgeburn Media. All rights reserved.
 */

package com.edgeburnmedia.morenuggies.more_nuggies.init;

import static com.edgeburnmedia.morenuggies.more_nuggies.MoreNuggies.MODID;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

public class ItemRegistration {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(
		ForgeRegistries.ITEMS, MODID);
	private final IEventBus modEventBus;


	public static final RegistryObject<Item> AMETHYST_NUGGET = ITEMS.register("amethyst_nugget",
		() -> new Item(new Item.Properties().tab(
			CreativeModeTab.TAB_MATERIALS)));

	public static final RegistryObject<Item> COOKED_CHICKEN_NUGGET = ITEMS.register(
		"cooked_chicken_nugget", () -> new Item(new Item.Properties().tab(
			CreativeModeTab.TAB_FOOD)));

	public static final RegistryObject<Item> COAL_NUGGET = ITEMS.register("coal_nugget",
		() -> new Item(new Item.Properties().tab(
			CreativeModeTab.TAB_MATERIALS)) {
			@Override
			public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
				return 200;
			}
		});

	public static final RegistryObject<Item> COBBLESTONE_NUGGET = ITEMS.register(
		"cobblestone_nugget", () -> new Item(new Item.Properties().tab(
			CreativeModeTab.TAB_MATERIALS)));

	public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget",
		() -> new Item(new Item.Properties().tab(
			CreativeModeTab.TAB_MATERIALS)));

	public static final RegistryObject<Item> DIAMOND_NUGGET = ITEMS.register("diamond_nugget",
		() -> new Item(new Item.Properties().tab(
			CreativeModeTab.TAB_MATERIALS)));

	public static final RegistryObject<Item> ECHO_NUGGET = ITEMS.register("echo_nugget",
		() -> new Item(new Item.Properties().tab(
			CreativeModeTab.TAB_MATERIALS)));

	public static final RegistryObject<Item> EMERALD_NUGGET = ITEMS.register("emerald_nugget",
		() -> new Item(new Item.Properties().tab(
			CreativeModeTab.TAB_MATERIALS)));

	public static final RegistryObject<Item> LEATHER_NUGGET = ITEMS.register("leather_nugget",
		() -> new Item(new Item.Properties().tab(
			CreativeModeTab.TAB_MATERIALS)));

	public static final RegistryObject<Item> NETHERITE_NUGGET = ITEMS.register("netherite_nugget",
		() -> new Item(new Item.Properties().tab(
			CreativeModeTab.TAB_MATERIALS)));

	public static final RegistryObject<Item> OBSIDIAN_NUGGET = ITEMS.register("obsidian_nugget",
		() -> new Item(new Item.Properties().tab(
			CreativeModeTab.TAB_MATERIALS)));

	public static final RegistryObject<Item> PHANTOM_MEMBRANE_NUGGET = ITEMS.register(
		"phantom_membrane_nugget", () -> new Item(new Item.Properties().tab(
			CreativeModeTab.TAB_MATERIALS)));

	public static final RegistryObject<Item> PRISMARINE_NUGGET = ITEMS.register("prismarine_nugget",
		() -> new Item(new Item.Properties().tab(
			CreativeModeTab.TAB_MATERIALS)));

	public static final RegistryObject<Item> QUARTZ_NUGGET = ITEMS.register("quartz_nugget",
		() -> new Item(new Item.Properties().tab(
			CreativeModeTab.TAB_MATERIALS)));

	public static final RegistryObject<Item> RAW_CHICKEN_NUGGET = ITEMS.register(
		"raw_chicken_nugget", () -> new Item(new Item.Properties().tab(
			CreativeModeTab.TAB_FOOD)));

	public static final RegistryObject<Item> REDSTONE_NUGGET = ITEMS.register("redstone_nugget",
		() -> new Item(new Item.Properties().tab(
			CreativeModeTab.TAB_MATERIALS)));

	public static final RegistryObject<Item> SCUTE_NUGGET = ITEMS.register("scute_nugget",
		() -> new Item(new Item.Properties().tab(
			CreativeModeTab.TAB_MATERIALS)));

	public static final RegistryObject<Item> WOODEN_NUGGET = ITEMS.register("wooden_nugget",
		() -> new Item(new Item.Properties().tab(
			CreativeModeTab.TAB_MATERIALS)));

	public static final RegistryObject<Item> CHARCOAL_NUGGET = ITEMS.register("charcoal_nugget",
		() -> new Item(new Item.Properties().tab(
			CreativeModeTab.TAB_MATERIALS)) {
			@Override
			public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
				return 200;
			}
		});

	public ItemRegistration(IEventBus modEventBus) {
		this.modEventBus = modEventBus;
	}

	public void registerItems() {
		ITEMS.register(modEventBus);
	}

	private static class FuelItem extends Item {

		public FuelItem(int burnTime, Item.Properties properties) {
			super(properties);
		}
	}
}
