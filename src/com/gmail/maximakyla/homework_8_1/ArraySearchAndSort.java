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
        insertionSort(array);
        print(array);

        System.out.println("Input value of searching element in the array");
        int searchingElement = scanner.nextInt();
        binarySearch(array, searchingElement);

        scanner.close();
    }

    public static int binarySearch(int[] array, int searchingElement) {
        int leftIndex = 0;
        int rightIndex = array.length - 1;
        while (leftIndex <= rightIndex) {
            int middleIndex = leftIndex + (rightIndex - leftIndex) / 2;

            if (array[middleIndex] == searchingElement) {
                return middleIndex;
            } else if (array[middleIndex] < searchingElement) {
                leftIndex = middleIndex + 1;
            } else {
                rightIndex = middleIndex - 1;
            }
        }
        return -1;
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int currentArrayElement = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > currentArrayElement) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = currentArrayElement;
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
