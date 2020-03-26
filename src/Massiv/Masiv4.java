package Massiv;

import java.util.Arrays;

public class Masiv4 {
    public static void main(String[] args) {
            char arr[] = {'a','t','d','c','r'};
            for (char value:arr){
                System.out.println("Value=" +value);
            }
            Arrays.sort(arr);
            System.out.println("Sorted char array is");
            for (char value : arr){
                System.out.println("Value="+ value);
            }
        }
    }






