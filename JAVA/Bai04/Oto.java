package Bai04;

import java.util.Date;
import java.util.Scanner;

public class Oto extends PTGT {
	private int soCho;
	private String kieuDongCo;
	
	public Oto() {}
	
	public Oto(String hangSanXuat, Date namSanXuat, int Gia, String Mau, int soCho, String kieuDongCo) {
		super(hangSanXuat, namSanXuat, Gia, Mau);
		this.soCho = soCho;
		this.kieuDongCo = kieuDongCo;
	}
	
	public void nhapThongTin(Scanner sc) {
		System.out.println("Nhap so cho cua xe: ");
		soCho = sc.nextInt();
		System.out.println("Nhap kieu dong co cho xe: ");
		kieuDongCo = sc.nextLine();
	}
	
	public void inThongTin() {
		System.out.println("So cho cua xe la: " + soCho);
		System.out.println("Kieu dong co cua xe la: " + kieuDongCo);
	}
}
