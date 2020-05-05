public class Currency{
	//class to handle different types of currency in our ATM
	private String name; //has to be 3 characters long eg 'USD'
	private double rate; // rate to USD
	Currency(String xname, double xrate){
		this.name = xname;
		this.rate = xrate;
	}
	public String getname() {
		return name;
	}
	public void setname(String xname) {
		name = xname;
	}
	public double getrate() {
		return rate;
	}
	public void setrate(double xrate) {
		rate = xrate;
	}
}