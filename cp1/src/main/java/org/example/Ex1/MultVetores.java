package org.example.Ex1;

import java.util.Arrays;

public class MultVetores {
    public static void main(String[] args) {
        int[] arrayA = {23, 87, 56, 9, 42, 74, 31, 18, 65, 92};
        int[] arrayB = {4, 79, 12, 53, 68, 27, 91, 36, 8, 45};
        int[] arrayC = new int[arrayA.length];
        boolean[] novoC = new boolean[arrayC.length];
        for (int i = 0; i < arrayA.length ; i++) {
            arrayC[i] = arrayA[i] * arrayB[i];
        }
        for (int j = 0; j < arrayC.length; j++) {
            if (arrayC[j]%2 == 0){
                novoC[j] = true;
            }else {
                novoC[j]= false;
            }

        }
        System.out.println(Arrays.toString(arrayC));
        System.out.println(Arrays.toString(novoC));
    }
}
