package Massiv;

import java.util.Scanner;

public class Masiv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Заполните элементы массива: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
int min = array[0];
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 == 0) {
                if (array[j] < min) {
                    min = array[j];

                }
            }
        }
        System.out.println(min);
    }
}



