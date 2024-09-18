package br.com.fiap.entities;

import br.com.fiap.exceptions.IdadeInvalida;

public class Pessoa {

    private Long id;

    private String nome;

    private int idade;

    public Pessoa(long id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        setIdade(idade);
    }

    //Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(isMaiorDeIdade(idade)){
            this.idade = idade;
        } else {
            throw new IdadeInvalida(Integer.valueOf(idade).toString());
        }
    }

    //Método que valida se é maior de idade
    private boolean isMaiorDeIdade(int idade){
        return idade >= 18;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
