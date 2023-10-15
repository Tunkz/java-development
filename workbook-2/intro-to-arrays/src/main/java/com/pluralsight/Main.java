package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {123, 234, 4356, 4564, 234};
        String[] names = {"Buba", "Sahara", "Joshua"};

        /*int[] listOfNumbers = new int[3];
        listOfNumbers[0] = 123;
        listOfNumbers[1] = 123345567;
        listOfNumbers[2] = 987644521;

        Arrays.sort(numbers.);
        for (int number : numbers) {
            System.out.println(number); }*/

       String[] colors = {"red", "white", "blue"};
       String [] copy = new String[3];

       System.arraycopy(colors,0,copy,0,3);
        System.out.println(copy);
       colors[0] = "black";
        System.out.println(colors);
        System.out.println(copy);}
}