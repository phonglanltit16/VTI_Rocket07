package TS_Assign4.EX5Inheritance_Q1;

import java.util.Scanner;

public class CanBo {
	protected String hoTen;
	protected int age;
	protected Gender gender;
	protected String address;
	
//	public CanBo(String hoTen, int age, Gender gender, String address){
//		this.address=address;
//		this.age= age;
//		this.hoTen=hoTen;
//		this.gender= gender;
//		
//	}
	
	public void inputCanBo(){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Họ và tên: " );
		hoTen= sc.nextLine();
		
		System.out.println("Nhập tuổi: ");
		age = sc.nextInt();
		
	
		System.out.println("Giới tính (1- Nam, 2- Nữ, 3-Khác): ");
		int checkGen= sc.nextInt();
//		switch (checkGen){
//			case 1: System.out.println("Nam");
//			break;
//			case 2: System.out.println("Nữ");
//			break;
//			case 3: System.out.println("Khác");
//			break;
//			default : System.out.println("Nhập sai, nhập lại");
//			break;
//		}
		sc.nextLine();
		System.out.println("Địa chỉ: " );
		address= sc.nextLine();
		sc.close();
	}
	public String getHoTen() {
		return hoTen;
	}
	public void getInfor(){
		System.out.println("Họ Tên: " + hoTen);
		System.out.println("Tuổi: " + age);
		System.out.println("Giới tính: " + gender);
		System.out.println("Address: " + address);

	}
}
