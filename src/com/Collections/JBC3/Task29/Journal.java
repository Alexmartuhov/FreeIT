package com.Collections.JBC3.Task29;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Создать список оценок учеников с помощью ArrayList, заполнить случайными
//        оценками. Удалить неудовлетворительные оценки из списка.
public class Journal {
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
    }

    private static Random r = new Random();


    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Student student = new Student("name" + (i+1), r.nextInt(10) + 1);
            studentList.add(student);
            System.out.println(student);
        }
        for (int i = studentList.size() - 1; i >= 0; i--) {
            Student student = studentList.get(i);
            if (student.score < 4) {
                studentList.remove(i);
            }
        }
        System.out.println("---------------------");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}

