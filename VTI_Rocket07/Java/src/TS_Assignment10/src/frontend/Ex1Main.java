package frontend;

import java.sql.SQLException;

import backend.Ex1;
public class Ex1Main {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Ex1 program = new Ex1();
		program.Q1_connect();
		program.Q2_create();
		program.Q3_create();
		program.Q4_update();
		program.Q5_delete();
	}

}
