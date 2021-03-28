package com.JavaBegginerChapter1;

import java.util.Arrays;

public class Task17 {
    public static void main(String[] args) {
        int[][] massive = new int[11][11];
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++) {
                massive[i][j] = 0;
            }
            for(int j=i;j<=massive[i].length-1-i;j++){
                massive[i][j] = 1;
            }
            for(int j=massive[i].length-1-i;j<=i;j++){
                massive[i][j] = 1;
            }
            for (int j = 0; j < massive[i].length; j++) {
                System.out.print(massive[i][j] + " ");
            }
            System.out.println();
        }
    }
}

