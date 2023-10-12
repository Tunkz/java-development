package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");

        System.out.println("Please enter your first Name: ");
        String firstName = scanner.nextLine();

        System.out.println("Please enter your middle name: ");
        String middleName = scanner.nextLine();

        System.out.println("Please enter your Last Name: ");
        String lastName = scanner.nextLine();

        System.out.println("Please enter your suffix: ");
        String suffix = scanner.nextLine();
        if (suffix == "" && (middleName == "")) {
            System.out.println(firstName + "" + lastName);
        }

        String fullNameApplication = firstName + " " + middleName + "." + lastName + ", " + suffix + " ";
        System.out.println(fullNameApplication);
    }
}
