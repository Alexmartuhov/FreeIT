package com.Collections.JBC3.Task30;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся
//        числа.
public class Task30 {
    public static void main(String[] args) {
        Random r = new Random();
        String number;
        List<String> numbers = new ArrayList<>(20);
        for (int i = 0; i < 20; i++) {
            number=Integer.toString(r.nextInt(30));
            numbers.add(i, number);
            System.out.print(numbers.get(i) +", ");
        }
        for (int i = 0; i < numbers.size(); i++) {
            while (i != numbers.lastIndexOf(numbers.get(i))) {
                int delete = numbers.lastIndexOf(numbers.get(i));
                numbers.remove(delete);
            }
        }
        System.out.println();
        for (String s : numbers) {
            System.out.print(s + ", ");
        }
    }
}
