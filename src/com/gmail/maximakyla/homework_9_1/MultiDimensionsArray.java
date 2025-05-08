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
        System.out.printf("Sum of numbers in even row is: %d \n", sumOfEvenOrOddNumbersInRow(array, true));
        System.out.printf("Sum of numbers in odd row is: %d \n", sumOfEvenOrOddNumbersInRow(array, false));
        System.out.printf("Multiply of all elements in even column is: %d \n", multiplyOfEvenOrOddNumbersInColumn(array, true));
        System.out.printf("Multiply of all elements in odd column is: %d \n", multiplyOfEvenOrOddNumbersInColumn(array, false));
        if (isArrayMagicSquare(array, firstDimensionArrayLength, secondDimensionArrayLength)) {
            System.out.println("It is a magic square!");
        } else {
            System.out.println("It is not a magic square!");
        }
        scanner.close();
    }


    private static boolean isArrayMagicSquare(int[][] array, int firstDimensionArrayLength, int secondDimensionArrayLength) {
        if (firstDimensionArrayLength != secondDimensionArrayLength && firstDimensionArrayLength < 2) {
            return false;
        }
        int sumRow = 0;
        for (int i = 0; i < array.length; i++) {
            sumRow += array[0][i];
        }
        int rowCheck = 0;
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                rowCheck += array[i][j];
            }
            if (sumRow != rowCheck) {
                return false;
            }
            rowCheck = 0;
        }
        int columnCheck = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                columnCheck += array[j][i];
            }
            if (columnCheck != sumRow) {
                return false;
            }
            columnCheck = 0;
        }
        int diagonal = 0;
        for (int i = 0; i < array.length; i++) {
            diagonal += array[i][i];
        }
        if (diagonal != sumRow) {
            return false;
        }
        diagonal = 0;
        int j = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            diagonal += array[i][j];
            j--;
        }
        return diagonal == sumRow;
    }


    private static long multiplyOfEvenOrOddNumbersInColumn(int[][] array, boolean evenChecker) {
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
        if (evenChecker) {
            return evenColumn;
        } else {
            return oddColumn;
        }
    }

    private static int sumOfEvenOrOddNumbersInRow(int[][] array, boolean evenChecker) {
        System.out.println();
        int sumOddRow = 0;
        int sumEvenRow = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < array[i].length; j++) {
                    sumEvenRow += array[i][j];
                }
            } else {
                for (int k = 0; k < array[i].length; k++) {
                    sumOddRow += array[i][k];
                }
            }
        }
        if (evenChecker) {
            return sumEvenRow;
        } else {
            return sumOddRow;
        }
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
