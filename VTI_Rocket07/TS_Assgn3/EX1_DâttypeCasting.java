package TS_Assgn3;

import java.util.Random;

public class EX1_DâttypeCasting {

	public static void main(String[] args) {
		Question2and3();
	}
	public static void Question2and3(){
		int a,c;
		String b;
		Random rd= new Random();
		a= rd.nextInt(100000);
		System.out.printf("%05d",a);
		System.out.println("\n");
		b=a+"";
		System.out.println("Chuỗi b là: "+b);
		System.out.println(b.substring(3, 5));
		c= a%100;
		System.out.println("2 số cuối của số a là: "+ c);
	}

}
