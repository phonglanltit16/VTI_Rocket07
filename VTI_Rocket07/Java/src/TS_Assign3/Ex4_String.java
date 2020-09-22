package TS_lession_3;

import java.util.Scanner;

public class Ex4_String {

	public static void main(String[] args) {
		//Question1();
		//Question2();
		//Question3();
		//Question4();
		//Question5();
		//Question6();
		//Question7();
		//Question8();??
		//Question9();??
		//Question10();
		//Question11();
		//Question12();cách làm giống 1 phần Q10
		//Question13();
		//Question14();
		//Question15();
		//Question16();
		//Question17();
		Question18();
	}
	public static void Question1(){
		//nhập chuỗi từ bàn phím
		String input;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chuỗi:");
		input = sc.nextLine();
		// đếm từ 
		if (input == null) {
			System.out.println("chuỗi không có từ nào cả");
        }
        int count = 0;
        int size = input.length();
        boolean notCounted = true;
        for (int i = 0; i < size; i++) {
            if (input.charAt(i) != ' ') {
                if(notCounted) {
                    count++;
                    notCounted = false;
                }
            } else {
                notCounted = true;
            }
        }
        System.out.println("Chuỗi có "+ count+ " từ. ");
		sc.close();
	}
	public static void Question2(){
		String s1, s2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập xâu kí tự s1:");
		s1 = sc.nextLine();
		System.out.println("Nhập xâu kí tự s2:");
		s2 = sc.nextLine();
		System.out.println("Nối s2 vào sau xâu s2 :"+s1+" " + s2);
		sc.close();
	}
	public static void Question3(){
		String ten,Ten;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên: ");
		ten = sc.nextLine();
    	Ten=ten.substring(0,1).toUpperCase()+ten.substring(1).toLowerCase();
		System.out.println(Ten);
		sc.close();
	}
	public static void Question4(){
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên: ");
		name = sc.nextLine();
		for(int i=0; i<name.length(); i++){
			System.out.println("Kí tự thứ "+i+" là: "+name.toUpperCase().charAt(i) );
		}
		sc.close();

	}
	public static void Question5(){
		String ho5, ten5;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập họ:");
		ho5 = sc.nextLine();
		System.out.println("Nhập tên:");
		ten5 = sc.nextLine();
		System.out.println("Họ và tên là: "+ho5+" " + ten5);
		sc.close();
	}
	public static void Question6(){
		String hovaten6,s1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập họ và tên: ");
		hovaten6 = sc.nextLine();
		//Loại bỏ dấu cách đầu và cuối chuỗi nhập vào
		hovaten6=hovaten6.trim();
        int k;
        for(k=hovaten6.length()-1;k>=0;k--){
            s1=hovaten6.substring(k,k+1);
            if(s1.equals(" ")) break;
        	}
        System.out.println("Tên: "+ hovaten6.substring(k+1));
        int i;
        for(i=0;i<=hovaten6.length();i++){
           s1=hovaten6.substring(i,i+1);
            if(s1.equals(" ")) break;
        	}
        System.out.println("Họ: "+ hovaten6.substring(0,i));
        int j = 0;
    
        if(j>i&&j<k){
            s1=hovaten6.substring(j,j+1);
        	}
        System.out.println("Tên đệm: "+hovaten6.substring(i+1,k));
    
		/*
		 String  ho6, ten6;
		 String[] words6 = hovaten6.split(" ");
		ho6 = words6[0];
		ten6= words6[words6.length-1];
		//dem6= words6[words6.length-1];
		System.out.println("Họ là: "+ho6);
		System.out.println("Tên là: "+ten6);
		*/
		sc.close();
	}
	public static void Question7(){
		//câu a: 
		String hovaten7;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập họ và tên: ");
		hovaten7 = sc.nextLine();
		//Loại bỏ dấu cách đầu và cuối chuỗi nhập vào
		hovaten7=hovaten7.trim();
		// câu b:
		String[] arr = hovaten7.split(" ");
		String hovaten7_1 = "";
		for (String x : arr) {
			hovaten7_1 = hovaten7_1 + (x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase());
			hovaten7_1 = hovaten7_1 + " ";
		}
		System.out.println("Biến các chữ đầu thành hoa: " + hovaten7_1);
		sc.close();
	}
	public static void Question8(){
		
	}
	public static void Question9(){
		
	}
	public static void Question10(){
		/*StringBuffer  str2= new StringBuffer ("naLgnohP");
		StringBuffer str1 = new StringBuffer("PhongLan");
		;
		if(str1.reverse().equals(str2)){
		*/	
		//Nhập 2 xâu từ bàn phím
		String str1,str2;
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Nhập xâu kí tự 1: ");
    	str1= sc.nextLine();
    	System.out.println("Nhập xâu kí tự 2: ");
    	str2= sc.nextLine();
    	//kiểm tra str1 và str2 có phải xâu đảo không 
    		//tìm xâu đảo của str1(chuyển từ xâu sang mảng kí tự để đảo)
    	char[] xauDaoStr1=str1.toCharArray();
    	for(int i=0;i<str1.length()/2;i++){		    		 
            char temp=xauDaoStr1[i];		   
            xauDaoStr1[i]=xauDaoStr1[xauDaoStr1.length-i-1];
            xauDaoStr1[xauDaoStr1.length-i-1]=temp;		   
       }		   
    	//Chuyển mảng kí tự thành xâu		   
       String ketqua= String.valueOf(xauDaoStr1);		   
       if(ketqua.equals(str2)){
    	   System.out.println("OK");    	   
       }else{
    	   System.out.println("KO");
       }
       sc.close();
	}
	public static void Question11(){
		String str11;
    	
    	char kitu=0;
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Nhập xâu: ");
    	str11 = sc.nextLine();
    	/*
    	  // đang không in ra kí tự unipue ở vị trí đầu tiên, mà là cuối cùng???????
    	int result=1;
    	for (int i = 0; i < str11.length()-1; i++) {
        	for (int j = i+1; j < str11.length(); j++) {
        		if (str11.charAt(i)==str11.charAt(j) ){  continue;      
        		}result=0;
        		kitu=str11.charAt(i);
        	}
    	}
    	if(result==1){
        	System.out.println("NO");
    	}else{
    		System.out.println("Kí tự unique là: "+ kitu);
    	}*/
    	int dem=0;		    
    	for (int i = 0; i < str11.length()-1; i++) {
        	for (int j = i+1; j < str11.length(); j++) {
        		if (str11.charAt(i)==str11.charAt(j) ){
    			    dem ++;
        		}if(str11.charAt(i)!=str11.charAt(j)){
        			kitu=str11.charAt(i);
        		}	
        	}
    	}
        	if(dem==0){
    		    System.out.println("Kí tự unique là: "+ kitu);
		    }else{
		    	System.out.println("NO");
		    }
	    sc.close();	
	}
	
