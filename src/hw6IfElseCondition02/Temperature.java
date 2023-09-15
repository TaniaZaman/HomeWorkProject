package hw6IfElseCondition02;

import java.util.Scanner;

/*Use Scanner class to define an int type variable todaysTemperature. Now write some 

conditions. a) If the temperature is less than 32, the outcome will be "Freezing" 
b) If the temperature is less than 55, the outcome will be "Pleasant" c) If the
temperature is less than 73, the outcome will be "Getting Warmer" d) If the temperature 
is greater than 101, the outcome will be "Very Hot" And finally e) the outcome will be 
"Please put a valid temperature". Please don't forget to close the scanner. In the above 
5 conditions, use the appropriate keyword like if, else if, else to execute today's
Temperature. Run the code, type today's temperature in the console, and find the
Temperature of Today. Please organize the code (very importatodaysTemperaturent). don't give any white space. push the code to GitHub and add the link below.

*/
public class Temperature {
	public static void main(String[] args) {
		System.out.println("-----Todays Temperature-----");
		System.out.println("please type today's temperature:");

		Scanner scanner = new Scanner(System.in);
		int todaysTemperature = scanner.nextInt();

		if (todaysTemperature < 32) {
			System.out.println("Freezing");

		} else if (todaysTemperature < 55) {
			System.out.println("Pleasant");

		} else if (todaysTemperature < 73) {
			System.out.println("Getting Warmer");
			
		} else if (todaysTemperature > 101) {
			System.out.println("Very Hot");

		} else {
			System.out.println("Please put a valid temperature");
		}
		scanner.close();

	}

}
