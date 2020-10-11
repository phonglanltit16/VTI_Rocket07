package TS_Assign2;

public class Ex6_Method {

	public static void main(String[] args) {
		Question1();
		Question2();
		Question3();

	}
	public static void Question1(){
		System.out.println("Các số nguyên dương chẵn là:");
		for(int i=2; i<10; i++){
			if(i%2==1){
				continue;
			}
			System.out.print(i+" \n");
		}
	}
	public static void Question2(){
	}
	public static void Question3(){
		System.out.println("Các số nguyên dương là:");
		for(int i=1; i<10; i++){
			System.out.print(i+" \n");
		}
			}
	
}
