package com.pluralsight;

import java.util.HashMap;

public class IntroToHashmap {
    public static void main(String[] args) {
        // ArrayList<Integer> kids = new ArrayList<>();

        HashMap<String, String> statesAndCapitals = new HashMap<>();

        statesAndCapitals.put("CT", "Hartford");
        statesAndCapitals.put("CA", "Sacramento");
        statesAndCapitals.put("WA", "Olympia");
        statesAndCapitals.put("TX", "Austin");
        statesAndCapitals.put("FL", "Tallahassee");
        System.out.println(statesAndCapitals);

        // System.out.println(statesAndCapitals.get("TX"));

        /*String value = statesAndCapitals.get("");*//*
        if (value != null) {
            System.out.println(value);
        } else {
            System.out.println("This key is not valid");

            statesAndCapitals.remove("CA");
            System.out.println(statesAndCapitals);
            statesAndCapitals.clear();
            System.out.println(statesAndCapitals);*/
        for (String value : statesAndCapitals.values()) {
            System.out.println(value);

            System.out.println("=================");

            for (String key : statesAndCapitals.keySet()){
                System.out.println(key + ": " + statesAndCapitals.get(key));
            }
        }
    }
}

