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
            System.out.println("������������� �����");
        } else {
            System.out.println("������������� �����");
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
        System.out.println("Year " + currentYear + " ���������� > " + Year(currentYear));

    }


// 1. �������� �����, ����������� �� ���� ��� ����� ����� � �����������,
//��� �� ����� ����� � �������� �� 10 �� 20 (������������), ���� �� � ������� true,
//� ��������� ������ � false.
    public static boolean SumCheck(int a, int b) {
        return (a + b >= 10) && (a + b <= 20);
    }
//2. �������� �����, �������� � �������� ��������� ���������� ����� �����,
//����� ������ ���������� � �������, ������������� �� ����� �������� ��� �������������.
//���������: ���� ������� ������������� ������.
    public static boolean PrintConsole(int a) {
        return a >= 0;
    }

// �������� �����, �������� � �������� ��������� ���������� ����� �����.
//����� ������ ������� true, ���� ����� �������������, � ������� false ���� �������������.

    public static boolean ReturnValue(int a) {
        return a <= 0;
    }

//4. �������� �����, �������� � �������� ���������� ���������� ������ � �����,
//����� ������ ���������� � ������� ��������� ������, ��������� ���������� ���;
    public static void PrintConsoleLine(String line, int number){
        for (int i = 0; i < number; i++ ) {
            System.out.println("string" + i + "-" + line);
        }
    }
//     * 5.* �������� �����, ������� ����������, �������� �� ��� ����������,
//     * � ���������� boolean (���������� - true, �� ���������� - false).
//     * ������ 4-� ��� �������� ����������, ����� ������� 100-��, ��� ���� ������ 400-� � ����������.
//     */
    public static boolean Year(int year){
        return (year % 4 == 0) && (year % 100 != 0) && (year % 400 == 0);

    }


}
