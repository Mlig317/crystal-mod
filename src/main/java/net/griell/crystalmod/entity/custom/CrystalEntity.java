package net.griell.crystalmod.entity.custom;

import net.griell.crystalmod.entity.ModEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CrystalEntity extends Animal {

    public CrystalEntity(EntityType<? extends Animal> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Animal.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 2.0D)
                .add(Attributes.FOLLOW_RANGE, 0.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.0D)
                .add(Attributes.ARMOR, 0.0D)
                .add(Attributes.KNOCKBACK_RESISTANCE, 1.0D); // Add knockback resistance
    }

    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;


    @Override
    public void tick() {
        super.tick();

        if(this.level().isClientSide()) {
            setupAnimationStates();
        }
    }

    private void setupAnimationStates() {
        if(this.idleAnimationTimeout <= 0) {
            this.idleAnimationTimeout = this.random.nextInt(40) + 80;
            this.idleAnimationState.start(this.tickCount);
        } else {
            --this.idleAnimationTimeout;
        }
    }

    //crystal spawning and deletion

    public static void registerEvents(IEventBus modEventBus) {
        MinecraftForge.EVENT_BUS.register(CrystalEntity.class);
    }

    @SubscribeEvent
    public static void onBlockPlace(BlockEvent.EntityPlaceEvent event) {
        Level world = (Level) event.getLevel();
        BlockPos pos = event.getPos();
        BlockState placedBlock = event.getPlacedBlock();
        if (!world.isClientSide && placedBlock.getBlock() == Blocks.EMERALD_BLOCK) {
            CrystalEntity crystalEntity = new CrystalEntity(ModEntities.CRYSTAL.get(), world);
            crystalEntity.setPos(pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5);
            world.addFreshEntity(crystalEntity);
        }
    }

    @SubscribeEvent
    public static void onBlockBreak(BlockEvent.BreakEvent event) {
        Level world = (Level) event.getLevel();
        BlockPos pos = event.getPos();
        BlockState brokenBlock = event.getState();
        if (!world.isClientSide && brokenBlock.getBlock() == Blocks.EMERALD_BLOCK) {
            List<CrystalEntity> crystals = world.getEntitiesOfClass(CrystalEntity.class, new AABB(pos).inflate(10));
            for (CrystalEntity crystal : crystals) {
                if (crystal.blockPosition().equals(pos.above())) {
                    crystal.remove(Entity.RemovalReason.DISCARDED);
                    break;
                }
            }
        }
    }



    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel serverLevel, AgeableMob ageableMob) {
        return null;
    }

    @Override
    public boolean hurt(DamageSource damageSource, float damageAmount) {
        // Call the superclass's hurt method to handle health changes
        boolean result = super.hurt(damageSource, damageAmount);

        // Prevent knockback
        if (result) {
            this.setDeltaMovement(this.getDeltaMovement().multiply(0, 1, 0)); // Ensure no movement on Y-axis
        }

        return result;
    }

}
