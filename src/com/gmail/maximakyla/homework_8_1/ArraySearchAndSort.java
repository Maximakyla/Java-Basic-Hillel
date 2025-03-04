package com.gmail.maximakyla.homework_8_1;

import java.util.Random;
import java.util.Scanner;

public class ArraySearchAndSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array length value");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        Random random = new Random();

        int randomMinimum = 1;
        int randomMaximum = 100;
        for (int i = 0; i < array.length; i++) {
            int randomNumber = random.nextInt(randomMaximum - randomMinimum + 1) + randomMinimum;
            array[i] = randomNumber;
        }

//        if (array.length == 0) {
//            System.out.print("Empty array created");
//        }

        print(array);
        scanner.close();
    }


















    private static void print(int[] array) {
        if (array.length == 0) {
            System.out.print("Empty array created");
        }
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("Array elements: [ ");
            }
            if (i == array.length - 1) {
                System.out.printf("%d ", array[i]);
                System.out.println("]");
            } else {
                System.out.printf("%d, ", array[i]);
            }
        }
    }
}
