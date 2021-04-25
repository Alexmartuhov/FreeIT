package com.DateInterfaceLesson9.Date;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

//Вывести дату в формате даты (DD/MM/YYYY) + время hh:mm:ss
public class Task3 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(simpleDateFormat.format(date));
        System.out.println("============");
        LocalDateTime localDate = LocalDateTime.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(localDate.format(timeFormatter));

    }
}
