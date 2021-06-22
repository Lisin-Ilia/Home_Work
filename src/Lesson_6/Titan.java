package Lesson_6;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 19.06.2021
 */

public class Titan extends Paladin {

    public Titan(String name, int health, float attack, int power, float defense, int dex) {
        super(name, health, attack, power, defense, dex);
//        System.out.println("Hello from Titan");
    }

    @Override
    public void healSelf(int valueHp) {
        System.out.println(name + " dont heal self");
    }

    public void superAttack(){
        System.out.println(name + " super attack!");
    }
}

