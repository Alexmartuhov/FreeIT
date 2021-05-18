package com.JavaBegginerChapter1;


//Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
//произведение, т.е. факториал числа.
public class Task9 {
    public static void main(String[] args) {
        double averageSum;
        long sum = 0;
        long factorial = 1;
        int n = 0;
        int argument = 1;
        int x = (int) (Math.random() * 20);
        while (x != 0) {
            while (x >= argument) {
                factorial *= argument;
                argument++;
            }
            sum += factorial;
            n++;
            argument = 1;
            factorial = 1;
            x = (int) (Math.random() * 20);
        }
        if (n != 0) {
            averageSum = sum / n;
        } else {
            averageSum = 0;
        }
        System.out.println("среднее:" + averageSum);
    }
}

