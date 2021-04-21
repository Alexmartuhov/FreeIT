package com.lesson3;
//Вычислить: 1+2+4+8+...+256
public class Task3 {
    public static void main(String[] args) {
        int x = 1, sum=0;
        do {
            sum+= x;
            x *= 2;
        } while(x<=256);
        int sum2=0;
        for(int i=1; i<=256; i*=2){
            sum2+=i;
        }
        System.out.println("Сумма: "+sum);
        System.out.print("Сумма2: "+sum2);
    }
}
