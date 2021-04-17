package com.strays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicStampedReference;

//4)Текстовый файл содержит текст. После запуска программы в другой файл
//        должны записаться только те предложения в которых от 3-х до 5-ти слов. Если в
//        предложении присутствует слово-палиндром, то не имеет значения какое кол-во
//        слов в предложении, оно попадает в новый файл.
//        Пишем все в ООП стиле. Создаём класс TextFormater
//        в котором два статических метода:
//        1. Метод принимает строку и возвращает кол-во слов в строке.
//        2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если
//        есть возвращает true, если нет false
//        В main считываем файл.
//        Разбиваем текст на предложения. Используя методы класса TextFormater
//        определяем подходит ли нам предложение. Если подходит добавляем его в
//        новый файл
public class Task4 {
    public static void main(String[] args) {
        class TextFormater {
            int wordNumber(String str) {
                String[] word = str.split("[\\s]*");
                return word.length;
            }

            boolean polindrom(String sentence) {
                String[] word = sentence.split("\\s*(\\s|,|!|\\.)\\s*");
                boolean polindrom = false;
                for (int i = 0; i < word.length; i++) {
                    String wordNew = "";
                    if (word[i].length() > 2 && word[i].length() % 2 != 0) {
                        for (int j = word[i].length()-1; j >= 0; j--) {
                            wordNew = wordNew + word[i].charAt(j);
                        }
                        polindrom = wordNew.equalsIgnoreCase(word[i]);
                        if (polindrom) break;
                    }
                }

                return polindrom;
            }
        }
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String[] sentence = string.split("[.!?]\\s*");
        int wordNumber;
        for (int i = 0; i < sentence.length; i++) {
            TextFormater str = new TextFormater();
            wordNumber = str.wordNumber(sentence[i]);
            if (wordNumber >= 3 && wordNumber <= 5) {
                System.out.println(sentence[i]);
                continue;
            }
            if (str.polindrom(sentence[i])) {
                System.out.println(sentence[i]);
            }
        }
    }
}


