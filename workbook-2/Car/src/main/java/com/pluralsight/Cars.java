package com.pluralsight;

public class Cars {

    private String color;

    private int year;
    private String make;
    private String model;

    private int odometer;
    private int speed;


    public Cars(String color, int year, String make, String model, int odometer, int speed) {
        this.color = color;
        this.year = year;
        this.make = make;
        this.model = model;
        this.odometer = odometer;
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getOdometer() {
        return odometer;
    }

    public int getSpeed() {
        return speed;
    }
    public int accelerate( int accelerate) {
    return accelerate;
    }
}


