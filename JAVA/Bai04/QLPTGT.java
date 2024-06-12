package Bai04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLPTGT {
	private List<PTGT> qlpt;
	
	public QLPTGT() {
		qlpt = new ArrayList();
	}
	
	public void addXe(PTGT gt) {
		qlpt.add(gt);
	}
	
	public void nhapDanhSach(Scanner sc) {
		System.out.println("Moi ban nhap so luong xe: ");
		int n;
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("moi ban nhap loai xe (1-xe may) (2-Oto) (3-xetai): ");
			int chon;
			chon = sc.nextInt();
			System.out.println("Xe thu " + (i+1) + " la: ");
			PTGT gt = new PTGT();
			switch (chon) {
			case 1:
				gt = new Xemay();
				break;
			case 2:
				gt = new Oto();
				break;
			case 3:
				gt = new Xetai();	
				break;
			default:
				gt = new Xemay();
				break;
			}
			gt.nhapThongTin(sc);
			addXe(gt);
		}
		
		
	}
	
	public void inDanhSach() {
		int n = qlpt.size();
		for (int i = 0; i < n; i++) {
			System.out.println("Xe thu " + (i + 1) + ":");
			qlpt.get(i).inThongTin();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	}

}
