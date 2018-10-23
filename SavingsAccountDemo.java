/**
 * 
 */

/**
 * @author Mike Manigault Jr
 *
 */
public class SavingsAccountDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount.setInterestRate(0.01);
		
		SavingAccount mySavings = new SavingAccount( );
		
		SavingAccount yourSavings = new SavingAccount( );
		
		System.out.println("I deposited $10.75.");
		mySavings.deposit(10.75);
		
		System.out.println("You deposited $75.");
		yourSavings.deposit(75.00);
		
		System.out.println("You deposited $55.");
		yourSavings.deposit(55.00);
		
		double cash = yourSavings.withdraw(15.75);
		System.out.println("You withdrew $" + cash + ".");
		
		if (yourSavings.getBalance() > 100.00)
		{
		System.out.println("You received interest.");
		yourSavings.addInterest();
		}
		
		System.out.println("Your savings is $" + yourSavings.getBalance());
		System.out.print("My savings is $");
		SavingAccount.showBalance(mySavings);
		System.out.println();
		
		int count = SavingAccount.getNumberOfAccounts();
		System.out.println("We opened " + count +
		" savings accounts today.");
	}

}