	public static void Question13(){
		String str13;
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Nhập chuỗi(chuỗi không chứa chữ số): ");
    	str13 = sc.nextLine();
		for (int i = 0; i < str13.length(); i++) {
            if (Character.isLetter(str13.charAt(i))) {
                System.out.println("False");
                break;
            }
            if (i + 1 == str13.length()) {
                System.out.println("True");
            }
        }
		sc.close();
	}
	public static void Question14(){
		String str14;
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Nhập chuỗi: ");
    	str14 = sc.nextLine();
    	System.out.println("Chuỗi đã đổi: "+ str14.replace('e','*'));
	    sc.close();
	}
	public static void Question15(){
		String str15;
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Nhập chuỗi: ");
    	str15 = sc.nextLine();
    	str15.trim();    	
    	String[] words15 = str15.split(" ");
    	for(int i=0;i<words15.length/2;i++){		    		 
            String temp=words15[i];		   
            words15[i]=words15[words15.length-i-1];
            words15[words15.length-i-1]=temp;
            for(int j=0;j<words15.length;j++){
            System.out.print(words15[j]+ " " );
            }
       }    	
    	sc.close();
	}
	public static void Question16(){
		String str16;
		int n;
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Nhập chuỗi: ");
    	str16 = sc.nextLine();
    	System.out.println("Nhập n(n là số nguyên): ");
    	n = sc.nextInt();
    	System.out.println("Chia chuỗi thành các phần bằng nhau gồm "+ n+" kí tự được không? ");
    	char[] str16_1=str16.toCharArray();
    	if(str16_1.length%n==0){
    		System.out.println("Được");
    	}else{
    		System.out.println("KO");
    	}
    	sc.close();
	}
	public static void Question17(){
		String str11;
    	char kitu=0;
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Nhập xâu: ");
    	str11 = sc.nextLine();
    	System.out.print("Kí tự xuất hiện nhiều hơn 1 lần là: ");
    	for (int i = 0; i < str11.length()-1; i++) {
        	for (int j = i+1; j < str11.length(); j++) {
        		if (str11.charAt(i)==str11.charAt(j) ){
        			kitu=str11.charAt(i);
            		System.out.print(" "+kitu);        		   
        		}if(str11.charAt(i)!=str11.charAt(j)){
        			continue;
        		} System.out.println("NO");     		    		          		
        	}
    	}
	    sc.close();	
	}
	public static void Question18(){
		
	}

}
