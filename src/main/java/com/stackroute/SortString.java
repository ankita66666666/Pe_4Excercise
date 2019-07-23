package com.stackroute;

import java.util.Scanner;

public class SortString {
    String[] sortString(String str) {
        //spliting string here and represents single character
        String[] names = str.split(".s");
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < 3; j++) {
                if (names[j - 1].compareTo(names[j]) > 0) {
                    String temp = names[j - 1];
                    names[j - 1] = names[j];
                    names[j] = temp;
                }
            }
        }
        return names;
    }

}

