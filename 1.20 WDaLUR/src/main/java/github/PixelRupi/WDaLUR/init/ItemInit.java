package github.PixelRupi.WDaLUR.init;

import github.PixelRupi.WDaLUR.WDaLUR;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, WDaLUR.MODID);
    // DeferredRegister - mapa, pozwala na rejestrowanie tylko rzeczy typu ITEM, jakby odpowiednik using namespace std z c++

    public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item",
            () -> new Item(new Item.Properties()
                    .stacksTo(16)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationMod(0.2f)
                            .build())
                    .rarity(Rarity.EPIC)
            ));

    public static final RegistryObject<Item> FUEL_ROD_TEST = CreativeTabInit.addToTab(ITEMS.register("fuel_rod_test",
            () -> new Item(new Item.Properties()
                    .stacksTo(32)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationMod(0.2f)
                            .effect(() -> new MobEffectInstance(MobEffects.POISON, 100, 5), 0.99f) // czas jest w 1/20 sekundy
                            .effect(() -> new MobEffectInstance(MobEffects.GLOWING, 100, 5), 1.0f)
                            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 60, 10), 1.0f)
                            .build())
                    .rarity(Rarity.COMMON)
            )));

    public static final RegistryObject<Item> EXAMPLE_BLOCK_ITEM = CreativeTabInit.addToTab(ITEMS.register("example_block",
            () -> new BlockItem(BlockInit.EXAMPLE_BLOCK.get(),
                    new Item.Properties()
                            .rarity(Rarity.UNCOMMON)
            )));
    // // // // // // // // //
    // Narzedzia z Gierkonium
    // // // // // // // // //
    public static final  RegistryObject<SwordItem> GIERKONIUM_SWORD = CreativeTabInit.addToTab(ITEMS.register("gierkonium_sword",
            () -> new SwordItem(
                    TierInit.GIERKONIUM,
                    7,
                    2.5f,
                    new Item.Properties()
            )));

    public static final  RegistryObject<PickaxeItem> GIERKONIUM_PICKAXE = CreativeTabInit.addToTab(ITEMS.register("gierkonium_pickaxe",
            () -> new PickaxeItem(
                    TierInit.GIERKONIUM,
                    7,
                    2.5f,
                    new Item.Properties()
            )));

    public static final  RegistryObject<ShovelItem> GIERKONIUM_SHOVEL = CreativeTabInit.addToTab(ITEMS.register("gierkonium_shovel",
            () -> new ShovelItem(
                    TierInit.GIERKONIUM,
                    7,
                    2.5f,
                    new Item.Properties()
            )));

    public static final  RegistryObject<AxeItem> GIERKONIUM_AXE = CreativeTabInit.addToTab(ITEMS.register("gierkonium_axe",
            () -> new AxeItem(
                    TierInit.GIERKONIUM,
                    7,
                    2.5f,
                    new Item.Properties()
            )));

    public static final  RegistryObject<HoeItem> GIERKONIUM_HOE = CreativeTabInit.addToTab(ITEMS.register("gierkonium_hoe",
            () -> new HoeItem(
                    TierInit.GIERKONIUM,
                    7,
                    2.5f,
                    new Item.Properties()
            )));


    // // // // // // // // //
    // Zbroja  z Gierkonium
    // // // // // // // // //
    public static final RegistryObject<ArmorItem> GIERKONIUM_HELMET = CreativeTabInit.addToTab(ITEMS.register("gierkonium_helmet",
            () -> new ArmorItem(
            ArmorMaterialInit.GIERKONIUM,
                    ArmorItem.Type.HELMET,
                    new Item.Properties()
            )));

    public static final RegistryObject<ArmorItem> GIERKONIUM_CHESTPLATE = CreativeTabInit.addToTab(ITEMS.register("gierkonium_chestplate",
            () -> new ArmorItem(
                    ArmorMaterialInit.GIERKONIUM,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()
            )));

    public static final RegistryObject<ArmorItem> GIERKONIUM_LEGGINGS = CreativeTabInit.addToTab(ITEMS.register("gierkonium_leggings",
            () -> new ArmorItem(
                    ArmorMaterialInit.GIERKONIUM,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties()
            )));

    public static final RegistryObject<ArmorItem> GIERKONIUM_BOOTS = CreativeTabInit.addToTab(ITEMS.register("gierkonium_boots",
            () -> new ArmorItem(
                    ArmorMaterialInit.GIERKONIUM,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties()
            )));

    public static final RegistryObject<ForgeSpawnEggItem> JURI_SPAWN_EGG = CreativeTabInit.addToTab(ITEMS.register("juri_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.JURI, 0x000000, 0xFFFFFF, new Item.Properties())));
    /*
    >>>>> zostawcie dla potomnych

    public static final RegistryObject<Item> TUTAJ_NAZWA = CreativeTabInit.addToTab(ITEMS.register("tutaj_nazwa",
            () -> new Item(new Item.Properties()
                // wlasciwosci
            )));
     */
}

