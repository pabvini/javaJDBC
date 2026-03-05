package com.example.teste;


import java.sql.Connection;

public class Main {

	public static void main(String[] args) {

		try (Connection conn = ConnectionJDBC.getConnection()) {
			System.out.println("✅ Conexão OK!");
			System.out.println("Banco: " + conn.getCatalog());
			System.out.println("Driver: " + conn.getMetaData().getDriverName());

			CreateStudent.insertStudent("Pablo", 17, "pablo@gmail.com");

		} catch (Exception e) {
			System.err.println("❌ Erro: " + e.getMessage());
			e.printStackTrace();
		}

	}

}
