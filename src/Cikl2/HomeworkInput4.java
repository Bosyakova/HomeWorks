package Cikl2;

import java.util.Scanner;

public class HomeworkInput4 {
    public static void main (String []args) {
        Scanner sc = new Scanner(System.in);
        String istr = sc.nextLine();
        int a = Integer.parseInt(istr.trim());
        int result =1;
        for (int i=1;i<=10;i++ ){
            result=result*a;
        System.out.println(result);
        }
    }
}
