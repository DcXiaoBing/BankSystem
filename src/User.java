
public class User {
	private String userId;
	private String login;
	private String password;
	
	User(String xuserId, String xlogin, String xpassword){
		this.userId = xuserId;
		this.login = xlogin;
		this.password = xpassword;
	}
	public String getuserId() {
		return userId;
	}
	public void setuserId(String xuserId) {
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