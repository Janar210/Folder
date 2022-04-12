package MyTraining;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n = 153, num = n;
		double tot = 0;
		for (; n != 0; n /= 10) {
			int rem = n % 10;
			tot += Math.pow(rem, 3);
		}
		if (tot == num) {
			System.out.println(num + ": is Armstrong");
		} else {
			System.out.println(num + ": is Not Armstrong");
		}
	}
}