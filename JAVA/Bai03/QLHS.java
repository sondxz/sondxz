
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
	
	int n;
	public void nhapDanhSachHS(Scanner sc) {
		
		System.out.println("So luong hoc sinh co trong danh sach la: ");
		n = sc.nextInt();
		
		System.out.println("Nhap thon tin hoc sinh: ");
		for(int i=0;i<n;i++) {
			System.out.println("Hoc sinh thu " + (i+1) + " la: ");
			
			HocSinh hs = new HocSinh();
			hs.nhapThongTin(sc);
			
			
			themHocSinh(hs);
		}
	}
	
	public void inDanhSach() {
		n=dshs.size();
		for(int i=0;i<n;i++) {
			System.out.println("Hoc sinh thu " + (i+1) + ":");
			dshs.get(i).inThongTin();
			
		}
		
	}
	
	public void timKiemHocSinh(int namSinh, String queQuan){
		for (HocSinh hs : dshs) {
			if((hs.getngaySinh().getYear() + 1900 == namSinh) &&(queQuan.equals(getqueQuan())))
				hs.inThongTin();
		}
		
	}
	public static void main(String[] args){
		QLHS qlhs = new QLHS();
		Scanner sc = new Scanner(System.in);
		qlhs.nhapDanhSachHS(sc);
		qlhs.timKiemHocSinh(1985, "Thai Nguyen");
		qlhs.timKiemHocSinh(1985,"10A1");
		}
	
	
}
