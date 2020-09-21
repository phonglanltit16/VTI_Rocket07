package TS_Assign4.EX4Encaplucation_Q2;

public class Account {
	String id;
	String name;
	int balance;
	
	Account(String id, String name, int balance ){
		this.id= id;
		this.name= name;
		this.balance=balance;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}
	public void credit(int amount){
		
	}
	public void dedit(int amount){
			
	}
	public void tranferTo(Account account, int amount){
		
	}
}

