package cn.secretinstitute.secretseasons.datagen;

import cn.secretinstitute.secretseasons.Utils;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD,modid = Utils.MOD_ID)
public class DataGenEvent {
    @SubscribeEvent
    public static void register(GatherDataEvent event){
        event.getGenerator().addProvider(event.includeClient(), new ModBlockStateProvider(event.getGenerator(),event.getExistingFileHelper()));
        event.getGenerator().addProvider(event.includeClient(), new ModItemModelProvider(event.getGenerator(),event.getExistingFileHelper()));
    }
}
