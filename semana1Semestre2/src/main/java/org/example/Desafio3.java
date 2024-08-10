package org.example;

import java.util.Scanner;

//crie um programa que leia um vetor de 8 inteiros e determine o maior e o menor valor presente no vetor.
public class Desafio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[8];



        for (int i = 0; i <array.length ; i++) {
            System.out.printf("informe o valor da posição " + i + ": ");
            array[i] = scanner.nextInt();
        }
        int maior = array[0];
        int menor = array[0];

        for (int i = 0; i <array.length ; i++) {
            if (array[i] > maior ) {
                maior = array[i];

            } if (array[i] < menor) {
                menor = array[i];

            }
        }
        System.out.println("menor: "+ menor +" maior: "+ maior);

    }

}
