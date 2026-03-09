package com.example.teste;


import java.sql.Connection;

public class Main {
	public static void main(String[] args) {

		CreateStudent.insertStudent("Sonic", 30, "sonic@gmail.com");
		CreateStudent.insertStudent("Mario", 30, "mario@hotmail.com");

		ReadStudent.getAllStudent();

		UpdateStudent.updateStudent(1, "sonic@hotmail.com");

		DeleteStudent.deleteStudent(2);

	}
}
