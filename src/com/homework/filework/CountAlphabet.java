package com.homework.filework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountAlphabet {
    private int uppercaseLetters[] = new int[26];
    private int lowercaseLetters[] = new int[26];
    public boolean inputLetters() throws FileNotFoundException {
        try {
            Scanner input = new Scanner(new File("src/dab.txt"));
            String tmp;
            while(input.hasNextLine()) {
                tmp = input.nextLine();
                countLettersInStr(tmp);
            }
        } catch (FileNotFoundException bla) {
            System.out.println("FILE NOT FOUND!!1!");
            return false;
        }

        return true;
    }
    void countLettersInStr(String tmp) {
        char characters[] = tmp.toCharArray();
        for(int i = 0; i < tmp.length(); i++) {
            if(tmp.charAt(i) >= 'a' && tmp.charAt(i) <= 'z') {
                lowercaseLetters[characters[i] - 'a']++;
            }
            if(tmp.charAt(i) >= 'A' && tmp.charAt(i) <= 'Z') {
                uppercaseLetters[characters[i] - 'A']++;
            }
        }
    }

    void printLetters() {
        for(int i = 0; i < 26; i++) {
            if(uppercaseLetters[i] != 0) {
                System.out.println((char)(i + 'A') + ":" + uppercaseLetters[i]);
            }
        }
        for(int i = 0; i < 26; i++) {
            if(lowercaseLetters[i] != 0) {
                System.out.println((char)(i + 'a') + ":" + lowercaseLetters[i]);
            }
        }
    }

    //getters
    public int[] getUppercaseLetters() {
        return uppercaseLetters;
    }

    public int[] getLowercaseLetters() {
        return lowercaseLetters;
    }

    //setters
    public void setUppercaseLetters(int[] uppercaseLetters) {
        this.uppercaseLetters = uppercaseLetters;
    }

    public void setLowercaseLetters(int[] lowercaseLetters) {
        this.lowercaseLetters = lowercaseLetters;
    }
}
