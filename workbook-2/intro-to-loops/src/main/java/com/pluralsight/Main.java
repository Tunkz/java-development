package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        /*int i = 1;
        int sum = 0;
        while (i <= 10) {
        sum +=i;
        i++;
        }
        System.out.println(sum);
        }

        do {
            sum += 1;
            i++;
        }while(i<=10);
        System.out.println(sum);*/

        //int i = 0;

        //while (i < 10) {
        //  System.out.println(i);
        //i++;
       /* int sum = 0;
        for (int i = 1; i < 10; i++) {
            if (i % 3 == 0) {
                break;
            }
            sum += i;
        }
        System.out.println("Sum = " + sum);*/

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                continue;
            }
            sum += i;
        }
        System.out.println("Sum = " + sum);}
}