package com.JavaBegginerChapter1;

public class Task9 {
    public static void main(String[] args) {
        double averageSum = 0;
        long factorial = 1;
        int arg = 1;
        int n = 0;
        long sum = 0;

        for (int x = (int) (Math.random() * 20.0D); x != 0; x = (int) (Math.random() * 20.0D)) {
            while (arg <= x) {
                factorial *= (long) arg;
                ++arg;
            }

            ++n;
            sum += factorial;
            arg = 1;
            factorial = 1L;
        }

        if (n != 0) {
            averageSum = (double) (sum / (long) n);
        } else {
            averageSum = 0.0D;
        }

        System.out.println("среднее:" + averageSum);
    }
}

