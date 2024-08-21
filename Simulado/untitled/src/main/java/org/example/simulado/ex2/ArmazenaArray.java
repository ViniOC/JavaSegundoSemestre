package org.example.simulado.ex2;

import java.util.Arrays;

public class ArmazenaArray {
    private int[] array;


    public ArmazenaArray(int[] array) {
        this.array = array;
    }

    public ArmazenaArray() {

    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

//retorna o ultimo elemento inserido ao conjunto sem remover o item.
    public int[] peek(){
        int fim = array.length -1;
        System.out.println(array[fim]);
        System.out.println(Arrays.toString(array));
        return array;
    }

    //remove e retorna o ultimo elemento inserido ao conjunto
    public int[] pop(){
        int fim = array.length -1;
        System.out.println(array[fim]);
        int[] novoArray = new int[array.length -1];
        for (int i = 0; i < array.length -1; i++) {
            novoArray [i] = array[i];

        }
        System.out.println(Arrays.toString(novoArray));
        return novoArray;
    }
// insere um novo elemento ao conjunto
    //pode performar melhor utilizando o copyof
    public void add(int i){

        int[] novoArray = new int[array.length +1];

        for (int j = 0; j < array.length; j++) {
            novoArray[j] = array[j];
        }
        novoArray [novoArray.length -1] = i;
        System.out.println(Arrays.toString(novoArray));
        this.array = Arrays.copyOf(novoArray, novoArray.length);
    }
//remover e retornar o primeiro elemento do array
    public int[] popFirst(){
        int [] novoArray = new int[array.length -1 ];
        System.out.println(array[0]);
        for (int i = 1; i < array.length; i++) {
            novoArray [i -1] = array[i];
        }
        System.out.println(Arrays.toString(novoArray));
        return novoArray;
    }

    public static void main(String[] args) {

        int[] array = {27, 65, 4, 88, 13, 42, 91, 56, 73, 9};

        ArmazenaArray armazenaArray = new ArmazenaArray(array);

        armazenaArray.add(10);
        armazenaArray.add(6);
        armazenaArray.add(1);


        armazenaArray.peek();
        armazenaArray.popFirst();
        armazenaArray.pop();


    }
}


