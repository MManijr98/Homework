/**
 * 
 */
import java.util.Scanner;
/**
 * @author Mike Manigault Jr
 *
 */
public class DimensionConverterDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner keyboard = new Scanner (System.in);
       System.out.println("Enter a measurement in inches");
       double inches = keyboard.nextDouble();
       double feet = DimensionConverter.convertInchesToFeet(inches);
       System.out.println(inches + "inches=" + feet + "feet.");
       
       System.out.println("Enter a measurement in feet:");
       feet = keyboard.nextDouble();
       inches = DimensionConverter.convertFeetToInches(feet);
	}

}
