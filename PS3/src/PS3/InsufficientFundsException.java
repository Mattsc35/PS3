package PS3;

public class InsufficientFundsException extends Exception {
	public InsufficientFundsException(){}
	
	public InsufficientFundsException(double amount) {
		super("You do not have enough money to withdraw or the amount was negative (" + amount + ")");
	}
}