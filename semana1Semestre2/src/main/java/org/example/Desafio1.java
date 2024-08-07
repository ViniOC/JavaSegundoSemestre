package org.example;
//contar elementos pares e impares
//crie um programa que leira um vetor de 10 inteiros e conte quantos desses numeros sao pares e quantos sao impares.

import java.util.Arrays;

public class Desafio1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int par = 0;
        int impar = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i]%2 == 0) {
                par = par+ 1;
            }else{
                impar = impar + 1;
            }
        }
        System.out.printf("impar: "+ impar + "par: " + par);
    }


}
