package com.Arrays;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

//Разработать консольную игру крестики-нолики. В игре участвуют 2 игрока. Они
//по очереди вводят координаты клетки в которую хотят сделать ход. После
//Игра продолжается до победы одного из игроков или ничьи.
public class TickTakToe {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        char[][] field = new char[3][3];
        int count = 0;
        int progress = 0;
        char win = '=';

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                count++;
                field[i][j] = (char) (count + 48);
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
        do {
            do {
                System.out.print("Ходит Х, введите номер клетки: ");
                char move = (char) (48 + sc1.nextInt());
                count = 0;

                for (int i = 0; i < field.length; i++) {
                    for (int j = 0; j < field[i].length; j++) {
                        if (field[i][j] == move) {
                            field[i][j] = 'X';
                            count++;
                        }
                        System.out.print(field[i][j]);
                    }
                    System.out.println();
                }
            } while (count < 1);
            progress++;
            if (progress > 4) {
                for (int i = 0; i < 3; i++) {
                    if ((field[1][i] == field[0][i] && field[1][i] == field[2][i])) {
                        win = field[0][i];
                        break;
                    }
                    if (field[i][1] == field[i][0] && field[i][1] == field[i][2]) {
                        win = field[i][0];
                        break;
                    }
                }
                if ((field[0][0] == field[1][1] && field[0][0] == field[2][2]) ||
                        (field[0][2] == field[1][1] && field[2][0] == field[2][2])) {
                    win = field[1][1];
                    break;
                }
                if (win != '=') break;
            }
            if (progress == 9) break;
            do {
                System.out.print("Ходит O, введите номер клетки: ");
                char move = (char) (48 + sc1.nextInt());
                count = 0;

                for (int i = 0; i < field.length; i++) {
                    for (int j = 0; j < field[i].length; j++) {
                        if (field[i][j] == move) {
                            field[i][j] = 'O';
                            count++;
                        }
                        System.out.print(field[i][j]);
                    }
                    System.out.println();
                }
            } while (count < 1);
            if (progress > 4) {
                for (int i = 0; i < 3; i++) {
                    if ((field[1][i] == field[0][i] && field[1][i] == field[2][i])) {
                        win = field[0][i];
                        break;
                    }
                    if (field[i][1] == field[i][0] && field[i][1] == field[i][2]) {
                        win = field[i][0];
                        break;
                    }
                }
                if ((field[0][0] == field[1][1] && field[0][0] == field[2][2]) ||
                        (field[0][2] == field[1][1] && field[2][0] == field[2][2])) {
                    win = field[1][1];
                    break;
                }
                if (win != '=') break;
            }
            progress++;
        } while (progress < 10);
        if (win == '=') {
            System.out.println("Ничья!");
        }
        if (win == 'X') {
            System.out.println("Победили X!");
        }
        if (win == 'O') {
            System.out.println("Победили O!");
        }
    }
}
