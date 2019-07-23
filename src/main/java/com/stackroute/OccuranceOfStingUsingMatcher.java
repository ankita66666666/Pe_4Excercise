package com.stackroute;
//using regex for writing regular expression
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OccuranceOfStingUsingMatcher {

        public String matching(String inputString,String givenString){
            // using stringbuffer here for modification
            StringBuffer stringBuffer=new StringBuffer();
            Pattern pattern=Pattern.compile(givenString,Pattern.CASE_INSENSITIVE);
            Matcher matcher=pattern.matcher(inputString);
            while (matcher.find()){
                // Appending the value here
                stringBuffer.append("Found at: ").append(matcher.start()).append(" - ").append(matcher.end()).append("\n");
            }
            return stringBuffer.toString().trim();
        }
    }

