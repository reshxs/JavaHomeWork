public class Main {
    public static void main(String[] args) {
        matrixDemo();
        trigonometryDemo();
    }

    private static void matrixDemo() {
        System.out.println();
        System.out.println("МАТРИЦЫ");
        double[][] matrix = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };

        System.out.println("Исходная матрица:");
        Matrix.print(matrix);

        System.out.println("Сумма матрицы:");
        System.out.println(Matrix.sum(matrix)); // 9.0

        System.out.println("Суммы строк:");
        printDoubleArray(Matrix.sumByRow(matrix)); // 3.0 3.0 3.0

        System.out.println("Суммы столбцов:");
        printDoubleArray(Matrix.sumByCol(matrix)); // 3.0 3.0 3.0

        System.out.println("Матрица, умноженная на 3:");
        Matrix.multiply(matrix, 3);
        Matrix.print(matrix);

        System.out.println();
    }

    private static void printDoubleArray(double[] array){
        for (double v : array) {
            System.out.print(v + "  ");
        }
        System.out.println();
    }

    private static void trigonometryDemo(){
        System.out.println();
        System.out.println("ТРИГОНОМЕТРИЯ");

        double degrees = 45.0;

        double sin = Trigonometry.sin(degrees);
        double cos = Trigonometry.cos(degrees);
        double tan = Trigonometry.tan(degrees);
        double ctg = Trigonometry.ctan(degrees);
        double rad = Trigonometry.toRad(degrees);

        System.out.println("sin(45°) = " + sin);
        System.out.println("cos(45°) = " + cos);
        System.out.println("tan(45°) = " + tan);
        System.out.println("ctg(45°) = " + ctg);
        System.out.println("toRad(45°) = " + rad);

        System.out.println();
    }
}