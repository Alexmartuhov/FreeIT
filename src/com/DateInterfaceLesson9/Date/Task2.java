package com.DateInterfaceLesson9.Date;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

//По введенной дате вывести возраст
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год в формате \"гггг\"");
        int setYear = sc.nextInt();
        System.out.println("Введите месяц в формате \"ММ\"");
        int setMonth = sc.nextInt();
        System.out.println("Введите день месяца в формате \"дд\"");
        int setDay = sc.nextInt();

        Calendar calendar = Calendar.getInstance();
        Calendar dateOfBirth = (Calendar) calendar.clone();
        dateOfBirth.clear();
        dateOfBirth.set(Calendar.MONTH, setMonth - 1);
        dateOfBirth.set(Calendar.DATE, setDay);
        dateOfBirth.set(Calendar.YEAR, setYear);
        int yearsOld = calendar.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);
        int dayOld = calendar.get(Calendar.DAY_OF_YEAR) - dateOfBirth.get(Calendar.DAY_OF_YEAR);
        if (dayOld < 0) {
            yearsOld -= 1;
        }
        System.out.println("Возраст: " + yearsOld);
        System.out.println("============");
        LocalDate localDate = LocalDate.now();                        //решение через java.time
        LocalDate birthDate = LocalDate.of(setYear, setMonth, setDay);
        yearsOld = localDate.getYear() - birthDate.getYear();
        dayOld = localDate.getDayOfYear() - birthDate.getDayOfYear();
        if (dayOld < 0) {
            yearsOld -= 1;
        }
        System.out.println("Возраст: " + yearsOld);
    }
}
