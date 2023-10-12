package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        StringBuilder addressBilling = new StringBuilder();

        Scanner scanner = new Scanner(System.in);

        addressBilling.append("\nFull name: ");
        String fullName = scanner.nextLine();

        addressBilling.append("\n\nBilling Street: ");
        String billinStreet = scanner.nextLine();

        addressBilling.append("\nBilling city: ");
        String billingCity = scanner.nextLine();

        addressBilling.append("\nBilling Zip: ");
        String billingZip = scanner.nextLine();

        addressBilling.append("\n\nShipping Street: ");
        String shippingStreet = scanner.nextLine();

        addressBilling.append("\nShipping City: ");
        String shippingCity = scanner.nextLine();

        addressBilling.append("\nShipping State: ");
        String shippingState = scanner.nextLine();

        addressBilling.append("\nShipping Zip: ");
        String shippingZip = scanner.nextLine();

        String addressLocation = addressBilling.toString();
        System.out.println(addressLocation);




    }
}
