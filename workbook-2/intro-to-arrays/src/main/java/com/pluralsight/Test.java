package com.pluralsight;

public class Test {
    public static void main(String[] args) {
        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("first = " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("length of array = " + arrayLength);
        System.out.println("last = " + firstTen[arrayLength - 1]);

        int[] newArray;
        newArray = new int []{5,4,3,2,1,};
        for ( int i = 0; i < newArray.length; i++){
            System.out.print(newArray[i] + " ");
        }
    }

}
