package Lesson_6;

import Lesson_6.Unit;

import java.util.Random;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 19.06.2021
 */

public class Director {

    private static Random random = new Random();

    public static void main(String[] args) {
//        int myInt1 = 512;
//        byte myByte1 = (byte) myInt1; //type casting
//        System.out.println(myByte1);
//
//        byte myByte2 = 120;
//        int myInt2 = myByte2;
//        System.out.println(myInt2);
        Paladin paladin = new Paladin("Paladin", 100, 12.5f, 10, 24.9f);
        Archer archer = new Archer("Archer", 50, 20.8f, 15, 10.0f);
        Mage mage = new Mage("Mage", 25, 50.4f, 5, 2.8f);
        Titan titan = new Titan("Titan", 150, 250f, 20, 100f, 45);

        paladin.block();
        paladin.healSelf(random.nextInt(50));

        titan.speak();
        titan.dealDamage();
        titan.healSelf(random.nextInt(50));
        titan.block();
        paladin.speak();
        paladin.dealDamage();
        Unit[] army = {paladin, archer, mage, titan};

        for (int i = 0; i < army.length; i++) {
            army[i].speak();
            army[i].dealDamage();

            if (army[i] instanceof Titan) {
//                Titan tmpTitan = (Titan) army[i];
//                tmpTitan.superAttack();
                ((Titan) army[i]).superAttack();
            }
        }
//
//        int testInt = 1;
//        boolean testB = true;
//        String testString = "Hello";
//
//        Object[] myArray = {testInt, testB, paladin, testString};
//
//        for (int i = 0; i < myArray.length; i++) {
//            if (myArray[i] instanceof Boolean) {
//                System.out.println(((Boolean) myArray[i]).toString());
//            }
//        }
    }

}
