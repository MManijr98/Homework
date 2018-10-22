/**
 * 
 */

/**
 * @author Mike Manigault Jr
 *
 */
public class SumAndAverage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int sum = 0;
        int number;
        int lowerbound = 1;
        int upperbound = 10;
        
        for (number = lowerbound; number <= upperbound; number++){
        	sum += number;
        	
        	System.out.println (sum);
        }
	}

}
