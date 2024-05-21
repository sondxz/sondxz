package baiToan_tamGiac;
import java.lang.Math;

public class Diem {
	float x;
	float y;
	
	//constrctor 1
	public Diem () 
	{
		x = 0;
		y = 0;
	}
	
	//constructor 2
	public Diem (float x,float y) 
	{
		this.x = x;
		this.y = y;
	}
	
	//phuong thuc tinh kc
	public float kc (Diem d) 
	{
		float kc = (float)Math.sqrt((x - d.x) * (x - d.x) + (y - d.y) * (y - d.y));
		return kc;
	}
	
	//phuong thuc in diem
	public void inDiem() 
	{
		System.out.println ("(" + x + "," + y +")");
	}
}

