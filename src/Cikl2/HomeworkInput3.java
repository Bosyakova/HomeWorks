package Cikl2;

import java.util.Scanner;

public class HomeworkInput3 {
    public static void main (String []args) {
        Scanner sc = new Scanner(System.in);
        String istr = sc.nextLine();
        int a = Integer.parseInt(istr.trim());
       for (int i = a*(-1);i<=a;i++){
            System.out.println(i);
        }
    }
}
