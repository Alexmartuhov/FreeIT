package com.JavaBegginerChapter1;

import java.util.Random;

public class task8 {
    public static void main(String[] args) {
        Random rand = new Random();
        int y = rand.nextInt();
        int x;
        if (y<0)
            x=y*(-1);
        else x=y;
        int ost100 = x % 100;
        int ost10 = x % 10;
        System.out.print(y);
        if ((ost100 < 20)&&(ost100>10))
        System.out.println(" рублей");
        else {
            switch (ost10){
                case 1: System.out.println(" рубль");
                    break;
                case 2: System.out.println(" рубля");
                    break;
                case 3: System.out.println(" рубля");
                    break;
                case 4: System.out.println(" рубля");
                    break;
                default: System.out.println(" рублей");
            }
        }
    }
}
