package br.com.fiap.exemplosDummy;

import java.io.File;
import java.io.IOException;
public class FileExemplo {

    public static void main(String[] args) {
        File file = new File("exemplo.txt");

        if(!file.exists()){

            try {
                file.createNewFile();
                System.out.println("Arquivo criado com sucesso!");
            } catch (IOException e) {
                System.out.println("Erro ao criar arquivo: "+ e.getMessage());
            }
        }else {
            System.out.println("Arquivo já existe");
        }
//        Como verificar se é arquivo ou diretorio.
        if (file.isFile()){
            System.out.println("É um arquivo");

        }else {
            System.out.println("É um diretorio");
        }

    }
}
