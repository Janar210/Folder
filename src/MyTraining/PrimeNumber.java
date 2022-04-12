package MyTraining;

public class PrimeNumber {

	public static void main(String[] args) {
		int n;
		for (n = 1; n <= 100; n++)  {
			int count = 0;
			for (int i = 1; i <= n; i++)
				if (n % i == 0)
					count++;
			if (count == 2) {
				System.out.println(n + ": is Prime");
			} else {
				System.out.println(n + ": is Non Prime");
			}
		}
	}
}