package com.gmail.maximakyla.homework_9_1;

import java.util.Random;
import java.util.Scanner;

public class MultiDimensionsArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter 1st array dimension  length");
        int firstDimensionArrayLength = scanner.nextInt();
        System.out.println("Enter 2nd array dimension length");
        int secondDimensionArrayLength = scanner.nextInt();
        int[][] array = new int[firstDimensionArrayLength][secondDimensionArrayLength];
        System.out.println("Enter lower random limit for array elements filling");
        int randomMinimumLimit = scanner.nextInt();
        System.out.println("Enter upper random limit for array elements filling");
        int randomMaximumLimit = scanner.nextInt();
        arrayRandomFill(array, random, randomMaximumLimit, randomMinimumLimit);
        arrayPrint(firstDimensionArrayLength, secondDimensionArrayLength, array);
        sumOfEvenOrOddNumbersInRow(array);
        multiplyOfEvenOrOddNumbersInColumn(array);
        isArrayMagicSquare(array, firstDimensionArrayLength, secondDimensionArrayLength);
        scanner.close();
    }


    private static void isArrayMagicSquare(int[][] array, int firstDimensionArrayLength, int secondDimensionArrayLength) {
        int sumRow = 0;
        for (int i = 0; i < array.length; i++) {
            sumRow += array[0][i];
        }
        boolean isEqual = true;
        if (firstDimensionArrayLength != secondDimensionArrayLength) {
            isEqual = false;
        }
        int rowCheck = 0;
        for (int i = 1; isEqual && i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                rowCheck += array[i][j];
            }
            if (sumRow != rowCheck) {
                isEqual = false;
                break;
            }
            rowCheck = 0;
        }
        int columnCheck = 0;
        for (int i = 0; isEqual && i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                columnCheck += array[j][i];
            }
            if (columnCheck != sumRow) {
                isEqual = false;
                break;
            }
            columnCheck = 0;
        }
        int diagonal = 0;
        for (int i = 0; isEqual && i < array.length; i++) {
            diagonal += array[i][i];
        }
        if (diagonal != sumRow) {
            isEqual = false;
        }
        diagonal = 0;
        int j = array.length - 1;
        for (int i = 0; isEqual && i < array.length; i++) {
            diagonal += array[i][j];
            j--;
        }
        if (diagonal != sumRow) {
            isEqual = false;
        }
        if (isEqual) {
            System.out.println("It is a magic square!");
        } else {
            System.out.println("It is not a magic square");
        }
    }

    private static void multiplyOfEvenOrOddNumbersInColumn(int[][] array) {
        System.out.println();
        long evenColumn = 1;
        long oddColumn = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j % 2 == 0) {
                    evenColumn *= array[i][j];
                } else {
                    oddColumn *= array[i][j];
                }
            }
        }
        System.out.printf("Multiply of all elements in even column is: %d \n", evenColumn);
        System.out.printf("Multiply of all elements in odd column is: %d \n\n", oddColumn);
    }

    private static void sumOfEvenOrOddNumbersInRow(int[][] array) {
        System.out.println();
        int oddNumbers = 0;
        int evenNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < array[i].length; j++) {
                    evenNumbers += array[i][j];
                }
            } else {
                for (int k = 0; k < array[i].length; k++) {
                    oddNumbers += array[i][k];
                }
            }
        }
        System.out.printf("Sum of numbers in even row is: %d \n", evenNumbers);
        System.out.printf("Sum of numbers in odd row is: %d \n", oddNumbers);
    }

    private static void arrayPrint(int firstDimensionArrayLength, int secondDimensionArrayLength, int[][] array) {
        System.out.printf("Array %d x %d: ", firstDimensionArrayLength, secondDimensionArrayLength);
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
        }
        System.out.println();
    }

    private static void arrayRandomFill(int[][] array, Random random, int randomMaximumLimit, int randomMinimumLimit) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int randomNumber = random.nextInt(randomMaximumLimit - randomMinimumLimit + 1) + randomMinimumLimit;
                array[i][j] = randomNumber;
            }
        }
    }
}
