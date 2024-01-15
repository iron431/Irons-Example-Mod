package io.redspace.irons_example_mod.items;

import io.redspace.ironsspellbooks.api.item.weapons.ExtendedSwordItem;
import io.redspace.ironsspellbooks.api.item.weapons.MagicSwordItem;
import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.api.registry.SpellDataRegistryHolder;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Tiers;

import java.util.Map;
import java.util.UUID;

public class ExampleMagicSword extends MagicSwordItem {
    public ExampleMagicSword(SpellDataRegistryHolder[] holder) {
        super(Tiers.DIAMOND, 6, -2.4f, holder,
                Map.of(
                        AttributeRegistry.COOLDOWN_REDUCTION.get(), new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier", .15, AttributeModifier.Operation.MULTIPLY_BASE)
                ),
                (new Item.Properties()).rarity(Rarity.EPIC));
    }
}