package hw8.matrix;

public class MatrixRunner {
    public static void main(String[] args) {
        Matrix matrixA = new Matrix();
        matrixA.fill();
        System.out.println("Матрица А имеет вид: ");
        matrixA.print();

        System.out.println("-----------------------");

        Matrix matrixB = new Matrix();
        matrixB.fill();
        System.out.println("Матрица В имеет вид: ");
        matrixB.print();

        System.out.println("-----------------------");

        Matrix matrixC = matrixA.sum(matrixB);
        System.out.println("Сумма матриц А  и В имеет вид: ");
        matrixC.print();

        System.out.println("-----------------------");

        Matrix matrixD = matrixA.sub(matrixB);
        System.out.println("Разность матриц А  и В имеет вид: ");
        matrixD.print();

        System.out.println("-----------------------");

        int koeficient = 2;
        Matrix matrixE = matrixA.mult(koeficient);
        System.out.printf("Умножение матрицы А на коэффициент %d имеет вид: \n", koeficient);
        matrixE.print();

        System.out.println("-----------------------");
        System.out.println("Единичная матрица, созданая на базе А, имеет вид: ");
        matrixA.single().print();

        int demension = 6;
        System.out.println("-----------------------");
        System.out.printf("Единичная матрица, размерности %d, имеет вид: \n", demension);
        Matrix.single(demension).print();

        System.out.println("-----------------------");
        System.out.printf("Определитель матрицы А имеет значение: %f \n", matrixA.determinant());

        System.out.println("-----------------------");
        System.out.printf("Определитель матрицы B имеет значение: %f\n", Matrix.determinant(matrixB));

        System.out.println("-----------------------");
        System.out.println("Матрица, являющаяся транспонированной по отношению к матрице А, имеет вид: ");
        Matrix transpon = matrixA.transpon();
        transpon.print();

        System.out.println("-----------------------");
        System.out.println("Матрица, являющаяся обратной по отношению к матрице А, имеет вид: ");
        Matrix invert = matrixA.invert();
        invert.print();
    }
}
