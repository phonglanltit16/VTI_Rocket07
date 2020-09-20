package TS_Assgn3;

import java.util.Date;

public class EX2_DefaultValue {
	byte id3;
	String email;
	String userName;
	String fullName;
	Date createAccoutDate;
	
	public static void main(String[] args) {
		EX2_DefaultValue [] accounts = new EX2_DefaultValue[5];
		for (int i = 0; i<5; i++){
			accounts[i]= new EX2_DefaultValue();
			accounts[i].email= "email"+i;
			accounts[i].fullName= "fullName" + i;
			accounts[i].userName= "userName"+i;
			Date date= new Date();
			accounts[i].createAccoutDate= date;
		}
		for (int i = 0; i<5; i++){
			System.out.println("\nEmail: " +accounts[i].email + "    Fullname: "+accounts[i].fullName );
		}
	}

}
