package Lesson_5;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 16.06.2021
 */

public class Hero {

    private String name; //class field
    private int height;
    private String color;
    private int age;
    private boolean isLive;

    Hero() {
        System.out.println("This is constructor empty");
    }

    Hero(String value) {
        System.out.println("This is constructor with args " + value);
    }

    Hero(String name, int height, String color, int age, boolean isLive) {
        this.name = name;
        this.height = height;
        this.color = color;
        this.age = age;
        this.isLive = isLive;
    }

    Costume costume = new Costume();

    private float calcSpeed() {
        return height * 0.75f;
    }

    public static void voice() {
        System.out.println("Hero voice");
    }

    public void run() {
        System.out.println("Hero " + name + " run! Speed:" + calcSpeed());
    }

    void jump() {
        System.out.println("Hero " + name + " jump!");
    }

    void speak() {
        System.out.println("Hero " + name + " says Hello!");
    }

    //Getter
    public String getName() {
        return name;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }

    public static class Costume {
        String color;
        String textTest = "Hello";
        int size;
        String type;

//        void tear() {
//            System.out.println("Costume hero " + name + " is tear");
//        }
    }


}
