import java.util.Arrays;

public class Matrix {
    public static void print(double[][] matrix) {
        for (double[] rows : matrix) {
            for (double v : rows) {
                // Использую 2 пробела для красивости
                System.out.print(v + "  ");
            }
            System.out.println();
        }
    }

    public static void multiply(double[][] matrix, double k) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] *= k;
            }
        }
    }

    public static double sum(double[][] matrix) {
        return Arrays.stream(matrix).flatMapToDouble(Arrays::stream).sum();
    }

    public static double[] sumByRow(double[][] matrix) {
        return Arrays.stream(matrix).mapToDouble(
                r -> Arrays.stream(r).sum()
        ).toArray();
    }

    public static double[] sumByCol(double[][] matrix) {
        // Тут уж возиться с этими стримами стало лень, поэтому написал в лоб =)
        double[] colsSum = new double[matrix[0].length];

        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                colsSum[j] += matrix[i][j];
            }
        }

        return colsSum;
    }
}