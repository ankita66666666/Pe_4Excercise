package com.stackroute;

public class ReplaceCharacters {
    String string1;

    public String replaceCharacters(String inputString){
        if(inputString==null){
            return null;
        }
        String result=inputString.replaceAll("d","f");

               string1= result.replaceAll("l","t");
               return string1;
    }
}



