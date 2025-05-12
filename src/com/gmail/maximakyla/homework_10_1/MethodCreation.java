package com.gmail.maximakyla.homework_10_1;

import java.util.Scanner;

public class MethodCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Enter integer number ");
        int number = scanner.nextInt();
        System.out.printf("Squire of %d is: %d \n\n", number, raiseToSquire(number));
        System.out.println("2.Enter radius of the cylinder");
        double radius = scanner.nextDouble();
        System.out.println("Enter altitude of the cylinder");
        double altitude = scanner.nextDouble();
        System.out.printf("Volume of the cylinder with radius %.2f and altitude %.2f is: %.2f \n\n", radius, altitude, calculateVolume(radius, altitude));
        int[] array = {1, 2, 3, 4, 5};
        System.out.printf("3.Sum of all elements in array is: %d\n\n ", sumAllElements(array));
        scanner.nextLine();
        System.out.println("4.Enter text to reverse: ");
        String textToReverse = scanner.nextLine();
        System.out.printf("Reverse text: %s \n\n", reverseText(textToReverse));
        System.out.println("5. Enter number a : ");
        int baseNumber = scanner.nextInt();
        System.out.println("   Enter number b : ");
        int toPow = scanner.nextInt();
        System.out.printf("Result %d^%d is: %d.\n\n", baseNumber, toPow, powNumber(baseNumber, toPow));
        printStringNTimes("Hello!", 10);
        scanner.close();
    }

    public static void printStringNTimes(String text, int repeat) {
        for (int i = 0; i < repeat; i++) {
            System.out.println(text);
        }
        System.out.print("\n\n");
    }

    public static int powNumber(int numberToPow, int pow) {
        int result = numberToPow;
        for (int i = 2; i <= pow; i++) {
            result *= numberToPow;
        }
        return result;
    }

    public static String reverseText(String text) {
        String reverseText = "";
        char[] array = text.toCharArray();
        for (int i = array.length - 1; i >= 0; i--) {
            reverseText += array[i];
        }
        return reverseText;
    }

    public static int sumAllElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static double calculateVolume(double radius, double altitude) {
        return 3.14 * radius * radius * altitude;
    }

    public static int raiseToSquire(int toSquare) {
        return toSquare * toSquare;
    }
}

