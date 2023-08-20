package cn.secretinstitute.secretseasons;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public enum ModItemTier implements Tier {
    SEASON(3, 2000, 10.0F, 4.0F, 30);

    private final int harvestLevel;
    private final int Uses;
    private final float speed;
    private final float attackDamage;
    private final int enchantability;

    ModItemTier(int harvestLevelIn, int UsesIn, float speedIn, float attackDamageIn, int enchantabilityIn) {
        this.harvestLevel = harvestLevelIn;
        this.Uses = UsesIn;
        this.speed = speedIn;
        this.attackDamage = attackDamageIn;
        this.enchantability = enchantabilityIn;
    }

    @Override
    public int getUses() {
        return this.Uses;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.attackDamage;
    }

    @Override
    public int getLevel() {
        return this.harvestLevel;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}
