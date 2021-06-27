package Lesson_6.Home_Work6;

import java.util.Random;

public class Main {

    private static Random random = new Random();

    public static void main(String[] args){
        Cat cat = new Cat("Barsik",200,0 );
        Dog dog = new Dog("Bobik", 500, 10);

        cat.Speak();
        cat.Run(random.nextInt(200));// длина препятствия задается рандомом с ограничением
        cat.Swim(random.nextInt(1));
        System.out.println("*******");
        cat.Run2(50);// длинна препятствия задается численно
        cat.Swim2(5);
        System.out.println("*******");
        dog.Speak();
        dog.Run(random.nextInt(500));// длина препятствия задается рандомом с ограничением
        dog.Swim(random.nextInt(10));
        System.out.println("*******");
        dog.Run2(1000);// длинна препятствия задается численно
        dog.Swim2(9);

    }
}

