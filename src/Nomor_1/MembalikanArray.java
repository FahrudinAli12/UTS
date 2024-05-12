/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Nomor_1;

/**
 *
 * @author Asus
 */
import java.util.Arrays;

public class MembalikanArray {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5};
        
        // Print original array
        System.out.println("Original Array: " + Arrays.toString(inputArray));
        
        // Reverse array
        int[] reversedArray = reverseArray(inputArray);
        
        // Print reversed array
        System.out.println("Reversed Array: " + Arrays.toString(reversedArray));
    }
    
    public static int[] reverseArray(int[] array) {
        int length = array.length;
        int[] reversed = new int[length];
        
        for (int i = 0; i < length; i++) {
            reversed[i] = array[length - 1 - i];
        }
        
        return reversed;
    }
}
