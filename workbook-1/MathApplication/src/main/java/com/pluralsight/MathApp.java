package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {


        int bobSalary = 270, garySalary = 340;
        int highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is " + highestSalary + " Dollars ");


        int carPrice = 200, truckPrice = 400;
        int smallestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The smallest price is " + smallestPrice + " Dollars ");

        double ar = 7.25;
        double cir = 7.25;
        double circleArea = Math.round(ar * cir);
        System.out.println("Area of a circle is " + circleArea + " square ft ");

    }

}
