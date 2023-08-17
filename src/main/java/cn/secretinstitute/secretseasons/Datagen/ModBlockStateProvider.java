package cn.secretinstitute.secretseasons.Datagen;

import cn.secretinstitute.secretseasons.Blocks.ModBlocks;
import cn.secretinstitute.secretseasons.Utils;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.RotatedPillarBlock;
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
