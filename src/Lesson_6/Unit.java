package Lesson_6;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 19.06.2021
 */

public abstract class Unit {

    protected String name;
    protected int health;
    protected float attack;
    protected int power;
    protected float defense;
    protected boolean isLive;

    public Unit(String name, int health, float attack, int power, float defense) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.power = power;
        this.defense = defense;
        this.isLive = true;
    }

    public void speak() {
        System.out.println(name + " says Hello!");
    }

    public void dealDamage() {
        System.out.println(name + " deals damage " + attack * power + " point");
    }

    public void healSelf(int valueHp) {
        this.health += valueHp;
        System.out.println(name + " heal self to " + valueHp + ". My health now " + this.health);
    }

    public boolean isLive() {
        return isLive;
    }

    public abstract void run();
}
