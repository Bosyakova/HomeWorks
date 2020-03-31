package Cikl1;

import java.util.Scanner;

public class Homework6 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int iLength =a.length();
        char n = a.charAt(0);
        int nint = 'n';
        int res =1;
        for (int i=1; i<iLength;i++){
        res=res*nint;}
                    System.out.println(res);
        }

        }


