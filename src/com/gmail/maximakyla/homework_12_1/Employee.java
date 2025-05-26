package com.gmail.maximakyla.homework_12_1;


public class Employee {
    private String surname;
    private String givenName;
    private String position;
    private String email;
    private String phoneNum;
    private int age;

    public Employee(String surname, String givenName, String position, String email, String phoneNum, int age) {
        this.surname = surname;
        this.givenName = givenName;
        this.position = position;
        this.email = email;
        this.phoneNum = phoneNum;
        this.age = age;
    }

    public Employee() {
        this.surname = "unknown";
        this.givenName = "unknown";
        this.position = "unknown";
        this.email = "unknown";
        this.phoneNum = "unknown";
        this.age = 0;
    }


}
