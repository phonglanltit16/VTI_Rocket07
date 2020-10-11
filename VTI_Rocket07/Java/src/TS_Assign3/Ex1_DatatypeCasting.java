package TS_Assign3;

import java.util.Random;
import java.util.Scanner;

public class Ex1_DatatypeCasting {

	public static void main(String[] args) {
		//Question1();
		//Question2and3();
		//Question4();
		Question5();
	}
	public static void Question1(){
		float salaryOfAccount1= 5240.5f;
		float salaryOfAccount2= 10970.055f; 
		
		int salaryCasting1 = (int) salaryOfAccount1;
		int salaryCasting2 = (int) salaryOfAccount2;
		System.out.println(salaryCasting1);
		System.out.println(salaryCasting2);		
	}
	
	public static void Question2and3(){
		int a;
		String b;
		Random rd= new Random();
		a= rd.nextInt(100000);
		System.out.printf("%05d",a);
		System.out.println("\n");
		b=a+"";
		System.out.println("Chuá»—i b lÃ : "+b);
		System.out.println(b.substring(3, 5));
	}
	
	public static void Question4(){
		
	}
	public static void Question5(){
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số a:");
	    a = sc.nextInt();
		System.out.println("Nhập số b:");
	    b = sc.nextInt();
	    
	    System.out.println("Thương của 2 số a và b là :"+ (float)a/b);
	    
		sc.close();
	}
}

