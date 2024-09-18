package br.com.fiap.dao;

import br.com.fiap.DatabaseConfig;
import br.com.fiap.entities.Pessoa;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PessoaDaoImplementada implements PessoaDao {

    private final DatabaseConfig db;

    public PessoaDaoImplementada(DatabaseConfig db) {
        this.db = db;
    }

    @Override
    public void create(Pessoa pessoa) {
        String sql = "INSERT INTO PESSOA_1TDSPJ(id,name,idade) VALUES (?, ?, ?)";
        try {
            db.dummyException();
            Connection connection = db.getConnection();
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, pessoa.getId());
            pstmt.setString(2, pessoa.getNome());
            pstmt.setInt(3, pessoa.getIdade());
            pstmt.executeUpdate();
            connection.close();
        } catch (IOException | SQLException e) {
            //TODO
        }

    }

    @Override
    public List<Pessoa> read() {
        List<Pessoa> result = new ArrayList<>();
        String sql = "select * from pessoa_1tdspj";
        try {
            Connection connection = db.getConnection();
            //1 - Executar query select *
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            //2 - Mapear linhas para objetos
            while (rs.next()) {
                Long id = (Long) rs.getLong("id");
                String name = rs.getString("name");
                int idade = rs.getInt("idade");
                result.add(new Pessoa(id, name, idade));
            }
        } catch (SQLException e) {
            //TODO
        }

        return result;
    }

    @Override
    public void update(Pessoa pessoa) {
        String sql = "update pessoa_1tdspj set idade= ?, name=?  where id=?";
        try {
            Connection connection = db.getConnection();
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(2, pessoa.getNome());
            pstmt.setInt(1, pessoa.getIdade());
            pstmt.setLong(3, pessoa.getId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            //TODO
        }
    }

    @Override
    public void delete(Long id) {
        String sql = "delete pessoa_1tdspj where id = ?";
        try {
            Connection connection = db.getConnection();
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e){
            //TODO
        }

    }


}
