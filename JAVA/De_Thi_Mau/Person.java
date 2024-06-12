package De_Thi_Mau;

public class Person {
	private String name;
	private String address;
	
	//constructor 1
	public Person() {
		
	}
	
	//constructor 2
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	//Ham get name
	public String getName () {
		return name;
	}
	
	//Ham get address
	public String getAddress() {
		return address;
	}
}
