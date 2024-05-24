package Bai04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class QLNS {
	//Khai bao kieu dsns la interface List de co the linh dong
	//Chon mot kieu khoi tao ve sau: arrayList, LinkedList,...
	private List<Nguoi> dsns;
	
	public QLNS() 
	{
		//khoi tao danh sach 100 phan tu
		dsns = new ArrayList<Nguoi>(100);
	}
	
	public void themNhanSu(Nguoi ns) {
		//Them nhan su vao arraylist
		dsns.add(ns);
	}
	
	public void nhapDanhSach(Scanner sc) {
		// TODO Auto-generated method stub
		//Nhap so sinh vien can nhap
		System.out.println("Nhap so nhan su n = ");
		int n = sc.nextInt();
		sc.nextLine();
		
		//Vong lap 0 -> (n-1): nhap thong tin nhan su va them vao danh sach
		int chon = 0;
		Nguoi ns = null;
		for (int i = 0; i < n; i++) {
			System.out.print("Chon loai ns muon nhap(0: hs,1: sv); ");
			chon =sc.nextInt();
			sc.nextLine();
			switch (chon) {
			case 0:
				ns = new HocSinh();
				break;
			case 1: 
				ns = new SinhVien();
				break;
			}
			ns.nhapThongTin(sc); //Tinh da hinh
			themNhanSu(ns);
		}
	}
	
	public void inDanhSach() {
		// TODO Auto-generated method stub
		//Dung vong lap foreach duyet qua dsns de in thong tin moi hoc sinh
		for (Nguoi ns : dsns) {
			ns.inThongTin(); //Tinh da hinh
		}
	}
	
	//Tim kiem sinh vien co ma 659327 trong danh sach
	public void timKiemTheoMSV(String msv) {
		// TODO Auto-generated method stub
		System.out.println("Sinh vien co ma sinh vien" + msv);
		for (Nguoi ns : dsns) {
			if (ns instanceof Nguoi) { //Chi xet loai sinh vien
				SinhVien sv = (SinhVien)ns; //ep kieu ve sinh vien
				if (msv.equals(sv.getMsv())) {
					sv.inThongTin();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QLNS qlns = new QLNS();
		Scanner sc = new Scanner(System.in);
		qlns.nhapDanhSach(sc);
		qlns.inDanhSach();
		qlns.timKiemTheoMSV("659327");
	}

}
