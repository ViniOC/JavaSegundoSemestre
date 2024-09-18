package br.com.fiap.dao;

import br.com.fiap.entities.Pessoa;

import java.sql.SQLException;
import java.util.List;

public interface PessoaDao {

    void create(Pessoa pessoa);

    List<Pessoa> read();

    void update(Pessoa pessoa);

    void delete(Long id);
}
