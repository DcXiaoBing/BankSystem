import java.util.ArrayList;

public abstract class CheckingAccount extends DepositAccount{
	CheckingAccount(int xid){
		super(xid);
		this.checkingAcc = true;
	}
	CheckingAccount(){
		super();
	}
}