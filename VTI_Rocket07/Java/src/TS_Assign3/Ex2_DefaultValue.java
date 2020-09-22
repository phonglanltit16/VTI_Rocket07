package TS_lession_3;


import java.util.Date;

public class Ex2_DefaultValue {
	
	
	public static void main(String[] args) {
	
		Ex2_Account [] accounts = new Ex2_Account[5];
		for (int i = 0; i<5; i++){
			accounts[i]= new Ex2_Account();
			accounts[i].email= "abc"+i;
			accounts[i].fullName= "xyz" + i;
			accounts[i].userName= accounts[i].fullName+ "508";
			java.util.Date date= new java.util.Date();
			accounts[i].createAccoutDate= date;
		}
		for (int i = 0; i<5; i++){
			System.out.println("\nEmail: " +accounts[i].email + "    Fullname: "+accounts[i].fullName );
		}
	}

}
