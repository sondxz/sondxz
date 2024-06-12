package Bai03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	private String fullname;
	private Date Ngaysinh;
	private String NgheNghiep;
	
	public Nguoi() {
		
	}
	
	public Nguoi(String fullname, Date Ngaysinh, String NgheNghiep) {
		this.fullname = fullname;
		this.Ngaysinh = Ngaysinh;
		this.NgheNghiep = NgheNghiep;
	}
	
	public void nhapThongTin(Scanner sc) {
		System.out.println("Nhap ho ten: ");
		fullname = sc.nextLine();
		System.out.println("Nhap ngay sinh: ");
		String ngaySinhstr=sc.nextLine();
		Ngaysinh = stringToDate(ngaySinhstr);
		
		System.out.println("Nhap nghe nghiep: ");
		NgheNghiep = sc.nextLine();
	}
	
	public Date stringToDate(String ngaySinhStr) {
		Date Ngaysinh = null;
		
		SimpleDateFormat sdf =  new SimpleDateFormat(ngaySinhStr);
		try {
			Ngaysinh =sdf.parse(ngaySinhStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Loi chuyen doi");
		}
		return Ngaysinh;
	}
	
	public void inThongTin() {
		System.out.println("Ho ten la: " + fullname);
		System.out.println("Ngay sinh: " + Ngaysinh);
		System.out.println("Nghe nghiep la: " + NgheNghiep);
	}
	
	public Date getNgaysinh() {
		return Ngaysinh;
	}
}
