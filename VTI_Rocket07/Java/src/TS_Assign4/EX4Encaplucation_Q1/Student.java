package TS_Assign4.EX4Encaplucation_Q1;

public class Student {
	private int id;
	private String name;
	private String homeTown;
	private float mark;
	Student (String name, String homeTown){
		this.name=name;
		this.homeTown= homeTown;
		this.mark=0f;
	}
	public void setMark(float mark) {
		this.mark = mark;
		this.mark = mark;
		if(mark<4){
			System.out.println("Yếu");
		}else if(mark<6){
			System.out.println("Trung Bình");
		}else if(mark<8){
			System.out.println("Khá");
		}else if(mark <=10){
			System.out.println("Giỏi");
		}
	}
	public void setMarkPlus(float mark) {
		this.mark += mark;
	}
	@Override
	public String toString() {
	    return "Thông tin học sinh: "+"\nHọ và tên: "+ name + "\nĐiểm học lực='" + mark ;            
	}
}
