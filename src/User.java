
public class User {
	private int userId;
	private String login;
	private String password;
	
	User(int xuserId, String xlogin, String xpassword){
		this.userId = xuserId;
		this.login = xlogin;
		this.password = xpassword;
	}
	User(String xlogin, String xpassword){
		this.login = xlogin;
		this.password = xpassword;
	}
	public int getuserId() {
		return userId;
	}
	public void setuserId(int xuserId) {
		userId = xuserId;
	}
	public String getlogin() {
		return login;
	}
	public void setlogin(String xlogin) {
		login = xlogin;
	}
	public String getpassword() {
		return password;
	}
	public void setpassword(String xpassword) {
		password = xpassword;
	}
}