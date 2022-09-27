package ayesha;

public class user {
	private int id;
	public String toString() {
		return "user [user_id=" + id + ", user_name=" + firstname + ", Email_address=" + Email
				+ ", password=" + password + "]";
	}
	private String firstname;
	private String password;
	private String Email;
	public user(int id, String firstname, String password, String email) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.password = password;
		Email = email;
	}
	public user() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	

}
