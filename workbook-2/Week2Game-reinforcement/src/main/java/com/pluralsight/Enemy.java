package com.pluralsight;

public class Enemy {
    private String name;

    private int health;

    private int damage;

    public Enemy(String name, int damage) {
        this.name = name;
        this.health = 100;
        this.damage = damage;
    }

    public Enemy(String name){
    this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = Math.max(health,0);
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    public void attack(Character character){
        int damageDone = this.damage;
        int updateHp = character.getHealth() - damageDone;
        character.setHealth(updateHp);
        System.out.println("You've dealt " + damageDone + "damage to" + character.getName() + "!");
    }

    public void attack(Character character, double weaponMultiplier){
        int damageDone = (int) (this.damage * weaponMultiplier);
        int updateHp = character.getHealth() - damageDone;
        character.setHealth(updateHp);
        System.out.println("With the weapon multiplier, you've dealt " + damageDone + "damage to" + character.getName() + "!");
    }
}
