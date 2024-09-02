package org.example.Ex2;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorConvidados {
    private List<String> convidado;

    public GerenciadorConvidados(String[] convidado) {
        this.convidado = new ArrayList<>();
    }

    //adicionar convidado a lista de convidados
    public void addConvidado(String novoConvidado){
        if (convidado.contains(novoConvidado)){
            System.out.println("o convidado " + novoConvidado + " já esta na lista");
        }else {
            convidado.add(novoConvidado);
        }

        System.out.println(convidado);

    }


}

