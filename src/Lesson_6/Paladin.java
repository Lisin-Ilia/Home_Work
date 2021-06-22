package Lesson_6;

import Lesson_6.Unit;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 19.06.2021
 */

public class Paladin extends Unit {

//    protected String name; //перекрытие родительского name
    protected int dex;

    public Paladin(String name, int health, float attack, int power, float defense) {
        super(name, health, attack, power, defense);
    }

    public Paladin(String name, int health, float attack, int power, float defense, int dex) {
        super(name, health, attack, power, defense);
        this.dex = dex;
//        System.out.println("Hello from Paladin");
    }

    public void block() {
        System.out.println(name + " has block " + defense + " points");
    }

    @Override
    public void run() {
        System.out.println("Paladin run");
    }
}
