package com.JavaBegginerChapter1;

public class task3 {
    public static void main(String[] args) {
        int s=4500;
        int sec=s%60;
        int m=(s-sec)/60;
        int min=m%60;
        int h=(m-min)/60;
        System.out.println(h+" час "+ min+" минут "+ sec+" секунд");
    }
}
