package com.pluralsight.collections;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        com.pluralsight.FixedList<Integer> numbers = new com.pluralsight.FixedList<>(3);
        numbers.add(10);
        numbers.add(3);
        numbers.add(92);
        //numbers.add(43); // this line should fail

        System.out.println(numbers.getItems().size());

        com.pluralsight.FixedList<LocalDate> dates = new com.pluralsight.FixedList<>(2);
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());
        //dates.add(15); // this line should fail


    }
}