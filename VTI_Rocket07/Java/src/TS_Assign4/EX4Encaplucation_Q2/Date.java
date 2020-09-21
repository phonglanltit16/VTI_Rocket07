package TS_Assign4.EX4Encaplucation_Q2;

public class Date {
	int day;
	int month;
	int year;
	
	Date(int day, int month, int year){
		this.day=day;
		this.month= month;
		this.year=year;		
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
	    return "Hôm nay là ngày: "+day+"/"+ month+"/" +year ;            
	}
	public boolean isLeapYear() {
		if(this.year % 4 == 0) {
			return true;
		}else{
			return false;
		}
	}
}
