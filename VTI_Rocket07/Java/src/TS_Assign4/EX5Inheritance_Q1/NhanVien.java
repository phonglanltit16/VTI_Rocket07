package TS_Assign4.EX5Inheritance_Q1;

import java.util.Scanner;

public class NhanVien extends CanBo {
	String congViec;
	
//	public NhanVien(String hoTen, int age, Gender gender, String address, String congViec){
//		super(hoTen, age, gender, address);
//		this.congViec=congViec;
//	}
	
	@Override
	public void inputCanBo(){
		super.inputCanBo();
		Scanner sc= new Scanner(System.in);
		congViec= sc.nextLine();
		System.out.println("Công việc: " +congViec );
		sc.close();
	}
	public void getInfor(){
		super.getInfor();
		System.out.println("Công việc : "+congViec);
	}
}
