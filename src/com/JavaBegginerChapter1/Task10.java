package com.JavaBegginerChapter1;


public class Task10 {
    public static void main(String[] args) {
        long factorial = 1;
        int argument = 1;
        int x = (int) (Math.random() * 5 + 10);
        while (x >= argument) {
            factorial *= argument;
            argument++;
        }
        System.out.println("Факториал числа " + x + ": " + factorial);
    }
}
