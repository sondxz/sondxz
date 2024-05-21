package baiToan_tamGiac;

public class Tamgiac {
	private Diem A;
	
	//Khai bao diem B
	private Diem B;
	
	//khai bao diem C
	private Diem C;
	
	//khai bao bien
	private float AB;
	private float BC;
	private float CA;
	
	//constructor 1
	public Tamgiac() {
		
	}
	
	//constructor 2
	public Tamgiac(Diem A,Diem B,Diem C) {
		//Khai bao diem
		this.A = A;
		this.B = B;
		this.C = C;
		
		//Tinh kc
		AB = A.kc(B);
		BC = B.kc(C);
		CA = C.kc(A);
		
	}
	
	//ham dien tich
	public float dienTich() {
		//Tinh nua chu vi
		float p = (AB + BC + CA) / 2;
		
		//Tinh dien tich
		float dt = (float)Math.sqrt(p * (p - AB) * (p - BC) * (p - CA));
		return dt;
	}
	
	//Tinh chu vi
	public float chuVi() {
		return AB + BC + CA;
	}
}

	
