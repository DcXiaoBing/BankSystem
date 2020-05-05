import java.util.*;

public class Loan{
	private int id;
	private double originalBalance;
	private double monthlyRepay;
	private double remainingBalance;
	ArrayList<Collateral> collateralList;
	Loan(int xid, double origBal, double repay, double remainBal, ArrayList<Collateral> colList){
		id = xid;
		originalBalance = origBal;
		monthlyRepay = repay;
		remainingBalance = remainBal;
		collateralList = colList;
	}
	Loan(double origBal, double repay, double remainBal, ArrayList<Collateral> colList){
		originalBalance = origBal;
		monthlyRepay = repay;
		remainingBalance = remainBal;
		collateralList = colList;
	}
	public int getid() {
		return id;
	}
	public double getoriginalBalance() {
		return originalBalance;
	}
	public double getmonthlyRepay() {
		return monthlyRepay;
	}
	public double getremainingBalance() {
		return remainingBalance;
	}
	public void setremainingBalance(double remain) {
		remainingBalance = remain;
	}
	public void monthRepay() {
		remainingBalance -= monthlyRepay;
	}
	public void repayBalance(double repay) {
		remainingBalance -= repay;
	}
}