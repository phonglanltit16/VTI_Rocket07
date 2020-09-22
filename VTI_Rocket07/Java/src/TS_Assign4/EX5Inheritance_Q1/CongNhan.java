package TS_Assign4.EX5Inheritance_Q1;

import java.util.Scanner;

public class CongNhan extends CanBo {
	int capBac;
//	public CongNhan(String hoTen, int age, Gender gender, String address, byte capBac){
//		super(hoTen, age, gender, address);
//		this.capBac= capBac;
//	}

	@Override
	public void inputCanBo(){
		super.inputCanBo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào cấp bậc(từ 1 đến 10)");
		capBac= sc.nextInt();
		if(capBac >10){
			System.out.println(" Nhập sai, nhập lại");
		}
		sc.close();
	}
	public void getInfor(){
		super.getInfor();
		System.out.println("Cấp bậc: "+capBac);
	}
//	public void showCongNhan(){
//		for(){
//			if (canBo instanceOf CongNhan ){
//				canBo.getInfor();
//			}
//		}
//	}
	

}