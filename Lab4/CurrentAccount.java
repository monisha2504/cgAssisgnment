package Lab4;

public class CurrentAccount extends EmployeeAccount{
	public int overdraftlimit=0;
	public CurrentAccount() {}
	public CurrentAccount(long accNo,double balance)
	{
		super(accNo,balance);
	}
	CurrentAccount(String name,int age,long accNo,double balance) 
	{
		super(name,age,accNo,balance);
		
	}
	
  @Override
void withdraw(double amount) {
	  super.withdraw(amount);
	
}

}
