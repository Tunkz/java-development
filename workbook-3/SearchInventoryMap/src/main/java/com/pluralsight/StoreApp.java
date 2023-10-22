package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class StoreApp {
    private static HashMap<Integer, Product> inventory = new HashMap<Integer, Product>();

    public static void main(String[] args) {
        loadInventory();

        Scanner scanner = new Scanner(System.in);
        System.out.println("What item # are you interested in? ");
        int id = scanner.nextInt();
        Product matchedProduct = inventory.get(id);
        if (matchedProduct == null) {
            System.out.println("We don't carry that product");
            return;
        }
        System.out.println("We carry %s and the price is $%.2f", matchedProduct.getName(), matchedProduct.getPrice();
    }



    public static void loadInventory(){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("inventory.csv"));
       String input;


       while((input = bufferedReader.readLine()) != null){
           String[] tokens = input.split("\\|");
           int id
       }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
