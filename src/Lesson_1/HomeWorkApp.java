package Lesson_1;

public class HomeWorkApp  {
    //Создать пустой проект в IntelliJ IDEA, создать класс HomeWorkApp, и прописать в нем метод main().
    public static void main(String[] args) {
        printThreeWords(); //2

        System.out.println("************");

        if (checkSumSign(-1,-2)) { //3
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
        System.out.println("************");

        printColor(500);  //4

        System.out.println("************");

        compareNumbers(3, 5);

    }
    //2.Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
//_Orange
//_ Banana
//_ Apple
    public static void printThreeWords (){
        System.out.println("_Orange");
        System.out.println("_ Banana");
        System.out.println("_ Apple");
    }
//3.Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите.
//Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0,
//то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;

    public static boolean checkSumSign(int a, int b) {
        return (a + b) >= 0;
    }
    // 4.Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
//Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”,
//если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”,
//если больше 100 (100 исключительно) - “Зеленый”;
    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        }else if (value <= 100) {
            System.out.println("Желтый");
        }else {
            System.out.println("Зеленый");
        }
    }
    // 5.Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b,
//и инициализируйте их любыми значениями, которыми захотите.
// Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”
    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

//6.Методы из пунктов 2-5 вызовите из метода main() и посмотрите корректно ли они работают.
}












