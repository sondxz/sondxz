package Bai01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhanSo ps1 = new PhanSo();
		PhanSo ps2 = new PhanSo();
		PhanSo TongPS = new PhanSo();
		PhanSo HieuPS = new PhanSo();
		PhanSo TichPS = new PhanSo();
		PhanSo ThuongPS = new PhanSo();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap vao phan so thu nhat: ");
		ps1.addPhanSo(sc);
		System.out.println("Nhap vao phan so thu hai: ");
		ps2.addPhanSo(sc);
		
		TongPS = ps1.TongPhanSo(ps2);
		HieuPS = ps1.HieuPhanSo(ps2);
		TichPS = ps1.NhanPhanSo(ps2);
		ThuongPS = ps1.ThuongPhanSo(ps2);
		
		//Hienthi
		System.out.println("Phan so thu nhat la: ");
		ps1.showPhanSo();
		System.out.println("Phan so thu hai la: ");
		ps2.showPhanSo();
		System.out.println("Tong hai phan so la: ");
		TongPS.showPhanSo();
		System.out.println("Hieu hai phan so la: ");
		HieuPS.showPhanSo();
		System.out.println("Tich hai phan so la: ");
		TichPS.showPhanSo();
		System.out.println("Thuong hai phan so la: ");
		ThuongPS.showPhanSo();
	}

}
