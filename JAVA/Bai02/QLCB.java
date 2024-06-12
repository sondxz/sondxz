package Bai02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLCB {
	private List<CanBo> qlcb;

	public QLCB() {
		qlcb = new ArrayList<CanBo>(100);
	}

	public void themCanBo(CanBo cb) {
		qlcb.add(cb);
	}

	public void nhapDanhsach(Scanner sc) {
		System.out.println("So luong can bo trong danh sach la: ");
		int n = sc.nextInt();
		sc.nextLine();

		System.out.println("Nhap thong tin can bo: ");
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap loai can bo (1-Kysu) (2-Congnhan) (3-Nhanvien): ");
			System.out.println("Can bo thu " + (i + 1) + " la: ");
			int chon = sc.nextInt();
			sc.nextLine();
			CanBo cb = new CanBo();
			switch (chon) {
			case 1:
					cb = new Kysu();
				break;
			case 2:
					cb = new Congnhan();
				break;
			case 3:
					cb = new Nhanvien();
				break;
			default:
				cb = new Kysu();
				break;
			}
			cb.nhapThongTin(sc);
			themCanBo(cb);
		}
	}

	public void hienDanhSach() {
		int n = qlcb.size();
		for (int i = 0; i < n; i++) {
			System.out.println("Can Bo thu " + (i + 1) + ":");
			qlcb.get(i).hienThongTin();
		}

	}

	public void TimKiem(String fullname) {
		System.out.println("Danh sach can bo co ten la:  " + fullname);
		for (CanBo cb : qlcb) {
			if (cb.equals(cb.getFullname()))
				cb.hienThongTin();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		QLCB qlcb = new QLCB();
		qlcb.nhapDanhsach(sc);
		qlcb.hienDanhSach();
		qlcb.TimKiem("nguyen van a");
	}
}
