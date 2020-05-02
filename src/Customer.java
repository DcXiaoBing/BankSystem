
public class Customer extends User {
	private boolean customer = true;
	Customer(String xuserId, String xlogin, String xpassword){
		super(xuserId,xlogin,xpassword);
		this.customer = true;
	}
}