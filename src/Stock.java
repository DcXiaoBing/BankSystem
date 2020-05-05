import java.util.*;

public class Stock {
	int id;
	double price;
	int amount;
	Stock(int xid, double xprice, int xamount){
		id = xid;
		price = xprice;
		amount = xamount;
	}
	Stock(double xprice, int xamount){
		price = xprice;
		amount = xamount;
	}
	public int getid() {
		return id;
	}
	public void setid(int xid) {
		id = xid;
	}
	public double getprice() {
		return price;
	}
	public void setvalue(double xprice) {
		price = xprice;
	}
	public int getamount() {
		return amount;
	}
	public void setamount(int xamount) {
		amount = xamount;
	}
}