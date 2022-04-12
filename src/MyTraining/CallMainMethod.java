package MyTraining;

public class CallMainMethod {
	static String[] s = {""};
	static int i=0;
	public static void main(String[] args) {
		System.out.println("Hello!!!");
		if (i<10) {
			i++;
		main(s);
		}
	}
}