import java.util.*;

public class Transaction{
	int transactionId;
	int transactionDate;
	double amount;
	String otherAccountId;
	Transaction(int xtransId, int xDate, double xamount, String xAccId){
		this.transactionId = xtransId;
		this.transactionDate = xDate;
		amount = xamount;
		otherAccountId = xAccId;
	}
	Transaction(int xDate, double xamount, String xAccId){
		this.transactionDate = xDate;
		amount = xamount;
		otherAccountId = xAccId;
	}
}