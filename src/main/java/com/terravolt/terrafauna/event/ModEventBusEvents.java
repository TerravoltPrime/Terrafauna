package com.terravolt.terrafauna.event;

import com.terravolt.terrafauna.TerraFauna;
import com.terravolt.terrafauna.entity.ModEntities;
import com.terravolt.terrafauna.entity.client.BeardedDragonModel;
import com.terravolt.terrafauna.entity.custom.BeardedDragon;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;

@EventBusSubscriber(modid = TerraFauna.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(BeardedDragonModel.LAYER_LOCATION, BeardedDragonModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.BEARDED_DRAGON.get(), BeardedDragon.createAttributes().build());
    }
}