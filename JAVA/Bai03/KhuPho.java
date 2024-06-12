package Bai03;

import java.time.Year;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import Bai02.CanBo;
import Bai02.QLCB;

public class KhuPho {
	private List<HoDan> dshd;

	public KhuPho() {
		dshd = new ArrayList<HoDan>(10);
	}

	public void addHodan(HoDan hd) {
		dshd.add(hd);
	}

	public void nhapDanhSach(Scanner sc) {
		System.out.println("Nhap vao danh sach cac ho dan: ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.println("Nhap thong tin khu pho: ");
			HoDan hd = new HoDan();
			System.out.println("Khu pho thu " + (i + 1) + " la:");
			hd.nhapThongTin(sc);
			addHodan(hd);
		}
	}

	public void inDanhSach() {
		int n = dshd.size();
		for (int i = 0; i < n; i++) {
			System.out.println("Khu pho thu " + (i + 1) + ":");
			dshd.get(i).inThongTin();
		}
	}

	public void Timkiem() {
		Date now = new Date();
		int namHienTai = now.getYear() + 1900;

		Nguoi[] dstv = null;

		for (HoDan hd : dshd) {
			dstv = hd.getList();
			for (int i = 0; i < hd.getSoNguoi(); i++) {
				if (namHienTai - (dstv[i].getNgaysinh().getYear() + 1900) == 80)
					hd.inThongtin();
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		KhuPho dshd = new KhuPho();
		dshd.nhapDanhSach(sc);
		dshd.inDanhSach();
		dshd.Timkiem();
	} 
}
