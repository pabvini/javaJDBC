package com.example.teste;

import java.sql.*;

public class UpdateStudent {

    public static void updateStudent(int id, String newEmail){
        String sql = "UPDATE students SET email = ? WHERE id = ?";

        try (Connection conn = ConnectionJDBC.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setString(1, newEmail);
            stmt.setInt(2, id);

            int rows = stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
