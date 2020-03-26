package Massiv;

import java.util.Scanner;

public class Masiv6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        double result = 0;
        int sum = 0;

        System.out.println("Заполните элементы массива: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        if (array.length > 0) {
            for (int j = 0; j < array.length; j++)
                sum += array[j];
            result = sum / array.length;
            System.out.println(result);
        }
            for (int k = 0; k < array.length; k++) {
                if (result > array[k])
                    System.out.println(array[k]);
            }
        }
    }
