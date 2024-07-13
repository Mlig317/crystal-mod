package net.griell.crystalmod.event;



import net.griell.crystalmod.CrystalMod;
import net.griell.crystalmod.entity.ModEntities;
import net.griell.crystalmod.entity.custom.CrystalEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CrystalMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event){
        event.put(ModEntities.CRYSTAL.get(), CrystalEntity.createAttributes().build());
    }
}