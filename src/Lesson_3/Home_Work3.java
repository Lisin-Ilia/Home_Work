package Lesson_3;

public class Home_Work3 {
    public static void main(String[] args) {

        ReplaceNumbers(); //1
        System.out.println("*********");
       FillingValue(100);//2
        System.out.println("*********");
        Multiply2();//3
        System.out.println("***********");
        Diagonal();//4
        System.out.println("***********");
         DoubleArg(5, 56);//5
        System.out.println("***********");
        MinMax();
        System.out.println("***********");


    }

    //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
// С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void ReplaceNumbers() {
        int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 1){
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        System.out.print(arr[i] + " | ");}
  System.out.println(" ");
}

// 2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    public static void FillingValue(int num) {
        int[] Array100 = new int[num];
        for (int i = 0; i < Array100.length; i++){
            Array100[i] = (i + 1);
            System.out.print(Array100[i] + " | ");
        }System.out.println(" ");
    }

//3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
 public static void Multiply2() {
    int[] Array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    for (int i = 0; i < Array.length; i++) {
        if (Array[i] < 6) Array[i] = Array[i] * 2;
            System.out.print(Array[i] + " | ");
    }System.out.println(" ");


}

// 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
//Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
public static void Diagonal() {
    int N = 5;
    int array[][] = new int[N][N];
    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array.length; j++)
            if (i == j || array.length - i - 1 == j)
                System.out.print("1 ");
            else
                System.out.print("0 ");
        System.out.println();
    }
}

////5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len,
////каждая ячейка которого равна initialValue;
public static int[] DoubleArg(int len, int initialValue){
        int[] array5 = new int[len];
        for (int i = 0; i < array5.length; i++) {
            array5[i] = initialValue;
            System.out.print(array5[i] + " | ");
        }
    System.out.println();
     return  array5;
    }

////6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ; [10,15,20,0,1,5,15] min = 0, max = 20

public static void MinMax(){
    int array[] = {10, 15, 20, 0, 1, 5, 15};
    int min;
    int max;
    min = max = array[0];

    for (int i = 1; i < array.length; i++) {
        if (array[i] < min)
            min = array[i];
        if(array[i] > max){
            max = array[i];
        }
    }
    System.out.println("min =" + min + "; max =" + max);
        }

// 7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
//метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
// * **Примеры:
//            * checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
//            * checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
//            * checkBalance([1, 1, 2, 1]) → false
//            * граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.
}