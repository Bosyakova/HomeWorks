package Cikl1;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int A = Integer.parseInt(a.trim());
        Scanner sc1 = new Scanner(System.in);
        String b = sc.nextLine();
        int B = Integer.parseInt(b.trim());
        int r=1;
        for (int i=0; i<B;i++) {
            r = r * A;}
            System.out.println("Результат" + r);
    }
}