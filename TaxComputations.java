/**
 * 
 */

/**
 * @author Mike Manigault Jr
 *
 */

public class TaxComputations {
private static double basicRate = 4;
private static double luxuryRate = 10;

public static double computeCostBasic (double price) {
	double taxPrice = price * basicRate/100;
	return roundToNearestPenny(price + taxPrice);
}

public static double computeCostLuxury (double price) {
	double taxPrice = price * basicRate/100;
	return roundToNearestPenny(price + taxPrice);
}

public static void changeBasicRateTo (double newRate) {
	basicRate = newRate;
}

public static void changeLuxuryRateTo (double newRate) {
	basicRate = newRate;
}

private static double roundToNearestPenny (double price) {
 price = Math.round(price*100.0)/100.0;
	return price;
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Basic rate of tax:" + TaxComputations.basicRate);
System.out.println("Luxury rate of tax:" + TaxComputations.luxuryRate);
System.out.println("The cost of basic by adding Price Value is:" + TaxComputations.computeCostBasic(20.365));
System.out.println("The cost of luxury by adding Price Value is:" + TaxComputations.computeCostLuxury(120.68972));
System.out.println("Changed basic rate is:" + TaxComputations.basicRate);
System.out.println("Changed luxury rate is: "+ TaxComputations.luxuryRate);
	}

}
