package cn.secretinstitute.secretseasons.Datagen;

import cn.secretinstitute.secretseasons.Blocks.ModBlocks;
import cn.secretinstitute.secretseasons.Utils;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD,modid = Utils.MOD_ID)
public class DataGenEvent {
    @SubscribeEvent
    public static void register(GatherDataEvent event){
        event.getGenerator().addProvider(event.includeClient(), new ModBlockStateProvider(event.getGenerator(),event.getExistingFileHelper()));
        event.getGenerator().addProvider(event.includeClient(), new ModItemModelProvider(event.getGenerator(),event.getExistingFileHelper()));
    }
}
