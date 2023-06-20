
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package niceeli.chickenbumblebee.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ChickenbumblebeeModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.FARMER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(ChickenbumblebeeModItems.BUMBLEBEE.get()), 10, 1000, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(ChickenbumblebeeModItems.BUMBLEBEE.get()),

					new ItemStack(Blocks.END_PORTAL), 10, 5, 0.05f));
		}
	}
}
