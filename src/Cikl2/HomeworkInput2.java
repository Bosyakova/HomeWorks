package Cikl2;

import java.util.Scanner;

public class HomeworkInput2 {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        String istr = sc.nextLine();
        int A = Integer.parseInt(istr.trim());
        int sum = 0;
        for (int i=1; i<A;i++) {
            if (i % 2 != 0 && i % 9 != 0) {
                sum = sum + i; }
        }
                System.out.println(sum);

        }
    }



