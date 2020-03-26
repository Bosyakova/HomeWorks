import java.util.Random;
import java.util.Scanner;

public class ClassWork14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввести размер массива: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        initRandomArray(array);

    }
    private static int getnum(int n) {
        Random random = new Random();
        int num = random.nextInt(n);
        if (num % 2 == 0) {
            num++;
        }
        return num;
    }
    private static void initRandomArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = getnum(50);
            System.out.println(array[i]);
        }
    }

}
