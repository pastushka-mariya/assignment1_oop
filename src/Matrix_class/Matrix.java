package Matrix_class;

public class Matrix {
    private double[][] matrix;
    private int rows;
    private int columns;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.matrix = new double[rows][columns];
    }

    public Matrix add(Matrix otherMatrix) {
        if (this.rows != otherMatrix.rows || this.columns != otherMatrix.columns) {
            return null;
        }

        Matrix result = new Matrix(rows, columns);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.matrix[i][j] = this.matrix[i][j] + otherMatrix.matrix[i][j];
            }
        }

        return result;
    }

    public Matrix multiply(double scalar) {
        Matrix result = new Matrix(rows, columns);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.matrix[i][j] = this.matrix[i][j] * scalar;
            }
        }

        return result;
    }

    public Matrix multiply(Matrix otherMatrix) {
        if (this.columns != otherMatrix.rows) {
            return null;
        }

        Matrix result = new Matrix(this.rows, otherMatrix.columns);

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < otherMatrix.columns; j++) {
                result.matrix[i][j] = 0;

                for (int k = 0; k < this.columns; k++) {
                    result.matrix[i][j] += this.matrix[i][k] * otherMatrix.matrix[k][j];
                }
            }
        }

        return result;
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private void setMatrix(double[][] values) {
        if (values.length == rows && values[0].length == columns) {
            matrix = values;
        } else {
            System.out.println("Invalid matrix dimensions.");
        }
    }

    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 3);
        double[][] values1 = {{1, 2, 3}, {4, 5, 6}};
        matrix1.setMatrix(values1);
        System.out.println("Matrix 1:");
        matrix1.print();

        System.out.println();

        Matrix matrix2 = new Matrix(3, 2);
        double[][] values2 = {{7, 8}, {9, 10}, {11, 12}};
        matrix2.setMatrix(values2);
        System.out.println("Matrix 2:");
        matrix2.print();

        System.out.println();

        Matrix sumMatrix = matrix1.add(matrix2);
        if (sumMatrix != null) {
            System.out.println("Sum of matrices:");
            sumMatrix.print();
        } else {
            System.out.println("Matrices cannot be added.");
        }

        System.out.println();

        double scalar = 2.5;
        Matrix scaledMatrix = matrix1.multiply(scalar);
        System.out.println("Matrix 1 multiplied by " + scalar + ":");
        scaledMatrix.print();

        System.out.println();

        Matrix productMatrix = matrix1.multiply(matrix2);
        if (productMatrix != null) {
            System.out.println("Product of matrices:");
            productMatrix.print();
        } else {
            System.out.println("Matrices cannot be multiplied.");
        }
    }
}

