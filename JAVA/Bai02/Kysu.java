package Bai02;

import java.util.Date;
import java.util.Scanner;

public class Kysu extends CanBo {
	private String nganhDaoTao;
	
	public Kysu() {
		
	}
	
	public Kysu(String fullname , Date date, String gt, String address, String nganhDaoTao) {
		super();
		this.nganhDaoTao = nganhDaoTao;
	}
	
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.println("Nhap nganh dao tao: ");
		nganhDaoTao = sc.nextLine();
	}
	
	public void hienThongTin() {
		super.hienThongTin();
		System.out.println("\nNganh dao tao la: " + nganhDaoTao);
	}
}
