package com.stackroute;

public class CountCharacter {
    int num;

    public int countCharacter(String inputString, char characterInput) {

//here replacing the sting by giving character input
        num = inputString.length() - inputString.replaceAll(String.valueOf(characterInput), "").length();
        System.out.println(num);
        //here returning num value
        return num;
    }
}

