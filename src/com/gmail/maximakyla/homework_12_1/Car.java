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

    public void start() {
        this.startCommand();
        this.startElectricity();
        this.startFuelSystem();
    }

    private void startElectricity() {

    }

    private  void startCommand() {

    }

    private  void startFuelSystem() {

    }

}
