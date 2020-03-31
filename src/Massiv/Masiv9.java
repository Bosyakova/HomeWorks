package Massiv;

import java.util.Scanner;

public class Masiv9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Заполните элементы массива: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        for (int j = 0; j < array.length; j++) {
            if (array[j] < array[0]) {
                array[0] = array[j];
            }

            for (int k = 0; k < array.length; k++) {
                if (array[k] > array[0]) {
                    array[0] = array[k];
                }

                for (int z = 0; z < array.length; z++) {
                    if (z > array[k] && z < array[j])
                        System.out.println(array[z]);
                }
                }
            }
        }
    }

