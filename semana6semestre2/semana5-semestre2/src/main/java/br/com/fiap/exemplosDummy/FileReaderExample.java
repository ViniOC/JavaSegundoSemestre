package br.com.fiap.exemplosDummy;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

    public static void main(String[] args) {

        try(FileReader fr = new FileReader("exemplo.txt")){
            int character = fr.read();
            while (character != -1){
                System.out.println((char) character);
                character--;
            }

        }catch (IOException e){

        }



    }
}
