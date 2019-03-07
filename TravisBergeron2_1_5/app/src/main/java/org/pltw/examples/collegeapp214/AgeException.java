package org.pltw.examples.collegeapp214;

public class AgeException extends RuntimeException {
    public AgeException(String message) {
        super(message);
    }
    
    public static String joinMessageAndYear(String message, int year) {
        return "message " + year;
    }
}
