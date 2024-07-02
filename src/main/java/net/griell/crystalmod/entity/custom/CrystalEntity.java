package net.griell.crystalmod.entity.custom;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

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
