package br.com.fiap;

import br.com.fiap.entities.Pessoa;
import br.com.fiap.exceptions.DummyCheckedException;

public class Exemplo {

    public static String dummyTesteException(Pessoa pessoa){

        //envelopar o bloco de codigo (Exception)
        try {
            pessoa.getId();
            System.out.println("Primeira etapa");
            return "ok";
        }catch (NullPointerException e){
            System.out.println("Estapa se erro");
            return "fail";
        }finally {
//            sempre será executado
            System.out.println("Dummy teste foi finalizado");
        }


    }
    public static void dummyExceptionPersonaliada()throws DummyCheckedException{
        throw new DummyCheckedException();

    }
}
