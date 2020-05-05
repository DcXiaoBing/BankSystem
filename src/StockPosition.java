public class StockPosition{
	//class to handle buy and sell orders in our atm
	private int id;
	private char position; //'S' for sell, 'B' for buy
	private int date; 
	private int stockId;
	StockPosition(int xid, char xposition, int date, int stockId){
		this.id = xid;
		this.position = xposition;
	}
	public int getid() {
		return id;
	}
	public void setid(int xid) {
		id = xid;
	}
	public int getstockId() {
		return id;
	}
	public void setstockId(int xstockId) {
		stockId = xstockId;
	}
	public char getposition() {
		return position;
	}
	public void setposition(char xposition) {
		position = xposition;
	}
	
	public int getdate() {
		return date;
	}
	public void setdate(int xdate) {
		date = xdate;
	}
}