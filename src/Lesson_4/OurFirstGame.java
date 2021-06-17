package Lesson_4;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 12.06.2021
 */

public class OurFirstGame {

    public static char[][] map;
    public static int mapWidth;
    public static int mapHeight;

    public static char playerHuman = 'X';
    public static char playerEnemy = 'O';
    public static char emptyField = '_';

    public static Scanner scanner = new Scanner(System.in); //pencil
    public static Random random = new Random();

    public static void main(String[] args) {
        createMap();
        showMap();

        while(true) {
            turnPlayerHuman();
            showMap();
            if (isWin(playerHuman)) {
                System.out.println("Human win");
                break;
            }

            if (isDraw()) {
                System.out.println("Draw");
                break;
            }

            turnPlayerEnemy();
            showMap();
            if (isWin(playerEnemy)) {
                System.out.println("PC win");
                break;
            }

            if (isDraw()) {
                System.out.println("Draw");
                break;
            }
        }
    }

    public static void createMap() {
        mapWidth = 3;
        mapHeight = 3;
        map = new char[mapHeight][mapWidth];

        for (int y = 0; y < mapHeight; y++) {
            for (int x = 0; x < mapWidth; x++) {
                map[y][x] = emptyField;
            }
        }
    }

    public static void showMap() {
        for (int y = 0; y < mapHeight; y++) {
            System.out.print("|");
            for (int x = 0; x < mapWidth; x++) {
                System.out.print(map[y][x] + "|");
            }
            System.out.println();
        }
        System.out.println("------------------");
    }

    public static void turnPlayerHuman() {
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

    public static void turnPlayerEnemy() {
        int x;
        int y;

        do {
            x = random.nextInt(mapWidth);
            y = random.nextInt(mapHeight);
        } while (!isEmptyField(y, x));

        map[y][x] = playerEnemy;
        System.out.println("Enemy turn in [" + (x + 1) + ":" + (y + 1) + "]");
    }

    public static boolean isDraw() {
        for (int y = 0; y < mapHeight; y++) {
            for (int x = 0; x < mapWidth; x++) {
                if (map[y][x] == emptyField) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isWin(char player) {

        if (map[0][0] == player && map[0][1] == player && map[0][2] == player) return true;
        if (map[1][0] == player && map[1][1] == player && map[1][2] == player) return true;
        if (map[2][0] == player && map[2][1] == player && map[2][2] == player) return true;

        if (map[0][0] == player && map[1][0] == player && map[2][0] == player) return true;
        if (map[0][1] == player && map[1][1] == player && map[2][1] == player) return true;
        if (map[0][2] == player && map[1][2] == player && map[2][2] == player) return true;

        if (map[0][0] == player && map[1][1] == player && map[2][2] == player) return true;
        if (map[0][2] == player && map[1][1] == player && map[2][0] == player) return true;

        return false;
    }

    public static boolean isEmptyField(int y, int x) {
        return map[y][x] == emptyField;
    }

    public static boolean isValidField(int y, int x) {
        return x >= 0 && x < mapWidth && y >= 0 && y < mapHeight;
    }

}
