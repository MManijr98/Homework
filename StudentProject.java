/**
 * 
 */
import java.util.Scanner;
/**
 * @author Mike Manigault Jr
 *
 */

public class StudentProject {
static Scanner keyboard = new Scanner(System.in);

static String studentName = getStudentName();
public static int amountOfGrades = getAmountOfGrades();
public static double[] scores = getTheirScores(amountOfGrades);
public static Scanner average = getTheirAverage();
void provideResults (studentName, average);

public static String getStudentName(){
	System.out.print("Enter student name.");
	studentName = keyboard.nextLine();
	return getStudentName();
}

public static int getAmountOfGrades(){
	System.out.print("Enter number of grades.");
	amountOfGrades = keyboard.nextInt();
	return amountOfGrades;
}
public static double[] getTheirScores(int amountOfGrades) {
	for (double value: scores) {
		System.out.print("Enter a grade");
		scores = keyboard.nextDouble;
		return getTheirScores(0);
	}
	public static Scanner  getTheirAverage(
		average = getTheirAverage(scores)/2;
		System.out.print(average);
		return average;
	}
public static void provideResults(String studentName, double average) {
System.out.println("Name=" + studentName);
System.out.println("Grade Average=" + average );
}
