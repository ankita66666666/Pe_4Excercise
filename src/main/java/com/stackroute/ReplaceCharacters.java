package com.stackroute;

public class ReplaceCharacters {
    String string1;

    // here we are replacing characters
    public String replaceCharacters(String inputString)
    {
        // replace d with f here
        String result = inputString.replaceAll("d", "f");

        string1 = result.replaceAll("l", "t");
        // it will return string
        return string1;
    }
}



