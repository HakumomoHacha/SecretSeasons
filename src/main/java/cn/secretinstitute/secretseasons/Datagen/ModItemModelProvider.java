package cn.secretinstitute.secretseasons.Datagen;

import cn.secretinstitute.secretseasons.Utils;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator.getPackOutput(), Utils.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

    }
}