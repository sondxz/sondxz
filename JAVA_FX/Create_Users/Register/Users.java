package Register;

public class Users {
	private String email;
	private String fullname;
	
	//constructor 1
	public Users () {
		
	}
	
	//constructor 2
	public Users(String email, String fullname) {
		this.email = email;
		this.fullname = fullname;
	}
	
	//ham getEmail
	public String getEmail () {
		return email;
	}
	
	//Ham getTen
	public String getFullName() {
		return fullname;
	}
	
	//ham setTen
	public void setFullName(String fullname) {
		this.fullname = fullname;
	}
	
	//ham setEmail
		public void setEmail(String email) {
			this.email = email;
		}
}
