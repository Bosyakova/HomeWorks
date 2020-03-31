package DoubleArray;

public class DoubleArray2 {
    public static void main(String[] args) {
        char[][] doubleArray = new char[5][5];
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                doubleArray[i][j] = '*';
                System.out.print(doubleArray[i][j] + "  ");
    }
            System.out.println();
}
    }
}
