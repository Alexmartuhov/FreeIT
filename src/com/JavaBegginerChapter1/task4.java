package com.JavaBegginerChapter1;

public class task4 {
    public static void main(String[] args){
    int x=3684;
    int x1,x2,x3,x4;
    x1=x%10;
    x2=x/10%10;
    x3=x/100%10;
    x4=x/1000;
    System.out.println(""+x1+x2+x3+x4);
    System.out.println(x1*1000+x2*100+x3*10+x4);
}
}
