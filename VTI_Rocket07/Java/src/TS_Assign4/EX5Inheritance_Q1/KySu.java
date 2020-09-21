package TS_Assign4.EX5Inheritance_Q1;

import java.util.Scanner;

public class KySu extends CanBo {
	String nganhDaoTao;

@Override
	public void inputCanBo(){
		super.inputCanBo();
		Scanner sc= new Scanner(System.in);
		nganhDaoTao= sc.nextLine();
		System.out.println("Ngành đào tạo: " +nganhDaoTao );
		sc.close();
	}
}