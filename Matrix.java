package Leetcode;

import java.util.*;

class Matrix {
    public static void main(String[] args) {
        int[][] matrix = { { 0, 1 } };
        setZeroes(matrix);
    }

    public static void setZeroes(int[][] matrix) {
        List<List<Integer>> zeros = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    List<Integer> inner = new ArrayList<>();
                    inner.add(i);
                    inner.add(j);
                    zeros.add(inner);
                }
            }
        }
        for (int i = 0; i < zeros.size(); i++) {
            assignZero(matrix, zeros.get(i).get(0), zeros.get(i).get(1));
        }
    }

    public static void assignZero(int[][] matrix, int row, int col) {
        // Setting row as zero
        for (int i = 0; i < matrix.length; i++) {
            matrix[row][i] = 0;
        }
        // Setting col as zero
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[i][col] = 0;
        }
    }
}