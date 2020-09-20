package TS_Assgn3;

import java.util.Scanner;

public class EX4_String {

	public static void main(String[] args) {
		//Question3();
		//Question4();
		Question15();

	}
	public static void Question3(){
		String ten,Ten;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên: ");
		ten = sc.nextLine();
    	Ten=ten.substring(0,1).toUpperCase()+ten.substring(1).toLowerCase();
		System.out.println(Ten);
		sc.close();
	}
	public static void Question4(){
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên: ");
		name = sc.nextLine();
		for(int i=0; i<name.length(); i++){
			System.out.println("Kí tự thứ "+i+" là: "+name.toUpperCase().charAt(i) );
		}
		sc.close();
	}
	public static void Question15(){
		String str;
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Nhập chuỗi: ");
    	str = sc.nextLine();
    	str.trim();    	
    	String[] words = str.split(" ");
//    	for(int i=0;i<words.length/2;i++){		    		 
//            String temp=words[i];		   
//            words[i]=words[words.length-i-1];
//            words[words.length-i-1]= temp;
//            for(int j=0;j<words.length;j++){
//                System.out.print(words[j]+ " " );
//            }       
//        }    	
    	    	sc.close();
	}
}
