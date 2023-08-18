package cn.secretinstitute.secretseasons.Items;

import cn.secretinstitute.secretseasons.Blocks.ModBlocks;
import cn.secretinstitute.secretseasons.Utils;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);

    //item
    public static final RegistryObject<Item> LOVE_CRYSTALS = ITEMS.register("love_crystals", LoveCrystals::new);
    public static final RegistryObject<Item> CLOUDSHARDS = ITEMS.register("cloud_shards", CloudShards::new);
    public static final RegistryObject<Item> HONEYS = ITEMS.register("honeys", Honeys::new);
    public static final RegistryObject<Item> LOVESACHET = ITEMS.register("love_sachet", LoveSachet::new);
    public static final RegistryObject<Item> UNDEADEYES = ITEMS.register("undead_eyes", UndeadEyes::new);
    public static final RegistryObject<Item> GOPHEREETH = ITEMS.register("Gopher_teeth", GopherTeeth::new);


    //blockItem
    public static final RegistryObject<Item> STONE_OF_THE_SEASON = ITEMS.register("stone_of_the_season",
            ()->new BlockItem(ModBlocks.STONE_OF_THE_SEASON.get(),new Item.Properties()));
    public static final RegistryObject<Item> SUMMER_ROCK = ITEMS.register("summer_rock",
            ()->new BlockItem(ModBlocks.SUMMER_ROCK.get(),new Item.Properties()));

    public static final RegistryObject<Item> CLOUD_BLOCK = ITEMS.register("cloud_block",
            ()->new BlockItem(ModBlocks.CLOUD_BLOCK.get(),new Item.Properties()));

    public static final RegistryObject<Item> DIRT_OF_THE_SEASON = ITEMS.register("dirt_of_the_season",
            ()->new BlockItem(ModBlocks.DIRT_OF_THE_SEASON.get(),new Item.Properties()));

    public static final RegistryObject<Item> LOVE_ORE = ITEMS.register("love_ore",
            ()->new BlockItem(ModBlocks.LOVE_ORE.get(),new Item.Properties()));
}
