package com.DateInterfaceLesson9.Date;
//По введенной дате вывести название месяца.
//Задачи решаются двумя способами, используя библиотеку java.util и java.time

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);                            //ввожу дату интом, стрингом будет сложнее
        System.out.println("Введите год в формате \"гггг\"");           //проверку на адекватность значений не делаю
        int setYear = sc.nextInt();
        System.out.println("Введите месяц в формате \"ММ\"");
        int setMonth = sc.nextInt();
        System.out.println("Введите день месяца в формате \"дд\"");
        int setDay = sc.nextInt();

        Calendar calendar = Calendar.getInstance();                     //создаю объект календаря, так как класса "дата" нельзя установить отдельные параметры
        calendar.set(Calendar.MONTH, setMonth - 1);                       //то есть можно, но только через миллисекунды
        calendar.set(Calendar.DATE, setDay);
        calendar.set(Calendar.YEAR, setYear);
        Date date = calendar.getTime();                                 //выводим название месяца через DateFormat
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM");
        System.out.println(simpleDateFormat.format(date));


        LocalDate localDate = LocalDate.of(setYear, setMonth, setDay);         //решение через java.time
        System.out.println(localDate);
        System.out.println(localDate.getMonth());
    }
}
