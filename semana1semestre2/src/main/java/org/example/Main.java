package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //pesqueisa binaria
        //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        //pesquisa por extremidades
        //a regra de negocio é importante para saber se deixa vazio ou nao o array quando se autocompletar
        // ;

        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int i = Arrays.binarySearch(array, 7);

        System.out.println(i);




    }
}