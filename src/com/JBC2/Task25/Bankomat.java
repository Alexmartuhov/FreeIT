package com.JBC2.Task25;

import java.util.Scanner;

//Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в
//банкомате должен задаваться тремя свойствами: количеством купюр номиналом 20
//50 100. Сделать методы для добавления денег в банкомат. Сделать функцию
//снимающую деньги. На вход передается сумма денег. На выход – булевское
//значение (операция удалась или нет). При снятии денег функция должна
//рапечатывать каким количеством купюр какого номинала выдается сумма. Создать
//конструктор с тремя параметрами – количеством купюр.
public class Bankomat {
    int amount20;
    int amount50;
    int amount100;

    Bankomat(int amount20, int amount50, int amount100) {
        this.amount20 = amount20;
        this.amount50 = amount50;
        this.amount100 = amount100;
    }

    void addMoney(int add20, int add50, int add100) {
        this.amount20 += add20;
        this.amount50 += add50;
        this.amount100 += add100;
        System.out.println("______________________________________________________");
        System.out.println("В банкомат добавлено купюр: "+add20+" шт., "+add50+" шт., "+add100+" шт.");
        System.out.println("------------------------------------------------------");
    }

    boolean takeMoney(int summ) {
        int min20 = 0;
        int min50 = 0;
        int summ100, summ50, summ20;
        int money = amount20 * 20 + amount50 * 50 + amount100 * 100;
        if (money < summ || summ <= 10 || summ % 10 != 0 || summ == 30) return false;
        switch (summ % 100) {
            case 0:
                min20 = 0;
                min50 = 0;
                break;
            case 10:
                min20 = 3;
                min50 = 1;
                break;
            case 20:
                min20 = 1;
                min50 = 0;
                break;
            case 30:
                min20 = 4;
                min50 = 1;
                break;
            case 40:
                min20 = 2;
                min50 = 0;
                break;
            case 50:
                min20 = 0;
                min50 = 1;
                break;
            case 60:
                min20 = 3;
                min50 = 0;
                break;
            case 70:
                min20 = 1;
                min50 = 1;
                break;
            case 80:
                min20 = 4;
                min50 = 0;
                break;
            case 90:
                min20 = 2;
                min50 = 1;
                break;
        }
        if (min20 > amount20 || min50 > amount50) return false;
        summ100 = (summ - 20 * min20 - 50 * min50) / 100;
        summ20 = min20;
        summ50 = min50;
        if (summ100 > amount100) {
            summ50 = (summ - 20 * min20 - amount100*100) / 50;
            summ100 = amount100;
            if (summ50 > amount50) {
                summ50 = amount50;
                summ20 = (summ - amount50*50 - amount100*100) / 20;
            }
        }
        System.out.println("Выдано банкот номиналом 20: " + summ20 + " шт.");
        System.out.println("Выдано банкот номиналом 50: " + summ50 + " шт.");
        System.out.println("Выдано банкот номиналом 100: " + summ100 + " шт.");
        return true;
    }

    public static void main(String[] args) {
        Bankomat belGazPromBank = new Bankomat(3, 40, 3);
        System.out.println("Операция одобрена: " + belGazPromBank.takeMoney(5080));
        belGazPromBank.addMoney(1,0,15);
        System.out.println("Операция одобрена: " + belGazPromBank.takeMoney(5080));
        belGazPromBank.addMoney(0,100,100);
        System.out.println("Операция одобрена: " + belGazPromBank.takeMoney(5080));
    }
}
