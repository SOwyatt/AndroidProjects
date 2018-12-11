package org.pltw.examples.weather;

/**
 * Created by wdumas on 3/3/16.
 */
public class WeatherConditionals {

    private static String conditions = new String("");

    public static String getWeatherAdvice(int temperature, String description){
        if (temperature >= 65 && description.equalsIgnoreCase("Cloudy")) {
            return "You're in San Jose.";
        }
        else if (description.equalsIgnoreCase("Fair")) {
            return "You're in Santa Fe.";
        }
        else {
            return "Bring an Umbrella!";
        }
    }

    private static int addCondition(String condition) {
        /* Takes a condition from yahoo's list of weather descriptions and returns 0 for a favorable condition, 1 for an unfavorable condition,
        and two for a dangerous condition    */
        int result = 0;

        if(condition.equals("smoky") || condition.contains("thunder") || condition.equals("tornado") || condition.equals("hurricane") || condition.equals("tropical storm") || condition.contains("mixed rain")) {
            //Checks for dangerous conditons
            result = 2;
        }
        else if(condition.contains("rain") || condition.equals("windy")) {
            //Checks for unfavorable but not dangerous conditions
            result = 1;
        }
        else { result = 0; }

        //Adds condition to list of conditions
        conditions += (conditions.isEmpty()) ? (condition) : (", " + condition);

        System.out.println(conditions);
        return result;
    }

    public static String getHikingAdvice(int temperature, int windchill, int humidity, String description){
        //Description is assumbed to be a String in the form of Yahoo weather codes seperated by commas.
        /**
         Dangerous:
         * + Mixed rain and anything
         * + Hail
         * + Extreme Weather
         * + Feels under 30 Degrees farenheight
         * + Over 95 Degrees
         * + Thunderstorms
         * + Smoky

         Unfavorable:
         * + Rain
         * + feels under 50 degrees
         * + over 70 degrees
         * + Windy
         * + Humidity over 80%
         */

        String result = "";

        int dangerLevel = 0; //A level of danger 0-2
        int feelsLike = temperature - windchill;

        //Breaks description into an array of conditions
        String[] condDesc = description.split(",");

        //Iterates throgh list of conditions, checking each
        for(int i = 0; i < condDesc.length; i++) {
            int curDanger = addCondition(condDesc[i]);
            if (curDanger > dangerLevel) { //If the last condition was more dangerous than all before it
                dangerLevel = curDanger;
            }
        }

        //Checks for dangerous/unfavorable temperature conditions
        if(dangerLevel == 0) { //Only operates if danger has already not been detected
            if(feelsLike < 30 || feelsLike > 95) { // If it's dangerously hot or cold
                dangerLevel = 2;
            }
            else if(feelsLike < 50 || feelsLike > 70 || humidity > 80) { //If it's NOT dangerously hot or cold AND uncomfortably hot or cold
                dangerLevel = 1;
            }
        }

        //Sets danger string to a level based on its int (would best be done by a switch but that's much bulkier)
        String dangerString = (dangerLevel == 0) ? "a great idea" : (dangerLevel == 1) ? "unfavorable" : "too dangerous";
        result = "It is " + temperature + " degrees, but feels like " + feelsLike + ". It is: " + conditions +". There is " + humidity + "% humidity. It is " + dangerString + " to go hiking.";
        return result;
    }


}
