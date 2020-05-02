import java.util.*;

public class Transaction{
	String transactionId;
	Date transactionDate;
	double amount;
	String otherAccountId;
	Transaction(String xtransId, Date xDate, double xamount, String xAccId){
		this.transactionId = xtransId;
		this.transactionDate = xDate;
		amount = xamount;
		otherAccountId = xAccId;
	}
}