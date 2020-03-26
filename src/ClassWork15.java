import java.util.Scanner;

public class ClassWork15 {
        public static void main(String[] args) {
            int[] number = new int[5];
            Scanner sc = new Scanner(System.in);
            System.out.println("Заполните элементы массива: ");
            for (int i = 0; i < number.length; i++) {
                number[i] = sc.nextInt();
            }
            for (int i = 0; i< number.length; i++) {
                System.out.print(number[i] + " ");
            }
        }
    }

