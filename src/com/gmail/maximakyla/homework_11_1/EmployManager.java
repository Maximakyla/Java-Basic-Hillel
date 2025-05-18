package com.gmail.maximakyla.homework_11_1;


public class EmployManager {
    public static void main(String[] args) {
        Person firstWorker = new Person("Maks", 26, "2nd Officer");
        Person secondWorker = new Person("Diana", 22, "teacher");
        Person thirdWorker = new Person("John", 30, "actor");
        System.out.print("1.");
        firstWorker.printPerson();
        secondWorker.printPerson();
        thirdWorker.printPerson();
        System.out.println();
        System.out.print("2.");
        firstWorker.printPerson();
        firstWorker.changeJob("Junior Java Developer");
        firstWorker.printPerson();

    }
}
