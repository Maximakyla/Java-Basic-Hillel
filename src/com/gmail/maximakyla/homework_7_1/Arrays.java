package com.gmail.maximakyla.homework_7_1;

import java.util.Random;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input value of array elements");
        int arrayMaxValue = scanner.nextInt();
        int[] array = new int[arrayMaxValue];
        Random rand = new Random();

// Random numbers
        if (array.length == 0) {
            System.out.println("1.Empty array created");
        }
        int min = -100, max = 100;
        for (int i = 0; i < array.length; i++) {
            int randomNumber = rand.nextInt((max - min) + 1) + min;
            array[i] = randomNumber;

            if (i == 0) {
                System.out.printf("1.Elements of array [%d,", randomNumber);
            } else if (i < array.length - 1) {
                System.out.print(randomNumber + ",");
            } else System.out.print(randomNumber);

            if (i == array.length - 1) {
                System.out.println("]");
            }
        }

// Sum of negative numbers
        for (int i = 0, sumNegativeNumbers = 0; i < array.length; i++) {
            if (array[i] < 0) {
                sumNegativeNumbers += array[i];
            }
            if (i == array.length - 1) {
                System.out.println("2.Sum of negative numbers is " + sumNegativeNumbers);
            }
        }

// Even and odd numbers
        for (int i = 0, evenNumbersCounter = 0, oddNumbersCounter = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenNumbersCounter++;
            } else oddNumbersCounter++;
            if (i == array.length - 1) {
                System.out.printf("3.Even number counter: %d, odd number counter: %d\n", evenNumbersCounter, oddNumbersCounter);
            }
        }
//Maximum, minimum and indices
        int maximumNumber = 0;
        int maximumNumberIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= maximumNumber) {
                maximumNumber = array[i];
                maximumNumberIndex = i;
            }
        }
        System.out.printf("4.Maximum number is %d with index %d\n", maximumNumber, maximumNumberIndex);

        int minimumNumber = 0;
        int minimumNumberIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= minimumNumber) {
                minimumNumber = array[i];
                minimumNumberIndex = i;
            }
        }
        System.out.printf("5.Minimum number is %d with index %d\n", minimumNumber, minimumNumberIndex);

// Average sum of all numbers in arrays after first negative number
        boolean negativeNumberFinder = false;
        int averageNumbersCounter = 0;
        double averageNumber = 0;
        double sumOfNumbersAfterFirstNegative = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] < 0 && !negativeNumberFinder) {
                negativeNumberFinder = true;
            } else if (negativeNumberFinder) {
                sumOfNumbersAfterFirstNegative += array[i];
                averageNumbersCounter++;
            }
        }
        averageNumber = Math.round((sumOfNumbersAfterFirstNegative / averageNumbersCounter) * 100.0) / 100.0;

        if (!negativeNumberFinder) {
            System.out.println("6.The array does not contain negative numbers.");
        } else if (averageNumbersCounter == 0) {
            System.out.println("6.The first negative number is the last in the array.");
        } else System.out.println("6.Average sum of numbers after first negative is " + averageNumber);
        scanner.close();
    }
}

