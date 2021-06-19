package Lesson_4;

import java.util.Random;
import java.util.Scanner;

public class Home_Work4 {

    public static char[][] map;
    public static int mapSizeX;
    public static int mapSizeY;
    public static int winLength;

    public static char playerHuman = 'X';
    public static char playerEnemy = 'O';
    public static char emptyField = '_';

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void createMap() {   // Создание карты........
        mapSizeX = 5;
        mapSizeY = 5;
        winLength = 4;
        map = new char[mapSizeY][mapSizeX];

        for (int i = 0; i < mapSizeY; i++) {
            for (int j = 0; j < mapSizeX; j++) {
                map[i][j] = emptyField;
            }
        }
    }

    public static void showMap() {   // Распчатка карты...............
        System.out.print(" ");
        for (int i = 0; i < mapSizeX  * 2 + 1 ; i++){
            System.out.print((i % 2 == 0) ? " " : i / 2 + 1);
        }
        System.out.println();

        for (int i = 0; i < mapSizeY; i ++){
            System.out.print(i + 1 + "|");
            for (int j = 0; j < mapSizeX; j++) {
                System.out.print(map[i][j] + "|");
            }
            System.out.println();
        }
        for (int i = 0; i < mapSizeX * 2 + 1; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void turnPlayerHuman() { // Ход игрока..........
        int x;
        int y;

        do {
            System.out.print("Please enter your coordinates: ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isValidField(y, x) || !isEmptyField(y, x));

        map[y][x] = playerHuman;
        System.out.println("Human turn in [" + (x + 1) + ":" + (y + 1) + "]");
    }
    public static void turnPlayerEnemy() { // Ход PC...............
        if (turnHumanWinCell()) {  //
            return;                //
        }                          //
        if (turnAIWinCell()) {    // При задействоании данного условия при последующем ходе ИИ программа затирает ходы
            return;
        }

        int x;
        int y;
        do {
            x = random.nextInt(mapSizeX);
            y = random.nextInt(mapSizeY);
        } while (!isEmptyField(x, y));
        map[y][x] = playerEnemy;
        System.out.println("Enemy turn in [" + (x + 1) + ":" + (y + 1) + "]");
    }
    public static boolean turnAIWinCell() {
        for (int i = 0; i < mapSizeY; i++) {
            for (int j = 0; j < mapSizeX; j++) {
                if (isEmptyField(j, i)) {
                    map[i][j] = playerEnemy;
                    if (checkWin(playerEnemy)) {
                        return true;
                    }
                    map[i][j] = emptyField;
                }
            }
        }
        return false;
    }
    public static boolean turnHumanWinCell() {
        for (int i = 0; i < mapSizeY; i++) {
            for (int j = 0; j < mapSizeX; j++) {
                if (isEmptyField(i, j)) {
                    map[i][j] = playerHuman;
                    if (checkWin(playerHuman)) {
                        map[i][j] = playerEnemy;
                        return true;
                    }
                    map[i][j] = emptyField;
                }
            }
        }
        return false;
    }
    public static boolean checkWin(char c) {         // Условие победы
        for (int i = 0; i < mapSizeX; i++) {
            for (int j = 0; j < mapSizeY; j++) {
                if (checkLine(i, j, 1, 0, winLength, c)) {
                    return true;
                }
                if (checkLine(i, j, 1, 1, winLength, c)) {
                    return true;
                }
                if (checkLine(i, j, 0, 1, winLength, c)) {
                    return true;
                }
                if (checkLine(i, j, 1, -1, winLength, c)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean checkLine(int x, int y, int vx, int vy, int len, char c) {         // проверка
        final int farX = x + (len - 1) * vx;
        final int farY = y + (len - 1) * vy;
        if (!isValidField(farX, farY)) {
            return false;
        }
        for (int i = 0; i < len; i++) {
            if (map[y + i * vy][x + i * vx] != c) {
                return false;
            }
        }
        return true;
    }
    public static boolean isDraw() {      //Ничья
        for (int i = 0; i < mapSizeY; i++) {
            for (int j = 0; j < mapSizeX; j++) {
                if (map[i][j] == emptyField) {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isEmptyField(int y, int x) {
        return map[y][x] == emptyField;
    }

    public static boolean isValidField(int y, int x) {
        return x >= 0 && x < mapSizeY && y >= 0 && y < mapSizeX;
    }
    public static void main(String[] args) {

        createMap();
        showMap();

        while (true) {
            turnPlayerHuman();
            showMap();
            if (checkWin(playerHuman)) {
                System.out.println("Human win");
                break;
            }

            if (isDraw()) {
                System.out.println("Draw");
                break;
            }

            turnPlayerEnemy();
            showMap();
            if (checkWin(playerEnemy)) {
                System.out.println("PC win");
                break;
            }

            if (isDraw()) {
                System.out.println("Draw");
                break;
            }
        }
    }
}

