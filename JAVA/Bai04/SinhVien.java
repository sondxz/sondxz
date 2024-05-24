package Bai04;

import java.util.Scanner;

public class SinhVien extends Nguoi
{
	private String msv;
	
	public SinhVien() 
	{
		
	}
	
	public SinhVien(String hoTen, String msv) 
	{
		this.hoTen = hoTen;
		this.msv = msv;
	}
	
	@Override
	public void nhapThongTin(Scanner sc) {
		// TODO Auto-generated method stub
		super.nhapThongTin(sc);
		System.out.print("Nhap ma sinh vien: ");
		sc.nextLine();
	}
	@Override
	public void inThongTin() {
		// TODO Auto-generated method stub
		super.inThongTin();
		System.out.println("Ma sinh vien: " + msv);
	}
	
	public String getMsv () {
		return msv;
	}
}