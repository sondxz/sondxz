
package Bai04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	protected String hoTen;
	protected Date ngaySinh;
	protected String queQuan;
	public Nguoi() {
	
	}
	
	public Nguoi(String hoTen,Date ngaySinh) {
		this.hoTen=hoTen;
		this.ngaySinh=ngaySinh;
	}
	
	public Nguoi(String hoTen,Date ngaySinh,String queQuan) {
		this(hoTen,ngaySinh);
		this.queQuan=queQuan;
	}	
	
	public void nhapThongTin(Scanner sc) {
		System.out.println("Nhap ho ten: ");
		hoTen=sc.nextLine();
		System.out.println("Nhap ngay sinh(dd/MM/yyyy): ");
		String ngaySinhstr=sc.nextLine();
		ngaySinh=stringToDate(ngaySinhstr);
		System.out.println("Nhap que quan: ");
		queQuan=sc.nextLine();
	}
	
	public Date stringToDate(String ngaySinhStr) {
		Date ngaySinhDate = null;
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			ngaySinhDate =sdf.parse(ngaySinhStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Loi chuyen doi");
		}
		
		return ngaySinhDate;
		
		
	}
	
	public void inThongTin() {
		System.out.println("Ho ten: "+ hoTen);
		System.out.println("Ngay sinh: "+ ngaySinh);
		System.out.println("Que quan: "+ queQuan);
		
	}
	
	public static void main(String[] args) {
		HocSinh hurman=new HocSinh();
		Scanner sc= new Scanner(System.in);
		hurman.nhapThongTin(sc);
		hurman.inThongTin();
		
	}
	
}

