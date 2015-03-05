package PS3;

public class Test {

	public static void main(String[] args) {
			Account testAccount = new Account(1122, 20000);
			testAccount.setAnnualInterestRate(4.5);
			testAccount.withdraw(2500);
			testAccount.deposit(3000);
			
			System.out.println("The balance is: " + testAccount.getBalance() + 
					"\nThe monthly interest is: " + Account.getMonthlyInterestRate() + 
					"\nThe account was created on " + testAccount.getDateCreated().toString());
			
			testAccount.withdraw(1000000); 
	}

}
