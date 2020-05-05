import java.util.*;

public class Collateral{
	int id;
	String name;
	double value;
	double amount;
	Collateral(int xid, String xname, double xvalue, double xamount){
		this.id = xid;
		this.name = xname;
		this.value = xvalue;
		this.amount = xamount;
	}
	Collateral(String xname, double xvalue, double xamount){
		this.name = xname;
		this.value = xvalue;
		this.amount = xamount;
	}
	public int getid() {
		return id;
	}
	public void setid(int xid) {
		id = xid;
	}
	public String getname() {
		return name;
	}
	public void setname(String xname) {
		name = xname;
	}
	public double getvalue() {
		return value;
	}
	public void setvalue(double xvalue) {
		value = xvalue;
	}
	public double getamount() {
		return amount;
	}
	public void setamount(double xamount) {
		amount = xamount;
	}
}