package com.example.teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {
    private static final String URL = "jdbc:postgresql://localhost:5432/studentdb";
    private static final String USUARIO = "postgres";
    private static final String SENHA = "pab12345";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar com PostgreSQL", e);
        }
    }
}
