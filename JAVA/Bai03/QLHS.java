
package Bai03;

import java.util.ArrayList;
import java.util.Scanner;


public class QLHS {
	private ArrayList<HocSinh> dshs;
	
	public QLHS() {
		dshs=new ArrayList<HocSinh>(100);	
	}
	
	public void themHocSinh(HocSinh hs) {
		dshs.add(hs);	
	}
	
	
	public void nhapDanhSachHS(Scanner sc) {
		System.out.println("So luong hoc sinh co trong danh sach la: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Nhap thong tin hoc sinh: ");
		for(int i=0;i<n;i++) {
			System.out.println("Hoc sinh thu " + (i+1) + " la: ");
			
			HocSinh hs = new HocSinh();
			hs.nhapThongTin(sc);
			themHocSinh(hs);
		}
	}
	
	public void inDanhSach() {
		int n=dshs.size();
		for(int i=0;i<n;i++) {
			System.out.println("Hoc sinh thu " + (i+1) + ":");
			dshs.get(i).inThongTin();
		}
		
	}
	
	public void timKiemHocSinh(int namSinh, String queQuan){
		System.out.println("Danh sach hoc sinh co nam sinh " + namSinh + " Que O" + queQuan);
		for (HocSinh hs : dshs ) { 
			if((hs.ngaySinh.getYear() + 1900 == namSinh) && (queQuan.equals(hs.queQuan)))
				hs.inThongTin();
		}
		
	}
	public void timKiemHocSinh(String lop){
		System.out.println("Danh sach hoc sinh co lop" + lop);
		for (HocSinh hs : dshs ) { 
			if(lop.equals(hs.getLop()))
				hs.inThongTin();
		}
		
	}

	public static void main(String[] args){
		QLHS qlhs = new QLHS();
		Scanner sc = new Scanner(System.in);
		qlhs.nhapDanhSachHS(sc);
		qlhs.timKiemHocSinh(1985, "Thai Nguyen");
		qlhs.timKiemHocSinh("10A1");
		}
	
	
}
