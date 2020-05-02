import java.util.ArrayList;

public abstract class CheckingAccount extends DepositAccount{
	CheckingAccount(String xid){
		super(xid);
		this.checkingAcc = true;
	}
}