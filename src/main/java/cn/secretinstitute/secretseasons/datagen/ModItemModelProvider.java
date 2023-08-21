package cn.secretinstitute.secretseasons.datagen;

import cn.secretinstitute.secretseasons.Items.ModItems;
import cn.secretinstitute.secretseasons.Utils;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator.getPackOutput(), Utils.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent(ForgeRegistries.ITEMS.getKey(ModItems.LOVE_STONE.get()).getPath(),modLoc("item/love_stone"));
    }
}