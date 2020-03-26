import java.util.Scanner;

public class ClassWork18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[7];
        System.out.println("Заполните элементы массива: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int temp;
        for (int i = 0, j=array.length-1; i < j; i++,j--) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
    }
}
