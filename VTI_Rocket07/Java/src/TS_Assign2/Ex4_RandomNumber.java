package TS_Assign2;

import java.time.LocalDate;
import java.util.Random;

public class Ex4_RandomNumber {
	public static void main(String[] args) {
		Question1();
		Question2();
		Question3();
		Question4();
		Question5();
		//Question6();
		Question7();
	}
	public static void Question1(){
		Random random = new Random();
		int x = random.nextInt();
		System.out.println(x);
	}
	public static void Question2(){
		Random random = new Random();
		float y = random.nextInt();
		System.out.println(y);
	}
	public static void Question3(){

		Random random = new Random();
		String [] fullName= {"LTPL", "LMP" ,"LTQH", "LQM", "BTNH"};
		for( int i=1; i>=1; i++){
			int numberFullName = random.nextInt(5);
			fullName[i]=fullName[numberFullName];
			System.out.println(fullName[i]);
		}
	}
	public static void Question4(){
		Random random = new Random();
		int minDay = (int) LocalDate.of(1995,07,24).toEpochDay();
		int maxDay = (int) LocalDate.of(1995,12,20).toEpochDay();
		
		long randomInt = minDay+ random.nextInt(maxDay- minDay);
		LocalDate randomDay = LocalDate.ofEpochDay(randomInt);
		System.out.println(randomDay);
	}
	public static void Question5(){

	Random random = new Random();
		int firstDay =(int) LocalDate.of(0000,00,00).toEpochDay();	
		int present = (int) java.time.LocalDate.now().toEpochDay();
		//System.out.println(present);
		long rdInt = firstDay+ random.nextInt(present- firstDay);
		LocalDate rdday = LocalDate.ofEpochDay(rdInt);
		System.out.println(rdday);
	}
	public static void Question7(){ 
		Random random = new Random();
		float w = 100+random.nextInt(900);
		System.out.println(w);
	}
	}

