package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //old way
        /*String[] kids1 = {"Natalie","Hamza", "Joshua"};
        System.out.println("The first element is: " + kids1[0]);
        for (String kids: kids1) {
            System.out.println(kids);
        }*/


        // new way
        ArrayList<String> kids = new ArrayList<>();

        System.out.println("Initial ArrayList");

        kids.add("Natalie");
        kids.add("Joshua");
        kids.add("Hamza");

        System.out.println(kids);
        System.out.println("--------------------");
        // for (int i = 0; i < kids.size(); i++){
        //   System.out.println(kids.get(i));
        //}

        System.out.println("ArrayList are updating");
        kids.set(1, "Roni");


        System.out.println(kids);
        System.out.println("----------------");

        System.out.println("ArrayList after removing");

        kids.remove(0);

        System.out.println(kids);
        System.out.println("----------------");

        System.out.println("ArrayList after adding");

        kids.add("Julio");

        System.out.println(kids);
        System.out.println("-----------------");

        System.out.println("ArraList after Sorting");
        Collections.sort(kids);

        System.out.println(kids);
        System.out.println("-----------------------");
        }


}
