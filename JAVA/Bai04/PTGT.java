package Bai04;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PTGT {
	private String hangSanXuat;
	private Date namSanXuat;
	private int Gia;
	private String Mau;
	
	public PTGT() {
		
	}
	
	public PTGT(String hangSanXuat, Date namSanXuat, int Gia, String Mau) {
		this.hangSanXuat = hangSanXuat;
		this.namSanXuat = namSanXuat;
		this.Gia = Gia;
		this.Mau = Mau;
	}
	
	public void nhapThongTin(Scanner sc) {
		System.out.println("Nhap hang san xuat xe: ");
		hangSanXuat = sc.nextLine();
		System.out.println("Nhap nam san xuat cua xe: ");
		String nam = sc.nextLine();
		namSanXuat = toDate(nam);
		System.out.println("Nhap gia ban: ");
		Gia = sc.nextInt();
		System.out.println("Nhap mau cua xe: ");
		Mau = sc.nextLine();
	}
	
	public Date toDate(String nam) {
		Date namSanXuat = null;
		SimpleDateFormat sdf = new SimpleDateFormat(nam);
		try {
			namSanXuat = sdf.parse(nam);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Loi chuyen doi");
		}
		return namSanXuat;
	}
	
	public void inThongTin() {
		System.out.println("Hang san xuat xe la: " + hangSanXuat);
		System.out.println("Nam san xuat la: " + namSanXuat);
		System.out.println("Gia cua xe la: " + Gia);
		System.out.println("Mau cua xe la: " + Mau);
	}
	
}
