package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StoreApp {
    public static void main(String[] args) {
        ArrayList<product> inventor = getInventory();

        Collections.sort(inventor, Comparator.comparing(product ::getName));




        System.out.println("We carry the following inventory");

        for (int i = 0; i < inventor.size(); i++) {
            product p = inventor.get(i);
            /*System.out.printf("id: %d - Name: %s - Price: $%.2f",
                    p.getId(),p.getName(),p.getPrice());*/
            System.out.println(p);
        }

        Scanner scanner = new Scanner(System.in);

    }

    public static ArrayList<product> getInventory() {
        ArrayList<product> inventory = new ArrayList<product>();



        /*inventory.add(new product(1,"shoes", 19.99f));
        inventory.add(new product(2,"hat", 79.99f));
        inventory.add(new product(3,"earrings", 59.99f));
        inventory.add(new product(4,"pants", 39.99f));
        inventory.add(new product(5,"joggers", 29.99f));*/

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("inventory.csv"));
        String input;
            while((input = bufferedReader.readLine())  != null){
                String[] tokens = input.split("\\|");
                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                float price = Float.parseFloat(tokens[2]);

                product product = new product(id,name,price);
                inventory.add(product);
            }
        } catch (Exception e) {
            System.out.println("An error has occured!");
        }


        return inventory;

    }

}

