package Bai02;

import java.util.Date;
import java.util.Scanner;

public class Congnhan extends CanBo {
private String Bac;
	
	public Congnhan() {
		
	}
	
	public Congnhan(String fullname , Date date, String gt, String address, String Bac) {
		super();
		this.Bac = Bac;
	}
	
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.println("Nhap bac cua nhan vien: ");
		Bac = sc.nextLine();
	}
	
	public void hienThongTin() {
		super.hienThongTin();
		System.out.println("\nBac cua nhan vien la: " + Bac);
	}
}
