package com.lesson3;
//Вычислить: 1+2+4+8+...+256
public class Task3 {
    public static void main(String[] args) {
        int x = 1, sum=0;
        do {
            sum+= x;
            x *= 2;
        } while(x<=256);
        System.out.print("Сумма: "+sum);
    }
}
