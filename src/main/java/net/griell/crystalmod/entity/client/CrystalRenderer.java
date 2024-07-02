package net.griell.crystalmod.entity.client;

import net.griell.crystalmod.CrystalMod;
import net.griell.crystalmod.entity.custom.CrystalEntity;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import org.checkerframework.checker.units.qual.C;

public class CrystalRenderer extends MobRenderer<CrystalEntity,Crystal<CrystalEntity>> {
    public CrystalRenderer(EntityRendererProvider.Context pContext){
        super(pContext, new Crystal<>(pContext.bakeLayer(ModModelLayers.CRYSTAL_LAYER)), 1f);
    }

    @Override
    public ResourceLocation getTextureLocation(CrystalEntity crystalEntity) {
        return new ResourceLocation(CrystalMod.MOD_ID, "textures/entity/crystal_texture.png");
    }
}
