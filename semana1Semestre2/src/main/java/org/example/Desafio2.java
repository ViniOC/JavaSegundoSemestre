package org.example;

import java.util.Arrays;
import java.util.Scanner;

//crie um programa que leia um vetor de 5 inteiros e imprima o vetor na ordem inversa.
public class Desafio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[5];

        int [] inversearray = new int [array.length];

        int percorreVetor = array.length - 1;
        String resultado;

        for (int i = 0; i <array.length ; i++) {
            System.out.printf("informe o valor da posição " + i + ": ");
            array[i] = scanner.nextInt();
        }
        resultado = Arrays.toString(array);
        System.out.println("vetor original: "+resultado);

        for (int i = 0; i < array.length; i++) {
            inversearray[i] = array[percorreVetor -i];
        }
        resultado = Arrays.toString(inversearray);
        System.out.println("Vetor inverso: "+resultado);


    }
}
