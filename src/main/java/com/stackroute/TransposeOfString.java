package com.stackroute;

public class TransposeOfString {

    String transposeString(String str) {
        String reverse = "";
        String newString="";
        //spliting string here
        String[] names = str.split(" ");
        for (int j = 0; j < names.length; j++) {
         String word = names[j];
            for (int k = word.length() - 1; k >= 0; k--) {
                reverse = reverse + names[j].charAt(k);
            }

            reverse=reverse+" ";
            newString=reverse.trim();
        }
        //it will reverse the new string after transpose
        return newString;
    }
}

