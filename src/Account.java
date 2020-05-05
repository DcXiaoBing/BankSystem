public abstract class Account{
	protected int id;
	protected boolean stockAcc;
	protected boolean depositAcc;
	protected boolean savingsAcc;
	protected boolean checkingAcc;
	Account(int xid){
		this.id = xid;
	}
	Account(){
		
	}
	public abstract double getBalance();
	public abstract Account createAccount();
	public boolean isstockAcc() {return stockAcc;}
	public boolean isdepositAcc() {return depositAcc;}
	public boolean issavingsAcc() {return savingsAcc;}
}