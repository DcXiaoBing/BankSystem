import java.util.*;

public abstract class StockAccount extends Account{
	private ArrayList<Stock> stockList = new ArrayList<Stock>();
	private double balance;
	//selling and buying list, not sure on the implementation yet, need to see where to put either
	StockAccount(int xid, double xbalance){
		super(xid);
		this.stockAcc = true;
		this.balance = xbalance;
	}
	StockAccount(double xbalance){
		super();
		this.stockAcc = true;
		this.balance = xbalance;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double xbalance) {
		balance = xbalance;
	}
	//add negative number to subtract
	public void addBalance(double x) {
		balance += x;
	}
	public void addStock(Stock s) {
		stockList.add(s);
	}
}