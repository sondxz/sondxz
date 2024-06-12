package Bai01;

import java.util.Scanner;

public class PhanSo {
	private float ts;
	private float ms;
	
	public PhanSo() {
	}
	
	public PhanSo(float ts, float ms) {
		this.ts = ts;
		this.ms = ms;
	}
	
	public void addPhanSo (Scanner sc) { 
		int a;
		int b;
		System.out.println("Moi ban nhap tu so:");
		a = sc.nextInt();
		System.out.println("Moi ban nhap mau so:");
		b = sc.nextInt();
		
		if(b == 0) {
			System.out.println("Mau so khong duoc bang 0");
		}
		else {
			ts = a;
			ms = b;
		}
		
	}
	
	public void showPhanSo() {
		if(ts*ms <0) {
			System.out.println("\t-" + Math.abs(ts) + "/" + Math.abs(ms));
		}
		else {
			System.out.println("\t" + Math.abs(ts) + "/" + Math.abs(ms));
		}
	}
	
	public PhanSo TongPhanSo(PhanSo ps2) {
		float a = ts * ps2.ms + ps2.ts * ms;
		float b = ms * ps2.ms;
		
		return new PhanSo(a,b);
	}
	
	
	public PhanSo HieuPhanSo(PhanSo ps2) {
		float a = ts * ps2.ms - ps2.ts * ms;
		float b = ms * ps2.ms; 
		return new PhanSo(a, b);
	}
	
	public PhanSo NhanPhanSo(PhanSo ps2) {
		float a = ts * ps2.ts;
		float b = ms * ps2.ms;
		return new PhanSo(a,b);
	}
	
	public PhanSo ThuongPhanSo(PhanSo ps2) {
		float a = ts * ps2.ms;
		float b = ms * ps2.ts;
		return new PhanSo(a,b);
	}
	
	public float USCLN(float a, float b) {
		float  r = a % b;
		while(r != 0) {
			a = b;
			b = r;
			r = a % b;
		}
		return r;
	}
	
	public boolean Kiemtra() {
		if(USCLN(ts, ms) == 1) {
			return true;
		}
		else return false;
	}
	public void RutGon() {
		float x = USCLN(ts, ms);
		ts /= x;
		ms /= x;
	}
}
