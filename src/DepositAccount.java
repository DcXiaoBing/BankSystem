import java.util.*;

public abstract class DepositAccount extends Account{
	protected double balance;
	protected ArrayList<Transaction> transactionList = new ArrayList<Transaction>();
	protected ArrayList<Loan> loanList = new ArrayList<Loan>();
	DepositAccount(String xid){
		super(xid);
	}
	public abstract void transferBalance();
	public abstract void withdrawBalance();
	public abstract void exchangeCurrency();
	public abstract void requestLoan();
	public abstract void repayLoan();
	public double getbalance() {
		return balance;
	}
	public void setbalance(double xbalance) {
		balance = xbalance;
	}
	public ArrayList<Transaction> gettransactionList() {
		return transactionList;
	}
	public void addTransaction(Transaction x) {
		transactionList.add(x);
	}
	public ArrayList<Loan> getloanList() {
		return loanList;
	}
//	public void addLoan(Transaction x) {
//		transactionList.add(x);
//	}
}