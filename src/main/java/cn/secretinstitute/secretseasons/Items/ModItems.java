package cn.secretinstitute.secretseasons.Items;

import cn.secretinstitute.secretseasons.Blocks.ModBlocks;
import cn.secretinstitute.secretseasons.Blocks.StoneOfTheSeason;
import cn.secretinstitute.secretseasons.Utils;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);

    //item

    //blockItem
    public static final RegistryObject<Item> STONE_OF_THE_SEASON = ITEMS.register("stone_of_the_season",
            ()->new BlockItem(ModBlocks.STONE_OF_THE_SEASON.get(),new Item.Properties()));
}
