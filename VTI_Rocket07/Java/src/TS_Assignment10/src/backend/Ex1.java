package backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Ex1 {
	Connection connection;
	public void Q1_connect() throws SQLException{

	// Buoc1: Tao ket noi toi database
	
			String url="jdbc:mysql://localhost:3306/CandidateMangement";
			String user = "root";
			String password = "root";
	// Buoc2: 	
			Connection connection = DriverManager.getConnection(url, user, password);
			System.out.println("Connect success!!");
	}
	public void Q2_create() throws SQLException, ClassNotFoundException{
	// Buoc3: Tao 1 statement
			String sql = "SELECT id, email FROM Manager  ";
			Statement statement = connection.createStatement();	

			ResultSet result = statement.executeQuery(sql);
			
	// Buoc4:Xu ly du lieu tra ve
			while(result.next()){
				int id = result.getInt("id");
				String email = result.getString("email");
				System.out.println("Manager: "+  id + " " + email);
			}
	}
	// Question 3:
		public void Q3_create() throws SQLException {
			// Create a statement object

			String insertStatement = "insert into Manager values (?,?)";
			PreparedStatement statement = connection.prepareStatement(insertStatement);
			Scanner sc = new Scanner (System.in);
			System.out.println("Nhập lần lượt id và email muốn thêm: ");
			String email = sc.nextLine();
			int id = sc.nextInt();
			
			// set parameter
			statement.setString(id, email);

			int effectedRecordAmount = statement.executeUpdate();
			
			if (effectedRecordAmount == 1) {
				System.out.println("Complete");
			} else {
				System.out.println("false");
			}
			sc.close();
		}
		// Question 4:
		public void Q4_update() throws SQLException {

			Statement statement = connection.createStatement();

			String updateStatement = "UPDATE Manager SET email = 'phonglan125@gmail.com' WHERE id = 1";
			int effectedRecordAmount = statement.executeUpdate(updateStatement);

			// Handing result set
			if (effectedRecordAmount == 1) {
				System.out.println("Complete");
			} else {
				System.out.println("false");
			}
		}

		public void Q5_delete() throws SQLException {

			String deleteStatement = " DELETE FROM Manager WHERE id = ?";
			PreparedStatement statement = connection.prepareStatement(deleteStatement);
			Scanner sc = new Scanner (System.in);
			System.out.println("Nhập id muốn xóa: ");
			int id = sc.nextInt();
	
			statement.setInt(1, id);

			// Execute SQL Query with executeUpdate
			int effectedRecordAmount = statement.executeUpdate();

			// Handing result set
			if (effectedRecordAmount > 0) {
				System.out.println("Complete");
			} else {
				System.out.println("False");
			}
			sc.close();
		}

		
	
	
	public void close() throws SQLException	{
	// buoc5: dong ket noi
		connection.close();
	}
	
}
