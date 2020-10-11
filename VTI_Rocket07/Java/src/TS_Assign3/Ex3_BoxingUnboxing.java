package TS_Assign3;

public class Ex3_BoxingUnboxing {

	public static void main(String[] args) {
		Question1();
		Question2();
		Question3();

	}
	public static void Question1(){
			Integer salary = 5000;
			float salary1= (float)salary;
			System.out.print("Lương là(lấy 2 số sau thập phân): " );
			System.out.printf("%.2f",salary1);
		}
	public static void Question2(){
			String a = "1234567";
			int b = Integer.parseInt(a);
	        //System.out.println(a + 50);
	        System.out.println(b + 50);
		}
	public static void Question3(){
			Integer c = 1234567;
			int d=  (int) c;
		}
}
