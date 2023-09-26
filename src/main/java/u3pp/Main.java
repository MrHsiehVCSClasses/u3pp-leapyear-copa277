package u3pp;

import java.util.Scanner;

/**
 * YOUR COMMENTS HERE
 * my code is gna go over the things once i sees stop first as the condition it will then stop and the cscanner will close then if its not stop then it wil use my past method to see ifits a year leat buand if it is year i will create an if statement to styep out the cocrrec thing according ly<3
 * @author YOUR NAME HERE my nameis Cononr pak
 */

class Main {

	public static void main(String[] args) {
		
		//YOUR CODE HERE
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a year (or enter STOP to end): ");
		String input = sc.nextLine();
		if(input=="STOP") {
			sc.close();
		}
		


		while (!input.toUpperCase().equals("STOP")) {
			int penis=Integer.parseInt(input);
			
			if(LeapYear.isLeapYear(penis)==true) {
				System.out.println(penis + " is a leap year");
			}
			else {
				System.out.println(penis + " is not a leap year");
			}

			System.out.println("Enter a year (or enter STOP to end): ");
			input=sc.nextLine();
		}
		sc.close();
		//YOUR CODE HERE
	}
}