package DoubleArray;

import java.util.Random;

public class DoubleArrayDiag5 {
    public static void main(String[] args) {
        int[][] doubleArray = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                doubleArray[i][j] = random.nextInt(100) + 1;
            }
        }
        printArray(doubleArray);
        System.out.println();
        diagArray(doubleArray);
    }
   // public static void printArray(int[] array){
    //for (int value : array){
      //  System.out.print(value+ "\t");

   // }
//}
public static void printArray(int[][] doubleArray){
    for(int i = 0; i< doubleArray.length; i++) {
        for (int j = 0; j < doubleArray[i].length; j++) {
            System.out.print(doubleArray[i][j] + "\t");
        }
        System.out.println();
    }
}
public static void diagArray(int[][] doubleArray){
        int max = doubleArray[0][0];
        for(int i = 0; i < doubleArray.length-1; i++) {
            if (doubleArray[i][i] < doubleArray[i + 1][i + 1]) {
                max = doubleArray[i + 1][i + 1];
            }
        }
                System.out.println(max);
        }
}