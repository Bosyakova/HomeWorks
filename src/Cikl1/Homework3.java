package Cikl1;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int i = Integer.parseInt(n.trim());
        int result = 1;
        while (i >1) {
            result*=i;
            i--;}
            System.out.println (result);

    }
}