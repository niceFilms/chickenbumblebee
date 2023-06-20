
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package niceeli.chickenbumblebee.init;

import niceeli.chickenbumblebee.item.BumblebeeItem;
import niceeli.chickenbumblebee.ChickenbumblebeeMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

public class ChickenbumblebeeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ChickenbumblebeeMod.MODID);
	public static final RegistryObject<Item> BUMBLEBEE = REGISTRY.register("bumblebee", () -> new BumblebeeItem());
}
