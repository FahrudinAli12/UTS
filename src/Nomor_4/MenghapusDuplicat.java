/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nomor_4;

/**
 *
 * @author Asus
 */
import java.util.Arrays;

public class MenghapusDuplicat {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        int[] uniqueArray = removeDuplicates(array);
        
        // Menampilkan array hasil penghapusan duplikat
        System.out.println("Array setelah menghapus duplikat: " + Arrays.toString(uniqueArray));
    }
    
    public static int[] removeDuplicates(int[] arr) {
        Arrays.sort(arr); // Mengurutkan array secara ascending
        
        int[] result = new int[arr.length];
        int previous = arr[0];
        result[0] = previous;
        int count = 1; // Jumlah elemen unik yang ditemukan
        
        // Memindai array untuk elemen-elemen unik
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            if (previous != current) {
                result[count] = current;
                previous = current;
                count++;
            }
        }
        
        // Mengembalikan array dengan elemen-elemen unik
        return Arrays.copyOf(result, count); // Mengembalikan array dengan ukuran sesuai jumlah elemen unik
    }
}
