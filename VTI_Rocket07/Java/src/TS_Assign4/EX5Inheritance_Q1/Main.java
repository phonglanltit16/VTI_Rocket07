package TS_Assign4.EX5Inheritance_Q1;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	static ArrayList<CanBo> canBo = new ArrayList<CanBo>();

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		boolean kt = true;
		do{
			System.out.println("Lựa chọn chức năng sử dụng");
			System.out.println("1. Thêm mới cán bộ");
			System.out.println("2. Tìm kiếm (theo họ tên)");
			System.out.println("3. Hiển thị danh sách cán bộ");
			System.out.println("4. Nhập tên cán bộ và xóa cán bộ đó");
			System.out.println("5. Thoát chương trình.");
			int a = sc.nextInt();
			switch (a){
			case 1: addCanBo();
				kt=true;
				break;
			case 2 : searchCanBo();
				kt=true;
				break;
			case 3 : inputDSCanBo();
				kt=true;
				break;
			case 4 : delCanBo();
				kt=true;
				break;
			case 5 : 
				kt=false;
				break;
			default : 
				kt=true;
				System.out.println("Nhập sai, nhập lại");
			}	
		}while (kt = false);
			
		sc.close();
	}

	public static void delCanBo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho ten can bo muon xoa: ");
		String hoTen = sc.nextLine();
		canBo.removeIf(cb -> hoTen.equals(cb.getHoTen()));
		sc.close();
	}

	public static void inputDSCanBo() {
		// TODO Auto-generated method stub
		
	}

	public static void searchCanBo() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap ho ten can bo muon tim kiem: ");
			String hoTen = sc.nextLine();
			int ketQua=0;
			for(CanBo person : canBo) {
				if(person.getHoTen().equals(hoTen)) {
					ketQua++;
					person.getInfor();
				}
			}
			System.out.println(ketQua+" ket qua tra ve!");
			sc.close();
		}
	public static void addCanBo() {
		CanBo newCanBo = new CanBo();
		Scanner sc= new Scanner(System.in);
		System.out.println("Chọn tạo mới:");
		System.out.println("1. Công nhân");
		System.out.println("2. Kỹ sư");
		System.out.println("3. Nhân viên");
		byte z = sc.nextByte();
		if (z == 1) {
			newCanBo = new CongNhan();
			newCanBo.inputCanBo();
			canBo.add(newCanBo);
		} else if (z == 2) {
			newCanBo = new KySu();
			newCanBo.inputCanBo();
			canBo.add(new KySu());
		} else if (z == 3) {
			newCanBo = new NhanVien();
			newCanBo.inputCanBo();
			canBo.add(new NhanVien());
		} else{
			System.out.println("Nhập sai, Nhập lại");
		}
		sc.close();
	}
	
}
