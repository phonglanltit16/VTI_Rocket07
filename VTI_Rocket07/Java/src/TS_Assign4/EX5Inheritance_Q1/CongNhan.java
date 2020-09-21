package TS_Assign4.EX5Inheritance_Q1;

import java.util.Scanner;

public class CongNhan extends CanBo {
	byte capBac;

	@Override
	public void inputCanBo(){
		super.inputCanBo();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào cấp bậc(từ 1 đến 10)");
		capBac= sc.nextByte();
		if(capBac >10){
			System.out.println(" Nhập sai, nhập lại");
		}
		sc.close();
	}
	
	

}