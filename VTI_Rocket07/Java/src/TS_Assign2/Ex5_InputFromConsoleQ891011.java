package TS_Assign2;

import java.util.Scanner;

public class Ex5_InputFromConsoleQ891011 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean check= false;
		do{
			System.out.println("Mời bạn nhập chức năng muốn sử dụng:\n1.Create Account\n2.Create Department");
			int input = sc.nextInt();
			switch (input){
			case 1: 
				CreateAccount();
				check = true; 
			break;
			case 2:
				CreateDepartment();
				check = true; 
			break;
			default:
				System.out.println("Mời nhập lại");
				check = false; 
			}
		}while (check == false);
		sc.close();
	}
	public static void CreateAccount(){
		System.out.println("Account");
	}
	public static void CreateDepartment(){
		System.out.println("Department");
	}


}
