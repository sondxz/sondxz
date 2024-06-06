
package Register;

public class User {
	private String email;
	private String fullname;
	
	//constructor 1
	public User () {
		
	}
	
	//constructor 2
	public User(String email, String fullname) {
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
