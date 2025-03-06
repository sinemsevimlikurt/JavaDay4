package org.example;

public enum Weapon {
    SWORD(50, 1.2),
    BOW(30, 2.4),
    AXE(80, 1.3);
    private final int damage;
    private final double attackSpeed;

    public int getDamage(){
        return damage;
    }
    public double getAttackSpeed(){
        return attackSpeed;
    }

    Weapon(int damage, double attackSpeed){
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

}
