/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nomor_5;

/**
 *
 * @author Asus
 */
public class MemeriksaMatriksIdentitas {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };

        boolean isIdentity = checkIdentityMatrix(matrix);
        
        if (isIdentity) {
            System.out.println("Matriks adalah matriks identitas.");
        } else {
            System.out.println("Matriks bukan matriks identitas.");
        }
    }

    public static boolean checkIdentityMatrix(int[][] matrix) {
        // Memastikan matriks adalah 3x3
        if (matrix.length != 3 || matrix[0].length != 3) {
            return false;
        }

        // Memeriksa elemen diagonal untuk identitas
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Diagonal adalah indeks yang sama (i = j)
                if (i == j && matrix[i][j] != 1) {
                    return false; // Tidak ada 1 di diagonal
                } else if (i != j && matrix[i][j] != 0) {
                    return false; // Bukan elemen diagonal
                }
            }
        }

        return true; // Semua kondisi memenuhi sebagai matriks identitas
    }
}
