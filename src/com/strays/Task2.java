package com.strays;

//Заменить все вхождения символа стоящего в позиции (3) на сивол стоящий в
//        позиции 0
public class Task2 {
    public static void main(String[] args) {
        String str = new String("It was the best of times, it was the worst of times,\n it was the age of wisdom, it was the age of foolishness, it was the epoch of belief");
        String strnew = str.replace(str.charAt(3),str.charAt(0));
        System.out.println(strnew);
    }
}
