package u3pp;

import java.util.Scanner;

/**
 * YOUR COMMENTS HERE
 * 
 * @author YOUR NAME HERE
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