package u3pp;

/**
 * YOUR COMMENTs HERE
 * 
 * @author //YOUR NAME HERE
 *
 */

public class LeapYear {
	/**
	 * YOUR COMMENTS HERE
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