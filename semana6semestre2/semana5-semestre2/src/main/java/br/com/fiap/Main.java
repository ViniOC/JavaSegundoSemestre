package br.com.fiap;

import br.com.fiap.dao.PessoaDao;
import br.com.fiap.dao.PessoaDaoImplementada;
import br.com.fiap.entities.Pessoa;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Main {

    public static final String URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
    public static final String USER = "pf1910";
    public static final String PASS = "fiap24";

    public static void main(String[] args)  {

        Pessoa cliente = new Pessoa(2L, "Mariana", 34);
        Pessoa clienteNulo = null;

        System.out.println(Exemplo.dummyTesteException(clienteNulo));

        DatabaseConfig db = new DatabaseConfig(URL, USER, PASS);

        PessoaDao pessoaDao = new PessoaDaoImplementada(db);
        pessoaDao.create(cliente);

        Pessoa pessoaNulo = null;

        try{
            System.out.println(pessoaNulo.getId());
        }catch(NullPointerException e){
            System.out.println(e.getCause());
            System.out.println("Tentou acesso uma Pessoa nula " + e.getMessage());
        }




    }
}