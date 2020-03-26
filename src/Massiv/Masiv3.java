package Massiv;

public class Masiv3 {
    public static void main(String[]args){
        int[] number = new int[4];
        int result;
        number[0]=1;
        number[1]=2;
        number[2]=3;
        number[3]=4;
        for(int i=0;i<number.length;i++){
            result=number[i]*number[i];
            System.out.println(result);
        }
    }
}
