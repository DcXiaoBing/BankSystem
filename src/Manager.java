public class Manager extends User {
	private boolean manager = true;
	Manager(String xuserId, String xlogin, String xpassword){
		super(xuserId,xlogin,xpassword);
		this.manager = true;
	}
}