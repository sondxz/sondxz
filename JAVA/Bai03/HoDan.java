package Bai03;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class HoDan extends Nguoi {
	private int soNguoi;
	private int soNha;
	private Nguoi[] List;
	
	public HoDan() {
		List = new Nguoi[10];
	}
	
	public HoDan(String fullname, Date Ngaysinh, String NgheNghiep, int soNguoi, int soNha) {
		super(fullname, Ngaysinh, NgheNghiep);
		this.soNguoi = soNguoi;
		this.soNha = soNha;
	}
	
	public void nhapThongtin(Scanner sc) {
		System.out.println("Nhap so nguoi cua ho dan la: ");
		soNguoi =sc.nextInt();
		System.out.println("Nhap so nha cua ho dan la: ");
		soNha = sc.nextInt();
		
		System.out.println("Nhap thong tin cho tung thanh vien: ");
		for (int i = 0; i < soNguoi; i++) {
			System.out.println("Nguoi thu " + (i + 1) + "la: ");
			List[i] = new Nguoi();
			List[i].nhapThongTin(sc);	
		}
	}
	
	public void inThongtin() {
		System.out.println("So nguoi cua ho dan la: " + soNguoi);
		System.out.println("So nha cua ho dan la: " + soNha);
		System.out.println("Thong tin cho tung thanh vien: ");
		for (int i = 0; i < soNguoi; i++) {
			System.out.println("Nguoi thu " + (i + 1) + "la: ");
			List[i].inThongTin();
		}
	}
	
	public Nguoi[] getList() {
		return List;
	}
	
	public  int getSoNguoi() {
		return soNguoi;
	}
}
