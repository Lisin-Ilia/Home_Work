package Lesson_6;

import Lesson_6.Unit;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 19.06.2021
 */

public class Mage extends Unit {

    public Mage(String name, int health, float attack, int power, float defense) {
        super(name, health, attack, power, defense);
    }


    @Override
    public void run() {
        System.out.println("Mage run");
    }

}
