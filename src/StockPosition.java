public class StockPosition{
	//class to handle buy and sell orders in our atm
	private int id;
	private double rate; // rate to USD
	StockPosition(String xname, double xrate){
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