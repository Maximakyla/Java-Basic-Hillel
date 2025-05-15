package com.gmail.maximakyla.homework_10_1;

import java.util.Scanner;

public class MethodCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        raiseToSquire(scanner);
        calculateVolumeCylinder(scanner);
        sumAllElements(arrayCreator(scanner));
        reverseText(scanner);
        powNumber(scanner);
        printStringNTimes(scanner);
        scanner.close();
    }

    private static void printStringNTimes(Scanner scanner) {
        System.out.println("6.Enter integer number n: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter string line: ");
        String line = scanner.nextLine();
        for (int i = 0; i < number; i++) {
            System.out.println(line);
        }
        System.out.print("\n\n");
    }

    private static void powNumber(Scanner scanner) {
        System.out.println("5.Enter a: ");
        int numberToPow = scanner.nextInt();
        System.out.println("Enter b: ");
        int pow = scanner.nextInt();
        int result = numberToPow;
        for (int i = 0; i < pow - 1; i++) {
            result *= numberToPow;
        }
        System.out.printf("Result %d ^ %d is: %d \n\n", numberToPow, pow, result);
    }

    private static void reverseText(Scanner scanner) {
        System.out.println("4.Enter text to reverse: ");
        scanner.nextLine();
        String textToReverse = scanner.nextLine();
        String reverseText = "";
        char[] array = textToReverse.toCharArray();
        for (int i = array.length - 1; i >= 0; i--) {
            reverseText += array[i];
        }
        System.out.printf("Reverse text: %s \n\n", reverseText);
    }

    private static int[] arrayCreator(Scanner scanner) {
        System.out.println("3.Enter array length");
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter value for %d element of array", i + 1);
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void sumAllElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.printf("Sum of all elements in array is: %d\n\n ", sum);
    }


    private static void calculateVolumeCylinder(Scanner scanner) {
        System.out.println("2.Enter radius of the cylinder");
        double radiusCylinder = scanner.nextDouble();
        System.out.println("Enter altitude of the cylinder");
        double altitudeCylinder = scanner.nextDouble();
        double volume = 3.14 * radiusCylinder * radiusCylinder * altitudeCylinder;
        System.out.printf("Volume of the cylinder with radius %.2f and altitude %.2f is: %.2f \n\n", radiusCylinder, altitudeCylinder, volume);
    }

    private static void raiseToSquire(Scanner scanner) {
        System.out.println("1.Enter integer number ");
        int number = scanner.nextInt();
        System.out.printf("Squire of %d is: %d \n\n", number, number * number);
    }
}

