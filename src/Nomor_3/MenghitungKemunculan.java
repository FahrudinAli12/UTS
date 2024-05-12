/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nomor_3;

/**
 *
 * @author Asus
 */
import java.util.HashMap;
import java.util.Map;

public class MenghitungKemunculan {
    public static void main(String[] args) {
        int[] array = {1, 2, 7, 7, 5, 5, 5};
        
        // Panggil fungsi untuk menghitung jumlah kemunculan elemen
        countOccurrences(array);
    }
    
    public static void countOccurrences(int[] arr) {
        // Buat objek HashMap untuk menyimpan jumlah kemunculan setiap elemen
        Map<Integer, Integer> occurrenceMap = new HashMap<>();
        
        // Iterasi melalui array dan hitung kemunculan setiap elemen
        for (int num : arr) {
            if (occurrenceMap.containsKey(num)) {
                // Jika elemen sudah ada di map, tambahkan 1 ke jumlahnya
                occurrenceMap.put(num, occurrenceMap.get(num) + 1);
            } else {
                // Jika elemen belum ada di map, tambahkan elemen baru dengan jumlah 1
                occurrenceMap.put(num, 1);
            }
        }
        
        // Print hasil jumlah kemunculan setiap elemen
        for (Map.Entry<Integer, Integer> entry : occurrenceMap.entrySet()) {
            System.out.println("Elemen " + entry.getKey() + " muncul sebanyak " + entry.getValue() + " kali.");
        }
    }
}
