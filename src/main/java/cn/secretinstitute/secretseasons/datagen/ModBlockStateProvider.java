package cn.secretinstitute.secretseasons.datagen;

import cn.secretinstitute.secretseasons.Utils;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;


public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper helper) {
        super(gen.getPackOutput(), Utils.MOD_ID, helper);
    }

    @Override
    protected void registerStatesAndModels() {


    }
}
