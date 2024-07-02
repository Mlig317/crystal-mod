package net.griell.crystalmod.entity;

import net.griell.crystalmod.CrystalMod;
import net.griell.crystalmod.entity.custom.CrystalEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
        public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
                DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, CrystalMod.MOD_ID);

        public static final RegistryObject<EntityType<CrystalEntity>> CRYSTAL =
                ENTITY_TYPES.register("crystal", () -> EntityType.Builder.of(CrystalEntity::new, MobCategory.CREATURE)
                        .sized(1f,1f).build("crystal"));

        public static void register(IEventBus eventBus){
            ENTITY_TYPES.register(eventBus);
        }
}
