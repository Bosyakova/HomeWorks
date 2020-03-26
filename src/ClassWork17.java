import java.util.Scanner;

public class ClassWork17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Заполните элементы массива: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int[] array1 = new int[array.length];

        for (int j = 0; j < array.length; j++){
            array1[j] = array[j];
System.out.print( array1[j] + " ");
        }
    }
}
