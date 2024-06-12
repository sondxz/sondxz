package Bai02;

import java.util.Date;
import java.util.Scanner;

public class Nhanvien extends CanBo {
	private String congViec;
	
	public Nhanvien() {
		
	}
	
	public Nhanvien(String fullname , Date date, String gt, String address, String congViec) {
		super();
		this.congViec = congViec;
	}
	
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.println("Nhap cong viec: ");
		congViec = sc.nextLine();
	}
	
	public void hienThongTin() {
		super.hienThongTin();
		System.out.println("\nCong viec la: " + congViec);
	}
}
