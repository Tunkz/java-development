package com.pluralsight;

public class Character {
    private String name;
    private int health;
    private int strength;
    private int agility;

    public Character(String name, int strength, int agility) {
        this.name = name;
        this.health = 100;
        this.strength = strength;
        this.agility = agility;

    }

    public Character(String name) {
        this(name, 30, 10);

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

        this.health = Math.max(health, 0);
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }
    public String getDescription(){
        return name.toUpperCase().charAt(0) + name.substring(1).toLowerCase();
    }

    public String getHealthStatus(){
        return health + "HP";
    }

    public String getFullStatus(){
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(getDescription()).append("\n");
        sb.append("Healthh Status: ").append(getHealthStatus()).append("\n");
        sb.append("Strength: ").append(strength).append("\n");
        sb.append("Agility: ").append(agility);

        return sb.toString();

    }


    public void attack(Enemy enemy){
        int damageDone = this.strength;
        int updateHp = enemy.getHealth() - damageDone;
        enemy.setHealth(updateHp);
        System.out.println("You've dealt " + damageDone + "damage to" + enemy.getName() + "!");
    }

    public void attack(Enemy enemy, double weaponMultiplier){
        int damageDone = (int) (this.strength * weaponMultiplier);
        int updateHp = enemy.getHealth() - damageDone;
        enemy.setHealth(updateHp);
        System.out.println("With the weapon multiplier, you've dealt " + damageDone + "damage to" + enemy.getName() + "!");
    }

}
