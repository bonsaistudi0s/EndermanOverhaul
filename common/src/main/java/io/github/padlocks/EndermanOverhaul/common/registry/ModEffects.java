package io.github.padlocks.EndermanOverhaul.common.registry;

import gg.moonflower.pollen.api.registry.PollinatedRegistry;
import io.github.padlocks.EndermanOverhaul.common.effect.FriendermanEffect;
import io.github.padlocks.EndermanOverhaul.core.EndermanOverhaul;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.util.registry.Registry;

import java.util.function.Supplier;

public class ModEffects {
    public static final PollinatedRegistry<StatusEffect> EFFECTS = PollinatedRegistry.create(Registry.STATUS_EFFECT, EndermanOverhaul.MOD_ID);
    public static final Supplier<FriendermanEffect> FRIENDERMAN_EFFECT = EFFECTS.register("frienderman", () -> new FriendermanEffect());
}
