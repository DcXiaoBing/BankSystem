import java.util.*;

public class Collateral{
	String id;
	String name;
	double value;
	double amount;
	Collateral(String xid, String xname, double xvalue, double xamount){
		this.id = xid;
		this.name = xname;
		this.value = xvalue;
		this.amount = xamount;
	}
	public String getid() {
		return id;
	}
	public void setid(String xid) {
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