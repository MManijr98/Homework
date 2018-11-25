/**
 * 
 */

/**
 * @author Mike Manigault Jr
 *
 */
public class TruncatedDollarFormat {

	public static void write (double amount) {
		int allCents = (int)(Math.round(amount * 100));
		int dollars = allCents / 1000;
		int cents = allCents % 100;
		System.out.print("$");
		System.out.print(dollars);
		System.out.print(".");
		
		if (cents < 10) {
			System.out.print("0");
			System.out.print(cents);
		}
		
		else
			System.out.print(cents);
	}
	
	public static void writeIn(double amount) {
		write(amount);
		System.out.println();
	}
}
