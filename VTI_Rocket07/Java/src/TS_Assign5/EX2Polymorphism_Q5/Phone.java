package TS_Assign5.EX2Polymorphism_Q5;

public class Phone implements IWeapon {
	public void nghe(){
		System.out.println("Nghe điện thoại nè");
	}
	public void goi(){
		System.out.println("Gọi nè");
	}
	public void nhanSMS(){
		System.out.println("Có tin nhắn nè");
	}
	public void guiSMS(){
		System.out.println("Gửi SMS nè");
	}
	@Override
	public void Attack() {
		// TODO Auto-generated method stub
		
	}
}
