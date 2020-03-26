import java.util.Scanner;

public class HomeworkInput1 {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        String istr = sc.nextLine();
        int A = Integer.parseInt(istr.trim());
        for (int i=1; i<A;i++){
            if (i%2==0) {
                System.out.println(i);
            }
        }
    }
}
