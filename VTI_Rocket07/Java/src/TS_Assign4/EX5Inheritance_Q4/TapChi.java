package TS_Assign4.EX5Inheritance_Q4;

public class TapChi extends TaiLieu {
	int soPhatHanh;
	int thangPhatHanh;
	public void setThangPhatHanh(int thangPhatHanh) {
		if (thangPhatHanh <13){
		this.thangPhatHanh = thangPhatHanh;
		}else{
			System.out.println("Định dạng tháng sai!!!");
		}
	}
	
}
