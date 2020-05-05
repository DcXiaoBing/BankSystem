public class Manager extends User {
	private boolean manager = true;
	Manager(int xuserId, String xlogin, String xpassword){
		super(xuserId,xlogin,xpassword);
		this.manager = true;
	}
	Manager(String xlogin, String xpassword){
		super(xlogin,xpassword);
		this.manager = true;
	}
}