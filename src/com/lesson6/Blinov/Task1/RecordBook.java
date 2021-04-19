package com.lesson6.Blinov.Task1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//Создать класс Зачетная Книжка с внутренним классом, с помощью объек-
//тов которого можно хранить информацию о сессиях, зачетах, экзаменах.
public class RecordBook {
    String university;
    String faculty;
    String name;
    List<Session> history;

    RecordBook(String university, String faculty, String name) {
        this.university = university;
        this.faculty = faculty;
        this.name = name;
        history = new ArrayList<>();
    }

    public void startSession(int year, String season) {
        Session session = new Session(year, season);
        history.add(session);
    }

    public void printRecordBook() {
        System.out.println("Университет: " + university);
        System.out.println("Факультет: " + faculty);
        System.out.println("Ф.И.О. : " + name);
        for (Session session : history) {
            System.out.println(session);
        }
    }


    private class Session {
        Integer year;
        String season;
        public List<Test> tests;

        Session(int year, String season) {
            this.year = year;
            this.season = season;
            tests = new ArrayList<>();
        }

        public void printSession() {
            System.out.println("Учебный год: " + year);
            System.out.println("Сезон(зима/лето): " + season);
            for (Test test : tests) {
                System.out.println(test);
            }
        }

        void passedExam(String subject, String teacher, int rating) {
            Exam exam = new Exam();
            exam.setTeacher(teacher);
            exam.setSubject(subject);
            exam.setRating(rating);
            exam.setDate(LocalDate.now());
            tests.add(exam);
        }

        void passedOffset(String subject, String teacher, boolean passed) {
            Offset offset = new Offset();
            offset.setTeacher(teacher);
            offset.setSubject(subject);
            offset.setPassed(passed);
            offset.setDate(LocalDate.now());
            tests.add(offset);
        }

        private class Test {
            private String subject;
            private String teacher;
            private LocalDate date;

            public String getSubject() {
                return subject;
            }

            public String getTeacher() {
                return teacher;
            }

            public LocalDate getDate() {
                return date;
            }

            public void setSubject(String subject) {
                this.subject = subject;
            }

            public void setTeacher(String teacher) {
                this.teacher = teacher;
            }

            public void setDate(LocalDate date) {
                this.date = date;
            }
        }

        private class Exam extends Test {
            private int rating;

            public int getRating() {
                return rating;
            }

            public void setRating(int rating) {
                this.rating = rating;
            }
        }

        private class Offset extends Test {
            private boolean passed;

            public void setPassed(boolean passed) {
                this.passed = passed;
            }

            public boolean isPassed() {
                return passed;
            }
        }
    }
}
