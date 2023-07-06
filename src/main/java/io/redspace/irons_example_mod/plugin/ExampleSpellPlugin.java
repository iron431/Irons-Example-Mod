package io.redspace.irons_example_mod.plugin;

import io.redspace.irons_example_mod.IronsExampleMod;
import io.redspace.irons_example_mod.spells.SuperHealSpell;
import io.redspace.ironsspellbooks.api.IIronsSpellbooksPlugin;
import io.redspace.ironsspellbooks.api.IronsSpellbooksPlugin;
import io.redspace.ironsspellbooks.api.registration.ISpellRegistration;
import net.minecraft.resources.ResourceLocation;

@IronsSpellbooksPlugin
public class ExampleSpellPlugin implements IIronsSpellbooksPlugin {

    @Override
    public ResourceLocation getPluginId() {
        return new ResourceLocation(IronsExampleMod.MODID, "spell_plugin");
    }

    @Override
    public void registerSpells(ISpellRegistration registration) {
        IronsExampleMod.LOGGER.debug("ExampleSpellPlugin.registerSpells");
    }

    @Override
    public void onAllSpellsRegistered() {
        IronsExampleMod.LOGGER.debug("ExampleSpellPlugin.onAllSpellsRegistered");
    }
}
