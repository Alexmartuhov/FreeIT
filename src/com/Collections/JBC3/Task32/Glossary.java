package com.Collections.JBC3.Task32;

import java.util.*;

public class Glossary {

    public static void main(String[] args) {
        class Words {
            String name;
            int counter;

            public int getCounter() {
                return counter;
            }

            Words(String name) {
                this.name = name;
                this.counter = 1;
            }

            @Override
            public String toString() {
                return "Слово: " + name + " - " + counter+" шт.";
            }
        }


        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        List<Words> listWords = new ArrayList<>();
        String[] sentence = string.split("[.!?]\\s*");
        for (String s : sentence) {
            String[] arrayOfWords = s.split("\\s*(\\s|,|!|—|-|\\.)\\s*");
            for (String arrayOfWord : arrayOfWords) {
                Words word = new Words(arrayOfWord);
                listWords.add(word);
            }
        }
        for (int i = 0; i < listWords.size(); i++) {
            for (int j = i + 1; j < listWords.size(); j++) {
                Words word = listWords.get(i);
                if (word.name.equals(listWords.get(j).name)) {
                    word.counter++;
                    listWords.set(i, word);
                    listWords.remove(j);
                    j--;
                }
            }
        }
        Comparator<Words> r = Comparator.comparing(Words -> Words.getCounter());
        listWords.sort(r);
        for (int i = listWords.size() - 1; i >= 0; i--) {
            System.out.println(listWords.get(i));
        }
    }
}


