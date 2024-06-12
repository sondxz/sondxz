package Bai04;

import java.util.Date;
import java.util.Scanner;

public class Xemay extends PTGT {
	private int Congsuat;
	
	public Xemay() {}
	
	public Xemay(String hangSanXuat, Date namSanXuat, int Gia, String Mau, int Congsuat) {
		super(hangSanXuat, namSanXuat, Gia, Mau);
		this.Congsuat = Congsuat;
	}
	
	public void nhapThongTin(Scanner sc) {
		System.out.println("Nhap cong suat cua xe:");
		Congsuat = sc.nextInt();
	}
	
	public void inThongTin() {
		System.out.println("Cong suat cua xe la: " + Congsuat);
	}
}
