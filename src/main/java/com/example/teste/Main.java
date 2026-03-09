package com.example.teste;


import java.sql.Connection;

public class Main {
	public static void main(String[] args) {

		ReadStudent.getAllStudent();

		UpdateStudent.updateStudent(1, "pablo@hotmail.com");

		ReadStudent.getAllStudent();

	}
}
