package TS_Assign6;

import java.util.Scanner;

public class Ex1_Exception {

	public static void main(String[] args) {
		//Question1_2();
//		Question3();
//		Question4();
//		Q5_inputAge();
		Q6_inputAgeUpadate();
	}
	public static void Question1_2(){
		try {
			float result = divide(7,0);
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("Can not divide by 0, check again pls!!");
		}finally{
			System.out.println("Divide completed");
		}	
	}
	private static float divide(int a, int b) {
		return a/b;
	}
	
	public static void Question3(){
		try {
			int [] number = {1,2,3};
			System.out.println(number[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Lỗi là: "+ e.getMessage());
		}
	}
	
	public static void Question4(){
		String [] deparment = {"D1","D2","D3"};
		Scanner sc = new Scanner (System.in);
		System.out.print("Nhập vào vị trí phần tử muốn lấy ra: ");
		
		try {
			int i = sc.nextInt();
			System.out.println(deparment[i]);
		} catch (Exception e) {
			System.out.println("Cannot find department");
		}
		sc.close();	
	}
	
	public static int Q5_inputAge(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào số tuổi: ");
		String a = sc.nextLine();
		
		try {
			int age = Integer.parseInt(a.trim());
			if(age>0){
				return age;
			}else{
				System.out.println("Wrong inputing! The age must be greater than 0, please input again.");
				return 0;
			}
		} catch (NumberFormatException e) {
			System.out.println("wrong inputing! Please input an age as int, input again.");
	    	return 0;
		}finally{
			sc.close();
		}
	}
	
	public static int Q6_inputAgeUpadate(){
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.print("Nhập vào số tuổi: ");
			String a = sc.nextLine();
			try {
				int age = Integer.parseInt(a.trim());

				if(age>0){
					return age;
				}else{
					System.out.println("Wrong inputing! The age must be greater than 0, please input again.");
					return 0;
				}
			} catch (NumberFormatException e) {
				System.out.println("Wrong inputing! Please input an age as int, input again.");
		    	return 0;
			}finally{
				sc.close();
			}
		}
		
	}
	
	
}
