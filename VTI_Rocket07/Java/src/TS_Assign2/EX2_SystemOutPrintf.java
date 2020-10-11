package TS_Assign2;

		import java.text.SimpleDateFormat;
		import java.util.Date;
		import java.util.Locale;

		public class EX2_SystemOutPrintf {
			public static void main(String[] args) {
				//q1: 
				int a = 5;
				System.out.printf("Giá trị a là :"+ a );
				System.out.println("Giá trị a là :"+ a );
				System.out.print("Giá trị a là :"+ a );
				//Q2:
				System.out.printf(Locale.US, "%,d %n", 100000000);
				//Q3:
				System.out.printf("%.4f %n",5.567098);	
				//q4:
				System.out.printf("%15s %n","Tên tôi là \"Nguyễn Văn A\" và tôi đang độc thân");
				//Q5:
				String pattern ="yyyy/MM/dd HH:mm:ss";
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
				String date= simpleDateFormat.format(new Date());
				System.out.println(date);
		}
		}
