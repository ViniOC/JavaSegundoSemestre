package br.com.fiap.exemplosDummy;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExemple {

    public static void main(String[] args) {

        try (FileWriter fw = new FileWriter("exemplo.txt")){
            fw.write("Nosso Primeiro Exemplo em java");
            System.out.println("Arqivo escrito com sucesso");
        } catch (IOException e) {
            System.out.println("Erro ao tentar escrever o arquivo");
        }


    }
}
