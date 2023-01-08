package BTVN_T3;

import java.util.Scanner;

public class Matrix {

    public static void createRandomMatrix(int[][] matrix) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        in.close();
    }


    public static void createRandomMatrix(int rows, int cols) {
        Scanner in = new Scanner(System.in);
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        in.close();
    }


    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
    }


    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
        return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
    }


    public static int[][] add(int[][] matrix1, int[][] matrix2) {

        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length || (matrix1 == null || matrix2 == null)) {
            System.out.println("Can't add two matrix");
        }
        int[][] sum_Mat = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                sum_Mat[i][j] += matrix1[i][j] + matrix2[i][j];
            }
        }
        return sum_Mat;
    }

    public static double[][] add(double[][] matrix1, double[][] matrix2) {

        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length || (matrix1 == null || matrix2 == null)) {
            System.out.println("Can't add two matrix");
        }
        double[][] sum_Mat = new double[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                sum_Mat[i][j] += matrix1[i][j] + matrix2[i][j];
            }
        }
        return sum_Mat;
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length || (matrix1 == null || matrix2 == null)) {
            System.out.println("Can't subtract two matrix");
        }
        int[][] sub_Mat = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                sub_Mat[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return sub_Mat;
    }

    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length || (matrix1 == null || matrix2 == null)) {
            System.out.println("Can't subtract two matrix");
        }
        double[][] sub_Mat = new double[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                sub_Mat[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return sub_Mat;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2[0].length || matrix1[0].length != matrix2.length || (matrix1 == null || matrix2 == null)) {
            System.out.println("Can multiply two matrix");
        }
        if(matrix1.length == matrix2[0].length){
            int [][] mul_Mat = new int[matrix2.length][matrix1[0].length];
            for (int i = 0; i < matrix2.length; i++) {
                for (int j = 0; j < matrix1[0].length; j++) {
                    for (int k = 0; k < matrix1.length; k++) {
                        mul_Mat[i][j] += matrix2[i][k] * matrix1[k][j];
                    }
                }
            }
            return mul_Mat;
        }
        if(matrix1[0].length == matrix2.length){
            int [][] mul_Mat = new int[matrix1.length][matrix2[0].length];
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix2[0].length; j++) {
                    for (int k = 0; k < matrix1[0].length; k++) {
                        mul_Mat[i][j] += matrix2[i][k] * matrix1[k][j];
                    }
                }
            }
            return mul_Mat;
        }
        return null;


    }
    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        if (matrix1.length != matrix2[0].length || matrix1[0].length != matrix2.length || (matrix1 == null || matrix2 == null)) {
            System.out.println("Can multiply two matrix");
        }
        if(matrix1.length == matrix2[0].length){
            double [][] mul_Mat = new double[matrix2.length][matrix1[0].length];
            for (int i = 0; i < matrix2.length; i++) {
                for (int j = 0; j < matrix1[0].length; j++) {
                    for (int k = 0; k < matrix1.length; k++) {
                        mul_Mat[i][j] += matrix2[i][k] * matrix1[k][j];
                    }
                }
            }
            return mul_Mat;
        }
        if(matrix1[0].length == matrix2.length){
            double [][] mul_Mat = new double[matrix1.length][matrix2[0].length];
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix2[0].length; j++) {
                    for (int k = 0; k < matrix1[0].length; k++) {
                        mul_Mat[i][j] += matrix2[i][k] * matrix1[k][j];
                    }
                }
            }
            return mul_Mat;
        }
        return null;


    }

}