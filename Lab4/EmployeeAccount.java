package Lab4;

public class EmployeeAccount extends Person{
	private long accNo;
	private double balance;
	private Person Accholdername;
	EmployeeAccount(){}
	EmployeeAccount(long accNo,double balance)
	{
		this.accNo=accNo;
		this.balance=balance;
	}
	EmployeeAccount(String name,int age,long accNo,double balance) 
	{
		super(name,age);
		this.accNo=accNo;
		this.balance=balance;
	}
    void deposit(double amount){
    	balance=balance+amount;
    }
    	
   double getbalance1() {
    	return balance;
    }
	void withdraw(double amount) {
		balance=balance-amount;
	}
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccholdername() {
		return Accholdername;
	}
	public void setAccholdername(Person accholdername) {
		Accholdername = accholdername;
	}
	
}
