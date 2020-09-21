package TS_Assign4.EX5Inheritance_Q1;

import java.util.Scanner;

public class NhanVien extends CanBo {
	String congViec;
	
	@Override
	public void inputCanBo(){
		super.inputCanBo();
		Scanner sc= new Scanner(System.in);
		congViec= sc.nextLine();
		System.out.println("Công việc: " +congViec );
		sc.close();
	}
}
