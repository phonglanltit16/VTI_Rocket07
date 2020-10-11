package TS_Assign2;

		import java.util.Date;


		public class Ex1_FlowControl {

			public static void main(String[] args) {
				// Create department
				Department department1 = new Department();
				department1.id1 = 1;
				department1.departmentName = "Sale";

				Department department2 = new Department();
				department2.id1 = 2;
				department2.departmentName = "Marketing";

				// Create position
				Position position1 = new Position();
				position1.id2 = 1;
				position1.positionName = PositionName.DEV;

				Position position2 = new Position();
				position2.id2 = 3;
				position2.positionName = PositionName.SCRUM_MASTER;
				
				// Create group
				Group group1= new Group();
				group1.id4=1;
				group1.groupName="Java";
				group1.id_creator="CR_GR01";
				group1.createGroupDate=new Date("2020/01/01");
				
				Group group2= new Group();
				group2.id4=2;
				group2.groupName="Python";
				group2.id_creator="CR11";
				group2.createGroupDate=new Date("2020/01/20");
						
				// Create account
				Account account1 = new Account();
				account1.id3 = 1;
				account1.email = "lan123@gmail.com";
				account1.userName = "phonglan123";
				account1.fullName = "Lê Thị Phong Lan";
				account1.department = department2;
				account1.position = position2;
				account1.createAccoutDate = new Date("2020/04/20");
				Group[] groupOfAccount1 = {group1, group2};
				account1.groups= groupOfAccount1;
				
				Account account2 = new Account();
				account2.id3 = 2;
				account2.email = "phong@gmail.com";
				account2.userName = "minhphong456";
				account2.fullName = "Lê Minh Phong";
				account2.department = department2;
				account2.position = position1;
				account2.createAccoutDate = new Date("2020/04/21");
				//account2.groups = group2;
				Group[] groupOfAccount2 = {group1};
				account2.groups= groupOfAccount2;
				
				Account account3 = new Account();
				account3.id3 = 3;
				account3.email = "huong123@gmail.com";
				account3.userName = "quynhhuong369";
				account3.fullName = "Lê Thị Quỳnh Hương";
				account3.department = department1;
				account3.position = position2;
				account3.createAccoutDate = new Date("2020/04/26");
				Group[] groupOfAccount3 = {group2};
				account1.groups= groupOfAccount3;
				
				Account[] accountInGroup2 = {account1, account2};
				group2.accounts= accountInGroup2;
				//Q1: 
				if (account2.department == null) {
					System.out.println("Nhân viên này chưa có phòng ban");
				} else {
					System.out.println("Phòng ban của nhân viên này là " + account2.department.departmentName);
				}
			
				// Q2:
				if (account2.groups == null) {
					System.out.println("Nhân viên này chưa có group");
				} else if (account2.groups.length == 1 || account2.groups.length == 2) {
					System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
				} else if (account2.groups.length == 3) {
					System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
				} else  {
					System.out.println("Nhân viên này là rất hóng chuyện, tham gia tất cả group");
				} 
				// Q3:
				System.out.println((account2.department == null ? "Nhân viên này chưa có phòng ban": "Nhân viên này thuộc phòng ban :" + account2.department.departmentName));
				// Q4:
				PositionName posi= PositionName.DEV;
				System.out.println((posi == PositionName.DEV) ? "Đây là Dev":"Người này không phải là Developer" );
			    
				//Q5:Switch case
				switch (group2.accounts.length){
				case 1: System.out.println("Nhom co mot thanh vien");
				break;
				case 2: System.out.println("Nhom co hai thanh vien");
				break;
				case 3: System.out.println("Nhom co ba thanh vien");
				break;
				default : System.out.println("Nhom co nhieu thanh vien");
				}
				//Q6:
				switch (account2.groups.length){
				case 0: System.out.println("Nhân viên này chưa có phòng ban");
				break;
				case 1: 
				case 2: System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
				break;
				case 3: System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
				default : System.out.println("Nhân viên này là rất hóng chuyện, tham gia tất cả group");
				}
				//Q7:
				switch( posi){
				case DEV : System.out.println("Đây là Deverloper");
				break;
				default: System.out.println("Người này không phải là Dev");
				}
				//Q8: for each
				Account[] accou = {account1,account2};
				for (Account a : accou) {
					System.out.println(a.department.departmentName);
					System.out.println(a.fullName);
					System.out.println(a.email);
				}
				//Q9
				Department[] depart= {department1,department2};
				for (Department d : depart) {
					System.out.println(d.departmentName);
					System.out.println(d.id1);
				}
				
				//Q10: for
				for(int i=1;i>=1;i++){
					System.out.println("thông tin account "+i+ "là:");
					System.out.println("Email:" +accou[i].email);
					System.out.println("Full name: "+accou[i].fullName);
					System.out.println("Phòng ban là :"+accou[i].department.departmentName);
				}
				//Q11:
				for(int i=1;i>=1;i++){
					System.out.println("Thông tin department thứ "+i+"là :");
					System.out.println("ID là: "+ depart[i].id1);
					System.out.println("Name :"+ depart[i].departmentName);
				}
				//Q12:
				for(int i=1;2>=i && i>=1;i++){
					System.out.println("Thông tin department thứ "+i+"là :");
					System.out.println("ID là: "+ depart[i].id1);
					System.out.println("Name :"+ depart[i].departmentName);
				}
				//Q13:
				for(int i=1;2!=i && i>=1;i++){
					System.out.println("thông tin account "+i+ "là:");
					System.out.println("Email:" +accou[i].email);
					System.out.println("Full name: "+accou[i].fullName);
					System.out.println("Phòng ban là :"+accou[i].department.departmentName);
				}
				//Q14:
				//Q15:
				for(int i=1;i>0 && i<=20 ;i++){
					if(i%2==0){
					System.out.println(i);
					}else{
					}
				}
				//Q16:While
				//
				int m=0;
				while(m<=accou.length){
					System.out.println("thông tin account "+m+ "là:");
					System.out.println("Email:" +accou[m].email);
					System.out.println("Full name: "+accou[m].fullName);
					System.out.println("Phòng ban là :"+accou[m].department.departmentName);
				}
				//
				int n=0;
				while(n<=depart.length){
					System.out.println("Thông tin department thứ "+n+"là :");
					System.out.println("ID là: "+ depart[n].id1);
					System.out.println("Name :"+ depart[n].departmentName);
				}
				//
				int p =1;
				while(p<=2){
					System.out.println("thông tin account "+p+ "là:");
					System.out.println("Email:" +accou[p].email);
					System.out.println("Full name: "+accou[p].fullName);
					System.out.println("Phòng ban là :"+accou[p].department.departmentName);
				}
				//
				int q =1;
				while(q!=2){
					System.out.println("thông tin account "+p+ "là:");
					System.out.println("Email:" +accou[p].email);
					System.out.println("Full name: "+accou[p].fullName);
					System.out.println("Phòng ban là :"+accou[p].department.departmentName);
				}
				//
				//
				int h=0;
				while(h<=20){
					if (h%2==0){
						System.out.println("h");
					}else{
					}
				}
				
				
		}
		}