package MyTraining;

public class PalindromeString {

	public static void main(String[] args) {
		/*
		 * String s="madam"; String [] Name = {"Ramu", "Raju"}; StringBuffer sb=new
		 * StringBuffer(s).reverse(); for (String name:Name) { //sb.append(name); }
		 * //System.out.println(sb.hashCode()); System.out.println(sb);
		 */
		String a="madam is Different";
		String b="";
		for (int i= a.length()-1;i>=0;i--) {
			b+=a.charAt(i);
		}
			System.out.println(b);
		if (b.equals(a)) {
			System.out.println(b+" : is palindrome");
		}else {
			System.out.println(b+" : is Not Palindrome");
		}
	}
}