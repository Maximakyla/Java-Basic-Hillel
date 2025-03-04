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
        randomArrayValue(array, random);

        print(array);


        bubbleSort(array);
        print(array);
        scanner.close();
    }


    public static void bubbleSort(int[] array) {
        boolean sorted = false;
        for (int j = 0; j < array.length; j++) {
            if (sorted) {
                break;
            }
            sorted = true;
            for (int i = 0; i < array.length - j - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    sorted = false;
                }
            }
        }

    }


    public static void randomArrayValue(int[] array, Random random) {
        int randomMinimum = 1;
        int randomMaximum = 100;
        for (int i = 0; i < array.length; i++) {
            int randomNumber = random.nextInt(randomMaximum - randomMinimum + 1) + randomMinimum;
            array[i] = randomNumber;
        }
    }


    public static void print(int[] array) {
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
