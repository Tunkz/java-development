package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        //System.out.println("Today's : " + today);

        LocalTime time = LocalTime.now();
        //System.out.println("The current time is " + time);

        LocalDateTime rightNow = LocalDateTime.now();
        System.out.println("The current date and time is " + rightNow);


        /*System.out.println("Day of Week: " + today.getDayOfWeek());
        System.out.println("Day of Month: " + today.getDayOfMonth());
        System.out.println("Day of Year: " + today.getDayOfYear());
        System.out.println("Month name: " + today.getMonth());
        System.out.println("Month Value: " + today.getMonthValue());
        System.out.println("Year: " + today.getYear());


        System.out.println("=========================================================");

        System.out.println("Hour: " + time.getHour());
        System.out.println("Minute: " + time.getMinute());
        System.out.println("Second: " + time.getSecond());
        System.out.println("Nanosecond: " + time.getNano());*/


        /*DateTimeFormatter fmt = DateTimeFormatter.ofPattern("E, MMM dd, yyyy HH:mm:ss");
        String formattDate = rightNow.format(fmt);
        System.out.println("The formatted result is: " + formattDate);

        String userInput = "10/12/2000";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate birthDay = LocalDate.parse(userInput,formatter);

        System.out.println(birthDay);*/



    }
}
