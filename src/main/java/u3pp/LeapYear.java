package u3pp;

/**
 * YOUR COMMENTs HERE
 * this one is very simple, noly stuid people could jot get ths lol
 * this one i gj=sut create fhte first is fstatemtn and see if its divisble by and 100 and dividslbe by 40 if not hten it is false and if it is greather than 1582 divisible by 4 would make it a leap year and then it would return as turen adn any other instance owuld return as false  
 * @author //YOUR NAME HERE
 *
 */

public class LeapYear {
	/**
	 * YOUR COMMENTS HERE
	 * different if statments the first makes it the over arching coditional only issue to make it false, then the general requirements, and then final thing wouls dmake qevyeth false LOL
	 */
	public static boolean isLeapYear(int year) {
		if( (year%100==0) && (year%400!=0)){
			return false;
		}
		if ((year>=1582) && (year%4==0)){
			return true;
		}
		return false;
		/* YOUR CODE HERE */
	}
}