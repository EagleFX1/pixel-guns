package com.ultreon.mods.pixelguns.registry;

import com.ultreon.mods.pixelguns.armor.ArmoredArmor;
import com.ultreon.mods.pixelguns.client.GeoModelGenerator;
import com.ultreon.mods.pixelguns.client.GeoRendererGenerator;
import com.ultreon.mods.pixelguns.item.*;
import com.ultreon.mods.pixelguns.item.gun.variant.*;

import com.ultreon.mods.pixelguns.util.ResourcePath;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

@SuppressWarnings("unused")
public class ItemRegistry {

    // Gun Crafting
    public static final Item HARDENED_IRON_INGOT = ItemRegistry.register("hardened_iron_ingot", new Item(new FabricItemSettings().group(ModCreativeTab.MISC).maxCount(64)));
    public static final Item HARDENED_IRON_NUGGET = ItemRegistry.register("hardened_iron_nugget", new Item(new FabricItemSettings().group(ModCreativeTab.MISC).maxCount(64)));
    public static final Item PLASTIC = ItemRegistry.register("plastic", new Item(new FabricItemSettings().group(ModCreativeTab.MISC).maxCount(64)));
    public static final Item PISTOL_GRIP = ItemRegistry.register("pistol_grip", new Item(new FabricItemSettings().group(ModCreativeTab.MISC).maxCount(64)));
    public static final Item GUN_SCOPE = ItemRegistry.register("gun_scope", new Item(new FabricItemSettings().group(ModCreativeTab.MISC).maxCount(64)));
    public static final Item LONG_BARREL = ItemRegistry.register("long_barrel", new Item(new FabricItemSettings().group(ModCreativeTab.MISC).maxCount(64)));
    public static final Item SHORT_BARREL = ItemRegistry.register("short_barrel", new Item(new FabricItemSettings().group(ModCreativeTab.MISC).maxCount(64)));
    public static final Item WOODEN_STOCK = ItemRegistry.register("wooden_stock", new Item(new FabricItemSettings().group(ModCreativeTab.MISC).maxCount(64)));
    public static final Item MODERN_STOCK = ItemRegistry.register("modern_stock", new Item(new FabricItemSettings().group(ModCreativeTab.MISC).maxCount(64)));
    public static final Item WOODEN_HANDGUARD = ItemRegistry.register("wooden_handguard", new Item(new FabricItemSettings().group(ModCreativeTab.MISC).maxCount(64)));
    public static final Item MODERN_HANDGUARD = ItemRegistry.register("modern_handguard", new Item(new FabricItemSettings().group(ModCreativeTab.MISC).maxCount(64)));

    // Blueprints
    public static final Item BLUEPRINT_BUNDLE = ItemRegistry.register("blueprint_bundle", new BlueprintBundleItem(new FabricItemSettings().group(ModCreativeTab.MISC).maxCount(1)));
    public static final Item PISTOL_BLUEPRINT = ItemRegistry.register("blueprint_pistol_light", new BlueprintItem(new FabricItemSettings().group(ModCreativeTab.MISC).maxCount(64)));
    public static final Item HEAVY_PISTOL_BLUEPRINT = ItemRegistry.register("blueprint_pistol_heavy", new BlueprintItem(new FabricItemSettings().group(ModCreativeTab.MISC).maxCount(64)));
    public static final Item MAGNUM_REVOLVER_BLUEPRINT = ItemRegistry.register("blueprint_revolver_magnum", new BlueprintItem(new FabricItemSettings().group(ModCreativeTab.MISC).maxCount(64)));
    public static final Item MACHINE_PISTOL_BLUEPRINT = ItemRegistry.register("blueprint_smg_machinepistol", new BlueprintItem(new FabricItemSettings().group(ModCreativeTab.MISC).maxCount(64)));
    public static final Item LIGHT_ASSAULT_RIFLE_BLUEPRINT = ItemRegistry.register("blueprint_assaultrifle_light", new BlueprintItem(new FabricItemSettings().group(ModCreativeTab.MISC).maxCount(64)));
    public static final Item HEAVY_ASSAULT_RIFLE_BLUEPRINT = ItemRegistry.register("blueprint_assaultrifle_heavy", new BlueprintItem(new FabricItemSettings().group(ModCreativeTab.MISC).maxCount(64)));
    public static final Item COMBAT_SHOTGUN_BLUEPRINT = ItemRegistry.register("blueprint_shotgun_combat", new BlueprintItem(new FabricItemSettings().group(ModCreativeTab.MISC).maxCount(64)));
    public static final Item CLASSIC_SNIPER_RIFLE_BLUEPRINT = ItemRegistry.register("blueprint_sniper_classic", new BlueprintItem(new FabricItemSettings().group(ModCreativeTab.MISC).maxCount(64)));

