public class DiagonalSum {
    public static int diagonalSum(int matrix[][]) {
        int sum = 0;
        //Brute Force Code (O^n2)
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                if (i == j) {
//                    sum = sum + matrix[i][j];
//                }
//                else if (i + j == matrix.length - 1) {
//                    sum = sum + matrix[i][j];
//                }
//            }
//        }
//        return sum;

        //Optimised code

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                //primary
                sum = sum + matrix[i][i];

                //secondary
                if (i != matrix.length - i - 1) {
                    sum = sum + matrix[i][matrix.length - i - 1];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        diagonalSum(matrix);
    }
}
