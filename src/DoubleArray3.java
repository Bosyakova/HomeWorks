public class DoubleArray3 {
    public static void main(String[] args) {
        char[][] doubleArray = new char[5][5];
        initNullStar(doubleArray);
    }
    private static void initNullStar(char[][] doubleArray){
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                if (i == 0 || j == 0 || (i == 2 && j == 2) || i == doubleArray.length-1 || j == doubleArray.length-1) {
                    doubleArray[i][j] = 'o';
                } else {
                    doubleArray[i][j] = '*';
                }
                System.out.print(doubleArray[i][j] + "  ");
            }
            System.out.println();
        }
    }
}

