package org.example.Ex2;

public class Main {
    public static void main(String[] args) {
        String[] listaConvidados = new String[0];
        GerenciadorConvidados gerenciadorConvidados = new GerenciadorConvidados(listaConvidados);

        gerenciadorConvidados.addConvidado("Vinicius");
        gerenciadorConvidados.addConvidado("Helena");
        gerenciadorConvidados.addConvidado("Henrique");
        gerenciadorConvidados.addConvidado("Rosa");
        gerenciadorConvidados.addConvidado("Fred");
        gerenciadorConvidados.addConvidado("Fred");

    }
}
