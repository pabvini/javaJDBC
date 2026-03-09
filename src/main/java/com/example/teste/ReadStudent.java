package com.example.teste;

import java.sql.*;

public class ReadStudent {

    public static void getAllStudent(){
        String sql = "SELECT * FROM students";

        try (Connection conn = ConnectionJDBC.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){

            while (rs.next()){
                System.out.println(rs.getInt("id") + " | " +
                                   rs.getString("name") + " | " +
                                   rs.getInt("age") + " | "+
                                   rs.getString("email") + " | ");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
