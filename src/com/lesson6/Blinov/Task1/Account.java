package com.lesson6.Blinov.Task1;
//Создать класс Account с внутренним классом, с помощью объектов которо-
//го можно хранить информацию обо всех операциях со счетом (снятие, пла-
//тежи, поступления).

import java.time.LocalDate;

public class Account {
    protected Operations[] history = new Operations[0];
    protected int numberOfOperations = 0;
    private float balance;

    public void makeOperation(String type, String adress, float summ) {
        Operations operation = new Operations();
        operation.moveMoney(type, adress, summ);
        Operations[] tmp = history;
        history = new Operations[numberOfOperations];
        System.arraycopy(tmp, 0, history, 0, tmp.length);
        history[numberOfOperations - 1] = operation;
        this.balance += operation.summ;
    }

    private class Operations {
        private String type;
        private LocalDate date;
        private String adress;
        private float summ;
        @Override
        public String toString() {
            return "Тип: " + type + "; Адресс: " + adress+"; Сумма: "+ summ;
        }
        Operations() {
            numberOfOperations++;
        }

        public void moveMoney(String type, String adress, float summ) {
            this.type = type;
            this.date = LocalDate.now();
            this.adress = adress;
            this.summ = summ;
        }
    }

    public void print() {
        for (Operations operations : history) {
            System.out.println(operations);
        }
        System.out.println("Баланс на счету: " + balance +" руб.");
    }

    public static void main(String[] args) {
        Account Vasilii=new Account();
        Vasilii.makeOperation("пополнение", "gintovta", 300.00f);
        Vasilii.makeOperation("платеж", "zorina", -50.45f);
        Vasilii.makeOperation("снятие", "bankomat", -80.00f);
        Vasilii.print();
    }
}

