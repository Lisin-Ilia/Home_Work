package Lesson_2;

public class Home_Work2 {
    public static void main(String[] args){

    if (SumCheck(5,12)) {
        System.out.println("True");
    } else {
        System.out.println("False");
    }
        System.out.println("*************");
        if (PrintConsole(-3)) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
        System.out.println("*************");
        if (ReturnValue(5)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        System.out.println("*************");
        PrintConsoleLine("////", 3);
        System.out.println("*************");
        int currentYear = 2021;
        System.out.println("Year " + currentYear + " Високосный > " + Year(currentYear));

    }


// 1. Написать метод, принимающий на вход два целых числа и проверяющий,
//что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
//в противном случае – false.
    public static boolean SumCheck(int a, int b) {
        return (a + b >= 10) && (a + b <= 20);
    }
//2. Написать метод, которому в качестве параметра передается целое число,
//метод должен напечатать в консоль, положительное ли число передали или отрицательное.
//Замечание: ноль считаем положительным числом.
    public static boolean PrintConsole(int a) {
        return a >= 0;
    }

// Написать метод, которому в качестве параметра передается целое число.
//Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

    public static boolean ReturnValue(int a) {
        return a <= 0;
    }

//4. Написать метод, которому в качестве аргументов передается строка и число,
//метод должен отпечатать в консоль указанную строку, указанное количество раз;
    public static void PrintConsoleLine(String line, int number){
        for (int i = 0; i < number; i++ ) {
            System.out.println("string" + i + "-" + line);
        }
    }
//     * 5.* Написать метод, который определяет, является ли год високосным,
//     * и возвращает boolean (високосный - true, не високосный - false).
//     * Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
//     */
    public static boolean Year(int year){
        return (year % 4 == 0) && (year % 100 != 0) && (year % 400 == 0);

    }


}
