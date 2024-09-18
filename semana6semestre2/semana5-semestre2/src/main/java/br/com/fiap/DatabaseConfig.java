package br.com.fiap;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {

    private final String url;

    private final String user;

    private final String password;

    public DatabaseConfig(String url, String user, String password){
        this.url = url;
        this.user = user;
        this.password = password;
        //TODO: Validação se o driver que vai ser utilizado existe
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }

    public void dummyException() throws IOException {
        throw new IOException();
    }
}
