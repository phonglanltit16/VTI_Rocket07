package TS_Assign4.EX5Inheritance_Q1;

import java.util.Scanner;

public class KySu extends CanBo {
	String nganhDaoTao;

//	public KySu(String hoTen, int age, Gender gender, String address, String nganhDaoTao){
//		super(hoTen, age, gender, address);
//		this.nganhDaoTao=nganhDaoTao;
//	}
@Override
	public void inputCanBo(){
		super.inputCanBo();
		Scanner sc= new Scanner(System.in);
		nganhDaoTao= sc.nextLine();
		System.out.println("Ngành đào tạo: " +nganhDaoTao );
		sc.close();
	}
	public void getInfor(){
		super.getInfor();
		System.out.println("Ngành đào tạo: "+nganhDaoTao);
	}
}