package com.xm666.rewindplus.handler;

import cc.sighs.rewind.event.RollbackStartEvent;
import com.xm666.rewindplus.RewindPlus;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.EventBusSubscriber;

@EventBusSubscriber(modid = RewindPlus.MODID, value = Dist.CLIENT)
public class RollbackHandler {
    @SubscribeEvent
    public static void onRollbackStart(RollbackStartEvent event) {
        ParticleHandler.clear();
        if (!ModList.get().isLoaded("ragdollified")) return;

        RagdollHandler.clear();
    }
}
