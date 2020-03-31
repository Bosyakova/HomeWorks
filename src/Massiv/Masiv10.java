package Massiv;

import java.util.Scanner;

public class Masiv10 {
    public static void main(String[] args) {
        int[] number = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Заполните элементы массива: ");
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }
        for (int i = 5 - 1; i >= 0; i--) {
            System.out.print(number[i] + " ");
        }
    }
}