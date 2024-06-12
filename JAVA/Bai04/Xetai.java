package Bai04;

import java.util.Date;
import java.util.Scanner;

public class Xetai extends PTGT {
	private int Taitrong;

	public Xetai() {}

	public Xetai(String hangSanXuat, Date namSanXuat, int Gia, String Mau, int Taitrong) {
		super(hangSanXuat, namSanXuat, Gia, Mau);
		this.Taitrong = Taitrong;
	}

	public void nhapThongTin(Scanner sc) {
		System.out.println("Nhap tai trong cua xe:");
		Taitrong = sc.nextInt();
	}

	public void inThongTin() {
		System.out.println("Tai trong cua xe la: " + Taitrong);
	}
}
