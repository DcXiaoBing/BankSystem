import java.util.*;

public class Stock {
	String id;
	double price;
	int amount;
	Stock(String xid, double xprice, int xamount){
		id = xid;
		price = xprice;
		amount = xamount;
	}
	public String getid() {
		return id;
	}
	public void setid(String xid) {
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