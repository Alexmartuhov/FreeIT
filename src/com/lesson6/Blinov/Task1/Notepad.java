package com.lesson6.Blinov.Task1;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Notepad {
    private Note[] notes;
    private LocalDate date;
    Scanner sc = new Scanner(System.in);

    public Notepad(int size) {
        this.notes = new Note[size];
        this.date = LocalDate.now();
        for (int i = 0; i < size; i++) {
            String note = sc.next();
            notes[i].setRecord(note);
        }
    }

    public class Note {
        private String record;

        public String getRecord() {
            return record;
        }

        public void setRecord(String record) {
            this.record = record;
        }
    }

    public Note[] getNotes() {
        return notes;
    }

    public void print() {
        System.out.println(date + ": ");
        System.out.println(Arrays.toString(notes));
    }
}
