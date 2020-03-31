package Cikl1;

public class Homeworkfib {
    public static void main(String[]args) {
        System.out.println(Fibo(12));
    }

    private static int Fibo(int i) {
       if (i==0){
           return 0;
       }if (i==1){
           return 1;
        }else{
           return Fibo(i-2)+Fibo(i-1);
        }
    }
}

