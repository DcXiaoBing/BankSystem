public abstract class Account{
	protected String id;
	protected boolean stockAcc;
	protected boolean depositAcc;
	protected boolean savingsAcc;
	Account(String xid){
		this.id = xid;
	}
	public abstract double getBalance();
	public abstract Account createAccount();
	public boolean isstockAcc() {return stockAcc;}
	public boolean isdepositAcc() {return depositAcc;}
	public boolean issavingsAcc() {return savingsAcc;}
}