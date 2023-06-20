
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package niceeli.chickenbumblebee.init;

import niceeli.chickenbumblebee.ChickenbumblebeeMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public class ChickenbumblebeeModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ChickenbumblebeeMod.MODID);
	public static final RegistryObject<SoundEvent> BEE = REGISTRY.register("bee", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("chickenbumblebee", "bee")));
}
