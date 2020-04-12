package com.homework.filework;


import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        CountAlphabet cnt = new CountAlphabet();
        try {
            cnt.inputLetters();
            cnt.printLetters();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
