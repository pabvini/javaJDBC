package com.example.teste;

import java.sql.*;

public class DeleteStudent {

    public static void deleteStudent(int id){
        String sql = "DELETE FROM students WHERE id = ?;";

        try (Connection conn = ConnectionJDBC.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setInt(1, id);

            int rows = stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
