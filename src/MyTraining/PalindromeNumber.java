package MyTraining;

public class PalindromeNumber {

	public static void main(String[] args) {
		int n = 626, rev = 0, m = n;
		for (; n != 0; n /= 10) {
			int rem = n % 10;
			rev = rem + (rev * 10);	
		}
		if (m == rev) {
			System.out.println(m + ": is Palindrome Number");
		} else {
			System.out.println(m + ": is Not Palindrome Number");
		}
	}
}