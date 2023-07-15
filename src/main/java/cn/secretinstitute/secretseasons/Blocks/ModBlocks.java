package cn.secretinstitute.secretseasons.Blocks;

import cn.secretinstitute.secretseasons.Utils;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Utils.MOD_ID);

    public static final RegistryObject<Block> STONE_OF_THE_SEASON = BLOCKS.register("stone_of_the_season", StoneOfTheSeason::new);
}
