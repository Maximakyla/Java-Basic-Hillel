package com.gmail.maximakyla.homework_11_1;

public class Person {
    private String name;
    private int age;
    private String job;

    public Person(String n, int a, String j) {
        name = n;
        age = a;
        job = j;
    }

    public void changeJob(String j) {
        job = j;
    }

    public void printPerson() {
        System.out.printf("Name: %s, Age: %d, Job: %s \n", name, age, job);
    }

}
