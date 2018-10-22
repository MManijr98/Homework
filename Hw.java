/**
 * 
 */
import java.io.*;
class smallest {
/**
 * @author Mike Manigault Jr
 *
 */
public class Hw {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5, b = 3, c = 10, d = 1;
		System.out.println("Program to show smallest number");

		/* Conditional statement */
		if(a < b) {
			if(a < c) {
				if(a < d)
					System.out.println("Smallest Number is: "+a);
				else
					System.out.println("Smallest Number is: "+d);
			}
			else {
				if(c < d)
					System.out.println("Smallest Number is: "+c);
				else
					System.out.println("Smallest Number is: "+d);
			}
		}
		else {
			if(b < c) {
				if(b < d)
					System.out.println("Smallest Number is: "+b);
				else
					System.out.println("Smallest Number is: "+d);
			}
			else {
				if(c < d)
					System.out.println("Smallest Number is: "+c);
				else
					System.out.println("Smallest Number is: "+d);
			
		
	
