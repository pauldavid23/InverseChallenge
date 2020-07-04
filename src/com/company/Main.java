package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Enter number of digits:");

        if (scanner.hasNextInt()) {
            count = scanner.nextInt();
            int [] chosenArray = getArray(count);
            System.out.println("The chosen arrays are " + Arrays.toString(chosenArray));
            System.out.println("The arrays in reverse are: " + Arrays.toString(turntoNegative(chosenArray)));

        } else {
            System.out.println("Invalid input!");
        }

    } public static int [] getArray (int length) {
        int [] theLength = new int [length];

        for (int i = 0; i < theLength.length; i++ ) {
            System.out.println("Enter number " + length);
            theLength[i] = scanner.nextInt();
            length--;
        }
        return theLength;

    }
    public static int [] turntoNegative (int [] theArray) {
        int theInverse = -1;
        for (int i = 0; i < theArray.length; i++) {
            theArray[i] *= theInverse;
        }
        return theArray;
    }
}
