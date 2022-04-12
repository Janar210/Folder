package MyTraining;

public class Fibbanoci {

	public static void main(String[] args) {
		int n = 10, a = 0, b = 1, c=0;
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				a = b;
				b = c;
				c = a + b;
				System.out.println(c);
			}else
				System.out.println(i+1);
		}
	}
}