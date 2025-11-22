package net.graveltools.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.graveltools.GravelTools;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item GRAVEL_SWORD = register(
            new SwordItem(ModToolMaterials.GRAVEL, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(
                            ModToolMaterials.GRAVEL,
                            3,
                            -2.2f))),
            "gravel_sword");

    public static final Item GRAVEL_SHOVEL = register(new ShovelItem(ModToolMaterials.GRAVEL, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(
                            ModToolMaterials.GRAVEL,
                            1.5F,
                            -3.0F))),
            "gravel_shovel");

    public static final Item GRAVEL_PICKAXE = register(new PickaxeItem(ModToolMaterials.GRAVEL, new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(
                    ModToolMaterials.GRAVEL,
                    1.5F,
                    -2.8F))),
            "gravel_pickaxe");

    public static final Item GRAVEL_AXE = register(new AxeItem(ModToolMaterials.GRAVEL, new Item.Settings()
            .attributeModifiers(AxeItem.createAttributeModifiers(
                    ModToolMaterials.GRAVEL,
                    6.5F,
                    -3.1F))),
            "gravel_axe");

    public static final Item GRAVEL_HOE = register(new HoeItem(ModToolMaterials.GRAVEL, new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(
                    ModToolMaterials.GRAVEL,
                    -0.5F,
                    -2.0F))),
            "gravel_hoe");

    public static Item register(Item item, String id) {
        return Registry.register(Registries.ITEM, Identifier.of(GravelTools.MOD_ID, id), item);
    }

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS)
                .register(itemGroup -> {
                    itemGroup.add(GRAVEL_SWORD);
                    itemGroup.add(GRAVEL_SHOVEL);
                    itemGroup.add(GRAVEL_PICKAXE);
                    itemGroup.add(GRAVEL_AXE);
                    itemGroup.add(GRAVEL_HOE);
                });
    }
}