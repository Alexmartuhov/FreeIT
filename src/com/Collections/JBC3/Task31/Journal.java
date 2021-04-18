package com.Collections.JBC3.Task31;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

//Создать список оценок учеников с помощью ArryList, заполнить случайными
//оценками. Найти самую высокую оценку с использованием итератора.
public class Journal {
    static int amountOfStudents=5;
    static class Student {
        String name;
        int score;

        @Override
        public String toString() {
            return "Student{name=" + name + ", score=" + score + " }";
        }

        Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public int getScore() {
            return score;
        }
    }

    private static Random r = new Random();


    public static void main(String[] args) {
        int maxScore = 0;
        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < amountOfStudents; i++) {
            Student student = new Student("name" + (i + 1), r.nextInt(10) + 1);
            studentList.add(student);
            System.out.println(student);
        }
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student student =iterator.next();
            if (maxScore < student.getScore()) {
                maxScore = student.getScore();
            }
        }
        System.out.println("Максимальная оценка: " + maxScore);
    }
}


