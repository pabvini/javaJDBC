package com.example.teste;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CreateStudent {
    public static void insertStudent(String name, int age, String email){
        String sql = "INSERT INTO students(name, age, email) VALUES(?, ?, ?)";

        try(Connection conn = ConnectionJDBC.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);){

            stmt.setString(1, name);
            stmt.setInt(2, age);
            stmt.setString(3, email);

            int rows = stmt.executeUpdate();
            System.out.println(rows + " estudante inserido!");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
