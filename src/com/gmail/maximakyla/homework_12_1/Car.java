package com.gmail.maximakyla.homework_12_1;

public class Car {
    private String name;
    private String model;
    private double price;

    public Car(String name, String model, double price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public Car() {
        this.name = "unknown";
        this.model = "unknown";
        this.price = 0;

    }

    public static void start() {
        Car.startCommand();
        Car.startElectricity();
        Car.startFuelSystem();
    }

    private static void startElectricity() {

    }

    private static void startCommand() {

    }

    private static void startFuelSystem() {

    }

}
