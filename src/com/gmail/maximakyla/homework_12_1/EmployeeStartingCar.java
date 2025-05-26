package com.gmail.maximakyla.homework_12_1;

public class EmployeeStartingCar {
    public static void main(String[] args) {
        Employee harry = new Employee("Vega","Harry","Worker","vegaharry@gmail.com","+380951234678",33);
        Car sportCar = new Car();
        sportCar.start();
        System.out.println("Worker " + harry.getName() + " started the car!");
    }
}
