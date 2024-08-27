package io.github.zaafonin.cwthrusters.forge;

import io.github.zaafonin.cwthrusters.CWThrustersMod;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CWThrustersMod.MOD_ID)
public final class CWThrustersModForge {
    public CWThrustersModForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(CWThrustersMod.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        CWThrustersMod.init();
    }
}
