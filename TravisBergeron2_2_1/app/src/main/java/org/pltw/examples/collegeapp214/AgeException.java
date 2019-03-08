package org.pltw.examples.collegeapp214;

import java.util.Calendar;

public class AgeException extends RuntimeException {
    public AgeException(String message) {
        super(message);
    }
    
    public static String joinMessageAndYear(String message, int year) {
        return message + " " + year;
    }
    
    public static boolean within8Years(int year) {
        return !(year < Calendar.getInstance().get(Calendar.YEAR));
    }
}
