package com.stackroute;

public class CountCharacter {
   int num;
    public int countCharacter(String inputString, char characterInput) {


                num=inputString.length() - inputString.replaceAll(String.valueOf(characterInput), "").length();
                System.out.println(num);
                return num;
    }
}

