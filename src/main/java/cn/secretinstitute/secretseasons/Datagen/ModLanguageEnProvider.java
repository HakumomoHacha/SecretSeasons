package cn.secretinstitute.secretseasons.Datagen;

import cn.secretinstitute.secretseasons.Blocks.ModBlocks;
import cn.secretinstitute.secretseasons.CreativeModeTab.MainTab;
import cn.secretinstitute.secretseasons.Utils;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLanguageEnProvider extends LanguageProvider {

    public ModLanguageEnProvider(DataGenerator gen, String locale){
        super(gen.getPackOutput(), Utils.MOD_ID, locale);
    }
    @Override
    protected void addTranslations() {
        add("itemGroup." + MainTab.CREATIVE_MODE_TABS.getRegistryName().getPath(), "SecretSeason2");
        add(ModBlocks.STONE_OF_THE_SEASON.get(), "Stone of the season");
    }
}
