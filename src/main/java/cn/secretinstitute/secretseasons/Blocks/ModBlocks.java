package cn.secretinstitute.secretseasons.Blocks;

import cn.secretinstitute.secretseasons.Utils;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Utils.MOD_ID);

    public static final RegistryObject<Block> STONE_OF_THE_SEASON = BLOCKS.register("stone_of_the_season", StoneOfTheSeason::new);
    public static final RegistryObject<Block> SUMMER_ROCK = BLOCKS.register("summer_rock",SummerRock::new);
    public static final RegistryObject<Block> DIRT_OF_THE_SEASON = BLOCKS.register("dirt_of_the_season",DirtOfTheSeason::new);
    public static final RegistryObject<Block> CLOUD_BLOCK = BLOCKS.register("cloud_block",CloudBlock::new);
    public static final RegistryObject<Block> LOVE_ORE = BLOCKS.register("love_ore",LoveOre::new);
}
