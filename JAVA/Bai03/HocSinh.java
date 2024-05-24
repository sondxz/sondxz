
package Bai03;

import java.util.Date;
import java.util.Scanner;

public class HocSinh extends Nguoi
{
	private String lop;
	private String khoaHoc;
	private int kyHoc;
	
	public HocSinh(){}
	
	public HocSinh(String hoTen, Date ngaySinh, String lop, int kyHoc){
		super(hoTen, ngaySinh);
		this.lop=lop;
		this.kyHoc=kyHoc;
	}
	
	public HocSinh(String hoTen, String lop, String khoaHoc){
		this.hoTen=hoTen;
		this.lop=lop;
		this.khoaHoc=khoaHoc;
	}
	
	public void nhapThongTin(Scanner sc){
		super.nhapThongTin(sc);
		
		System.out.println("Nhap lop: ");
		lop=sc.nextLine();
		System.out.println("Nhap khoa hoc: ");
		khoaHoc=sc.nextLine();
		System.out.println("Nhap ky hoc: ");
		kyHoc=sc.nextInt(); 
		sc.nextLine();
		System.out.println("-----------");
	}
	
	public void inThongTin(){
		super.inThongTin();
		
		System.out.println("Lop: "+ lop);
		System.out.println("Khoa hoc: "+ khoaHoc);
		System.out.println("Ky hoc: "+ kyHoc);
	}
	
	public String getLop(){
		return lop;
	}

}
