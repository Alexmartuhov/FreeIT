package com.JavaBegginerChapter1;


import java.util.Random;

//Определите сумму элементов одномерного массива, расположенных между
//        минимальным и максимальным значениями.
public class Task16 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] i = new int[10];
        int max=0, min=100;
        int maxnumber=0,minnumber=0,sum=0;
        for (int j = 0; j < i.length; j++) {
            i[j] = r.nextInt(100);
            if (i[j] > max) {
                max = i[j];
                maxnumber=j;
                            }
            if (i[j] < min) {
                min = i[j];
                minnumber=j;
            }
            System.out.print(i[j]+" ");
        }
        System.out.println();
//        Случай когда максимальны и минимальных значений в массиве несколько не рассматриваем,
//        так как задача сильно усложняется и методика подсчета не ясна
        if (minnumber>maxnumber){
            for (int j=maxnumber+1;j<minnumber;j++){
                sum+=i[j];
            }
        }
        else {
            for (int j = minnumber + 1; j < maxnumber; j++) {
                sum += i[j];
            }
        }
        System.out.println(sum);
    }
}
