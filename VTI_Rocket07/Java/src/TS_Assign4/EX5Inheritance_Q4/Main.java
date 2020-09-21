package TS_Assign4.EX5Inheritance_Q4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		boolean kt = true;
		do{
			System.out.println("Lựa chọn chức năng sử dụng");
			System.out.println("1. Thêm mới tài liệu");
			System.out.println("2. Xóa tài liệu theo mã");
			System.out.println("3. Hiển thị danh sách tài liệu");
			System.out.println("4. Tìm kiếm tài liệu");
			System.out.println("5. Thoát chương trình.");
			int a = sc.nextInt();
			switch (a){
			case 1: add();
				kt=true;
				break;
			case 2 : del();
				kt=true;
				break;
			case 3 : display();
				kt=true;
				break;
			case 4 : search();
				kt=true;
				break;
			case 5 : 
				kt=false;
				break;
			default : 
				kt=true;
				System.out.println("Nhập sai, nhập lại");
			}	
		}while (kt = false);
			
		sc.close();
	}

	public static void search() {
		// TODO Auto-generated method stub
		
	}

	public static void display() {
		// TODO Auto-generated method stub
		
	}

	public static void del() {
		// TODO Auto-generated method stub
		
	}

	public static void add() {
		// TODO Auto-generated method stub
		
	}

	

}
