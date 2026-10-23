package com.xm666.rewindplus.handler;

import cc.sighs.rewind.event.RollbackStartEvent;
import com.xm666.rewindplus.RewindPlus;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.ModList;

@EventBusSubscriber(modid = RewindPlus.MODID, value = Dist.CLIENT)
public class RollbackHandler {
    @SubscribeEvent
    public static void onRollbackStart(RollbackStartEvent event) {
        ParticleHandler.clear();
        if (!ModList.get().isLoaded("ragdollified")) return;

        RagdollHandler.clear();
    }
}
