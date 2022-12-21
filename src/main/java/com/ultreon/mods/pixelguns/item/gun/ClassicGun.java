package com.ultreon.mods.pixelguns.item.gun;

import net.minecraft.item.Item;
import net.minecraft.sound.SoundEvent;

public class ClassicGun extends AbstractGunItem {
    public ClassicGun(Settings settings, AmmoLoadingType ammoLoadingType, float gunDamage, int rateOfFire, int magSize, Item ammoType, int reloadCooldown, float bulletSpread, float gunRecoil, int pelletCount, int loadingType, SoundEvent reload1, SoundEvent reload2, SoundEvent reload3, SoundEvent shootSound, int reloadCycles, boolean isScoped, int reloadStage1, int reloadStage2, int reloadStage3) {
        super(settings, ammoLoadingType, gunDamage, rateOfFire, magSize, ammoType, reloadCooldown, bulletSpread, gunRecoil, pelletCount, loadingType, reload1, reload2, reload3, shootSound, reloadCycles, isScoped, reloadStage1, reloadStage2, reloadStage3);
    }
}
