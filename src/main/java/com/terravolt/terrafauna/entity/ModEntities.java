package com.terravolt.terrafauna.entity;

import com.terravolt.terrafauna.TerraFauna;
import com.terravolt.terrafauna.entity.custom.BeardedDragon;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, TerraFauna.MOD_ID);

    public static final Supplier<EntityType<BeardedDragon>> BEARDED_DRAGON =
            ENTITY_TYPES.register("bearded_dragon", () -> EntityType.Builder.of(BeardedDragon::new, MobCategory.CREATURE)
                    .sized(0.35f, 0.35f).build("bearded_dragon"));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
