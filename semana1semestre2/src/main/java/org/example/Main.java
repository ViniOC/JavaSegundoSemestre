package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int [] vetor = new int [4];

        vetor[0] = 3;
        vetor[1] = 4;
        vetor[2] = 5;
        vetor[3] = 6;


        int [] novoVetor = {2024, 2023, 2025, 2030};
        System.out.println( novoVetor[0] );
        novoVetor[0] = 2032;
        System.out.println( novoVetor[0] );

        System.out.println(novoVetor.length);

        //loop tradicional
        //for (start; condicao para se mander; incremento)
        for (int i = 0; i< novoVetor.length; i++){
            System.out.println(novoVetor[i]);
        }

        //loop aprimorado
        //for(tipo nomeVariavel: array}
        for (int ano : novoVetor){
            System.out.println(ano);
        }


        //while
        int i = 0;
        while (i != novoVetor.length){
            System.out.println(novoVetor[i]);
            i++;
        }
    }
}