    // Ammunition
    public static final Item STANDARD_HANDGUN_BULLET = ItemRegistry.register("standard_handgun_cartridge", new Item(new FabricItemSettings().group(ModCreativeTab.WEAPONS).maxCount(64)));
    public static final Item SHOTGUN_SHELL = ItemRegistry.register("shotgun_shell", new Item(new FabricItemSettings().group(ModCreativeTab.WEAPONS).maxCount(64)));
    public static final Item HEAVY_HANDGUN_BULLET = ItemRegistry.register("heavy_handgun_cartridge", new Item(new FabricItemSettings().group(ModCreativeTab.WEAPONS).maxCount(64)));
    public static final Item STANDARD_RIFLE_BULLET = ItemRegistry.register("standard_rifle_cartridge", new Item(new FabricItemSettings().group(ModCreativeTab.WEAPONS).maxCount(64)));
    public static final Item HEAVY_RIFLE_BULLET = ItemRegistry.register("heavy_rifle_cartridge", new Item(new FabricItemSettings().group(ModCreativeTab.WEAPONS).maxCount(64)));
    public static final Item ROCKET = ItemRegistry.register("rocket", new RocketItem());
    public static final Item ENERGY_BATTERY = ItemRegistry.register("energy_battery", new Item(new FabricItemSettings().group(ModCreativeTab.WEAPONS).maxCount(12)){
        @Override
        public boolean hasGlint(ItemStack itemStack) {
            return true;
        }
    });

    // Guns
    public static final Item PISTOL = ItemRegistry.register("pistol_light", new LightPistolItem());
    public static final Item HEAVY_PISTOL = ItemRegistry.register("pistol_heavy", new HeavyPistolItem());
    public static final Item MAGNUM_REVOLVER = ItemRegistry.register("revolver_magnum", new MagnumRevolverItem());
    public static final Item PUMP_SHOTGUN = ItemRegistry.register("pump_shotgun", new PumpShotgunItem());
    public static final Item COMBAT_SHOTGUN = ItemRegistry.register("shotgun_combat", new CombatShotgunItem());
    public static final Item MACHINE_PISTOL = ItemRegistry.register("smg_machinepistol", new MachinePistolItem());
    public static final Item LIGHT_ASSAULT_RIFLE = ItemRegistry.register("assaultrifle_light", new AssaultRifleItem());
    public static final Item HEAVY_ASSAULT_RIFLE = ItemRegistry.register("assaultrifle_heavy", new HeavyAssaultRifleItem());
    public static final Item CLASSIC_SNIPER_RIFLE = ItemRegistry.register("sniper_classic", new SniperRifleItem());
//    public static final Item INFINITY_GUN = ItemRegistry.register("infinity_gun", new InfinityGunItem());
    public static final Item ROCKET_LAUNCHER = ItemRegistry.register("rocket_launcher", new RocketLauncherItem());

    // Armor
    public static final Item ARMORED_VEST = ItemRegistry.register("armored_vest", new ArmoredArmor(EquipmentSlot.CHEST));
    public static final Item GAS_MASK = ItemRegistry.register("gas_mask", new GasMaskItem());

    // Weapons
    public static final Item KATANA = ItemRegistry.register("katana", new KatanaItem());
    public static final Item CROWBAR = ItemRegistry.register("crowbar", new CrowbarItem());
    public static final Item GRENADE = ItemRegistry.register("grenade", new GrenadeItem());
    public static final Item POLICE_SHIELD = ItemRegistry.register("police_shield", new ShieldItem(new FabricItemSettings().maxDamage(500).group(ModCreativeTab.MISC)));

    // Block Items
    public static final Item UFO_INTERIOR = ItemRegistry.register(BlockRegistry.UFO_INTERIOR);
    public static final Item WORKSHOP = ItemRegistry.register(BlockRegistry.WORKSHOP, ModCreativeTab.MISC);

    // Register renderer
    public static void registerItemRenderers() {
//        ItemRegistry.registerGunRenderer(INFINITY_GUN);
        ItemRegistry.registerGunRenderer(ROCKET_LAUNCHER);
        ItemRegistry.registerItemRenderer(GAS_MASK);
        // ItemRegistry.registerItemRenderer(ARMORED_VEST);
        ItemRegistry.registerItemRenderer(ROCKET);
        ItemRegistry.registerItemRenderer(KATANA);
        ItemRegistry.registerItemRenderer(CROWBAR);
        ItemRegistry.registerItemRenderer(GRENADE);
    }

    /*
     * REGISTER METHODS
     */

    // Renderer registry
    public static void registerItemRenderer(Item item) {
        GeoItemRenderer.registerItemRenderer(item, GeoRendererGenerator.generateItemRenderer(GeoModelGenerator.generateItemModel(item)));
    }
    public static void registerGunRenderer(Item item) {
        GeoItemRenderer.registerItemRenderer(item, GeoRendererGenerator.generateItemRenderer(GeoModelGenerator.generateItemModel(item, "gun/")));
    }

    // Item registry
    private static Item register(Block block) {
        return ItemRegistry.register(new BlockItem(block, new Item.Settings()));
    }

    private static Item register(Block block, ItemGroup itemGroup) {
        return ItemRegistry.register(new BlockItem(block, new Item.Settings().group(itemGroup)));
    }

    private static Item register(BlockItem blockItem) {
        return ItemRegistry.register(blockItem.getBlock(), blockItem);
    }

    protected static Item register(Block block, Item item) {
        return ItemRegistry.register(Registry.BLOCK.getId(block), item);
    }

    private static Item register(String name, Item item) {
        return ItemRegistry.register(ResourcePath.get(name), item);
    }

    private static Item register(Identifier identifier, Item item) {
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }
        return Registry.register(Registry.ITEM, identifier, item);
    }
}