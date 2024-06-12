package Bai02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CanBo {
	private String fullname;
	private Date date;
	private String gt;
	private String address;
	
	public CanBo() {
		
	}
	
	public CanBo(String fullname, Date date, String gt, String address) {
		this.fullname = fullname;
		this.gt = gt;
		this.date = date;
		this.address = address;
	}
	
	public String getFullname() {
		return fullname;
	}
	
	public void nhapThongTin (Scanner sc) {
		System.out.println("Nhap ho ten can bo: ");
		fullname = sc.nextLine();
		System.out.println("Nhap ngay sinh(dd/mm/yyyy): ");
		String ngaySinhstr=sc.nextLine();
		date = stringToDate(ngaySinhstr);
		System.out.println("Nhap gioi tinh: ");
		gt = sc.nextLine();
		System.out.println("Nhap dia chi: ");
		address = sc.nextLine();
	}
	
	public Date stringToDate(String ngaySinhStr) {
		Date ngaysinh = null;
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		try {
			ngaysinh =sdf.parse(ngaySinhStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Loi chuyen doi");
		}
		return ngaysinh;
	}
	
	public void hienThongTin() {
		System.out.println("Ho ten: " + fullname);
		System.out.println("\nNgay sinh: " + date);
		System.out.println("\nGioi tinh: " + gt);
		System.out.println("\nDia chi: " + address);
	}
}
