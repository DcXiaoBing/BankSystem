public abstract class SavingsAccount extends DepositAccount{
	private double interest; //5% interest would be 1.05
	SavingsAccount(int xid, double xinterest){
		super(xid);
		this.savingsAcc = true;
		this.interest = xinterest;
	}
	SavingsAccount(double xinterest){
		super();
		this.savingsAcc = true;
		this.interest = xinterest;
	}
	public double getinterest() {
		return interest;
	}
	public void setinterest(double xinterest) {
		interest = xinterest;
	}
	//time units are each interest cycle, can change to days or months etc later
	public void calculateInterest(int timeUnits) {
		double total = this.getbalance();
		for(int x = 0; x < timeUnits; x++) {
			total *= interest;
		}
		this.setbalance(total);
	}
}