
public class Customer extends User {
	private boolean customer = true;
	Customer(int xuserId, String xlogin, String xpassword){
		super(xuserId,xlogin,xpassword);
		this.customer = true;
	}
	Customer(String xlogin, String xpassword){
		super(xlogin,xpassword);
		this.customer = true;
	}
}