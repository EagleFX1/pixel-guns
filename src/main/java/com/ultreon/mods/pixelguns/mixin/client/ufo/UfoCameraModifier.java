package com.ultreon.mods.pixelguns.mixin.client.ufo;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.ultreon.mods.pixelguns.entity.ufo.UfoEntity;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.Perspective;
import net.minecraft.client.render.Camera;
import net.minecraft.entity.Entity;
import net.minecraft.world.BlockView;

@Mixin(Camera.class)
public abstract class UfoCameraModifier {

    @Shadow public abstract double clipToSpace(double desiredCameraDistance);
    @Shadow public abstract void moveBy(double x, double y, double z);

    @Inject(method = "update", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/Camera;setPos(DDD)V", shift = At.Shift.AFTER), cancellable = true)
    public void update(BlockView area, Entity focusedEntity, boolean thirdPerson, boolean inverseView, float tickDelta, CallbackInfo info) {
        if (focusedEntity.getVehicle() instanceof UfoEntity) {
            MinecraftClient minecraftClient = MinecraftClient.getInstance();
            minecraftClient.options.setPerspective(Perspective.THIRD_PERSON_BACK);
            
            UfoEntity ufo = (UfoEntity) focusedEntity.getVehicle();
            float cameraDistance = ufo.getThirdPersonCameraDistance();
            
            moveBy(-clipToSpace(cameraDistance), 0.0, 0.0);
            info.cancel();
        }
    }    
}