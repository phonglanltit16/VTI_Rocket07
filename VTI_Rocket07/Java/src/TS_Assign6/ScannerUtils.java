package TS_Assign6;

import java.util.Scanner;

public class ScannerUtils {
	static Scanner sc = new Scanner(System.in);
	
	public static int getInt(String errorMessage){
		while (true) { 
			try {
				int number = Integer.parseInt(sc.nextLine().trim());
				
				if(number > 0) {
					return number;
				}
				else
					System.err.println(errorMessage);
				
			} catch (Exception e) {
				System.err.println(errorMessage);
			}
		}
		
	}
	
	public static float inputFloat(String errorMessage) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				return Float.parseFloat(sc.nextLine().trim());
			} catch (Exception e) {
				System.err.println(errorMessage);
			}
			sc.close();
		}
		
	}

	public static double inputDouble(String errorMessage) {
		while (true) {
			try {
				return Double.parseDouble(sc.nextLine().trim());
			} catch (Exception e) {
				System.err.println(errorMessage);
			}
		}
	}

	public static String inputString(String errorMessage) {
		while (true) {
			String str = sc.nextLine().trim();
			if (!str.isEmpty()) {
				return str;
			} else {
				System.err.println(errorMessage);
			}
		}
	}
	
}