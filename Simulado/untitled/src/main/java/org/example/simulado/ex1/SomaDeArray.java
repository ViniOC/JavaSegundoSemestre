package org.example.simulado.ex1;

public class SomaDeArray {
    public static void main(String[] args) {

        int[] arrayA = {27, 65, 4, 88, 13, 42, 91, 56, 73, 9};
        int[] arrayB = {34, 77, 51, 22, 86, 19, 8, 63, 47, 95};
        int[] arrayC = new int[arrayA.length ];
        for (int i = 0; i < arrayA.length; i++){
             arrayC[i] = arrayA[i] + arrayB[i];
        }
        for (int j = 0; j < arrayC.length ; j++) {
            System.out.println(arrayC[j]);

        }
    }
}
