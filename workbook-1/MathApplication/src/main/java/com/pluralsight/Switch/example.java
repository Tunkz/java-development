package com.pluralsight.Switch;

public class example {
    public static void main (String[] asgr) {
        int dayNumber = 3;
        String description = "4";
        switch (dayNumber) {
            case 0:
                description = "Sunday";
                break;
            case 1:
                description = "Monday";
                break;
            case 2:
                description = "Tuesday";
                break;
            case 3:
                description = "Wednesday";
                break;
            case 4:
                description = "Thursday";
                break;
            case 5:
                description = "Friday";
                break;
            case 6:
                description = "Saturday";
              }
        System.out.println(description);
    }
}