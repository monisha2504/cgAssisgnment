package Lab4;

public class SavingsAccount extends EmployeeAccount {
	private final double minimumbalance=2000;
	public SavingsAccount() {}
	SavingsAccount(long accNo,double balance)
	{
		super(accNo,balance);
		
	}
	SavingsAccount(String name,int age,long accNo,double balance) 
	{
		super(name,age,accNo,balance);
		
	}
	
	@Override
	void withdraw(double amount) {
		if(minimumbalance<getBalance())
		{
			super.withdraw(amount);
		}
	}
		
	}
	

		
		
	
	
	

