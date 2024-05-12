/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nomor_2;

/**
 *
 * @author Asus
 */
import java.util.Arrays;

public class MenggabungkanArray {
    public static void main(String[] args) {
        // Array pertama
        int[] array1 = {1, 2, 3, 4, 5};
        
        // Array kedua
        int[] array2 = {6, 7, 8, 9, 10};
        
        // Menggabungkan kedua array
        int[] mergedArray = mergeArrays(array1, array2);
        
        // Menampilkan array hasil penggabungan
        System.out.println("Array hasil penggabungan: " + Arrays.toString(mergedArray));
    }
    
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int length1 = arr1.length;
        int length2 = arr2.length;
        
        // Membuat array baru dengan ukuran yang sesuai
        int[] merged = new int[length1 + length2];
        
        // Menyalin elemen array pertama ke array baru
        System.arraycopy(arr1, 0, merged, 0, length1);
        
        // Menyalin elemen array kedua ke array baru
        System.arraycopy(arr2, 0, merged, length1, length2);
        
        return merged;
    }
}
