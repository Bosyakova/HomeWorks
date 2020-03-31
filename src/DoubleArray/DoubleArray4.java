package DoubleArray;

import java.util.Random;

public class DoubleArray4 {
    public static void main(String[] args) {
        int[][] doubleArray = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                doubleArray[i][j] = random.nextInt(100) + 1;
            }
        }

        System.out.println();
        printArray(doubleArray);
        int[] array = sumArray(doubleArray);
        System.out.println();
        printArray(array);

    }

    public static void printArray(int[] array) {
        for (Object value : array) {
            System.out.print(value + "\t");
        }
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            printArray(array[i]);
            System.out.println();
        }
    }

    public static int[] sumArray(int[][] doubleArray) {
        int[] newArray = new int[doubleArray.length];
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                newArray[j] = doubleArray[0][j] + doubleArray[doubleArray.length - 1][j];
            }
        }
        return newArray;
    }
}




