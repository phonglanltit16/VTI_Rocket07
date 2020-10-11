package TS_Assign2;

import java.util.Scanner;
public class Ex5_InputFromConsole1_7 {

		public static void main(String[] args) {
			//Question1();
			Question7();
		}
		public static void Question1(){
			Scanner sc= new Scanner(System.in);
			System.out.println("Nhập lần lượt 3 số nguyên ");
			int num1 = sc.nextInt();
			System.out.println("Số thứ 1 là:"+num1);
			int num2 = sc.nextInt();		
			System.out.println("Số thứ 2 là:"+num2);
			int num3 = sc.nextInt();
			System.out.println("Số thứ 3 là:"+num3);
			sc.close();
		}
		public static void Question2(){

		Scanner sc= new Scanner(System.in);
		System.out.println("Nhập lần lượt 2 số thực ");
		int float1 = sc.nextInt();
		System.out.println("Số thứ 1 là:"+float1);
		int float2 = sc.nextInt();		
		System.out.println("Số thứ 2 là:"+float2);
		sc.close();
	}
		public static void Question5(){
			Scanner sc= new Scanner(System.in);
			System.out.println("Choose position:\n1.Dev\n2.Test\n3.ScrumMasster\n4.PM");
			int pos = sc.nextInt();
			if(pos==1){
				System.out.println("Bạn là Position.Dev");
			}else if(pos==2){
					System.out.println("Bạn là Position.Test");
			}else if(pos==3){
					System.out.println("Bạn là Position.ScrumMasster");
			}else if(pos==4){
				System.out.println("Bạn là Position.PM");
			}else{
				System.out.println("Nhập sai giá trị. Vui lòng nhập lại");
			}
			sc.close();
		}
		public static void Question7(){
			Scanner sc= new Scanner(System.in);
			System.out.println("Nhập vào 1 số chẵn");
			int sochan = sc.nextInt();
			if(sochan%2==0){
				System.out.println("Số "+sochan+" là số chẵn");
			}else{
				System.out.println("Số đã nhập không phải số chẵn, mời nhập lại");
			}
			sc.close();
		}
	}
