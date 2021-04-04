package Lab4;

public class MainMethd {

	public static void main(String[] args) {
		Person p1=new Person("Kathy",20);
		Person p2=new Person("smithy",18);
		System.out.println(p1.getName());
		System.out.println(p2.getName());
		EmployeeAccount kathy_a1=new EmployeeAccount(2345678,3000);
		EmployeeAccount smithy_a2=new EmployeeAccount(5678907,2000);
		SavingsAccount  kathy_s1=new SavingsAccount(2345678,3000);
		SavingsAccount  smithy_s2=new SavingsAccount(5678907,3000);
		kathy_a1.deposit(2000);
		System.out.println(kathy_a1.getBalance());
		smithy_a2.withdraw(1000);
		System.out.println(smithy_a2.getBalance());
		kathy_s1.deposit(2000);
		System.out.println(kathy_s1.getBalance());
		kathy_s1.withdraw(2000);
		System.out.println(kathy_s1.getBalance());
	}

}
