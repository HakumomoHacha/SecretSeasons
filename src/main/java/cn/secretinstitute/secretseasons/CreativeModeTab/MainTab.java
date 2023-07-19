package cn.secretinstitute.secretseasons.CreativeModeTab;

import cn.secretinstitute.secretseasons.Items.ModItems;
import cn.secretinstitute.secretseasons.Utils;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class MainTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Utils.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SECRETSEASONS_TAB = CREATIVE_MODE_TABS.register("secretseason2", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .title(Component.translatable("itemGroup.secretseasons2"))
            .icon(() -> ModItems.STONE_OF_THE_SEASON.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(ModItems.STONE_OF_THE_SEASON.get()); // Add the example item to the tab. For your own tabs, this method is preferred over the event
            }).build());

}
