/**
 * 
 */

/**
 * @author Mike Manigault Jr
 *
 */
import java.util.Scanner;
public class CountPoor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k;
		int poorCount = 0;
		double familyIncome;
		int familySize;
		double averageHousingCost;
		double averageFoodCost;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of families");
		k = input.nextInt();
		
		Family[] families = new Family[k];
		Family[] poorFamilies = new Family[k];
		
		for (int family = 0; family < k; family++) {
			System.out.print("Enter income of the family" + (family + 1) +":$");
			familyIncome = input.nextDouble();
			
			System.out.print("Enter the amount of familiy members" + (family + 1) +":");
			familySize = input.nextInt();
			
			System.out.print("Enter the average housing cost of the family" + (family + 1) +":$");
			averageHousingCost = input.nextDouble();
			
			System.out.print("Enter the average food cost of the family" + (family + 1) +":$");
			averageFoodCost = input.nextDouble();
			
			if (families[family].isPoor (averageHousingCost * familySize, averageFoodCost)) {
				poorFamilies[family] = families[family];
				poorCount++;
			}
		}
		
		System.out.println("Number of total families =" + k);
		System.out.println("Number of poor families=" + poorCount );
		System.out.println("The poor families are");
		for (int family = 0; family < k; family++) {
		System.out.println("Family" + (family + 1) + "=" + poorFamilies[family].toString());
		}
	}

}

class Family {
	private double income;
	private int size;
	
	public Family(double newIncome, int newSize) {
		income = newIncome;
		size = newSize;
	}
		public boolean isPoor (double housingCost, double foodCost) {
			return((housingCost + foodCost * size) > (income / 2));
		}
		public String toString() {
			return "Income is $" + income + ",Members are" + size;
	}
}
