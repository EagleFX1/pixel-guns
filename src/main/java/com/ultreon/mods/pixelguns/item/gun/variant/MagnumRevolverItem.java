package com.ultreon.mods.pixelguns.item.gun.variant;

import com.ultreon.mods.pixelguns.registry.ItemRegistry;
import com.ultreon.mods.pixelguns.item.gun.GunItem;
import com.ultreon.mods.pixelguns.registry.SoundRegistry;
import net.minecraft.sound.SoundEvent;

public class MagnumRevolverItem extends GunItem {
    public MagnumRevolverItem() {
        super(
            GunItem.AmmoLoadingType.SEMI_AUTOMATIC,
            11.0f,
            128,
            10,
            6,
            ItemRegistry.HEAVY_HANDGUN_BULLET,
            40,
            0.125f,
            10.0f,
            1,
            LoadingType.CLIP,
            new SoundEvent[] {SoundRegistry.RELOAD_GENERIC_REVOLVER_P1, SoundRegistry.RELOAD_GENERIC_REVOLVER_P2, SoundRegistry.RELOAD_GENERIC_REVOLVER_P3},
            SoundRegistry.REVOLVER_MAGNUM,
            1,
            false,
            new int[] {1, 26, 34}
        );
    }
}
