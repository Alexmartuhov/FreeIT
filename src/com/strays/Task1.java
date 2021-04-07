package com.strays;
//Вырезать подстроку из строки начиная с первого вхождения символа(А) до,
//        последнего вхождения сивола(B).
public class Task1 {
    public static void main(String[] args) {
        String str = new String("ABrAkadaBrA");
        String s = str.substring(str.indexOf("A"), str.lastIndexOf("B"));
        System.out.println(s);
    }
}
