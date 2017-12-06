package cs.se;

public class StringMethod {

	public static void main(String[] args) {
		String str = "Tom Hanks";
		int length = str.length();
		System.out.println("String Length: " + length);
		String sub = str.substring(0);
		System.out.println("Substring: " + sub);
		String str1 = "Tom Criuse";
		System.out.println("String Equals: " + str.equals("Tom Hanks"));
		System.out.println("String Equals: " + str.equals("tom Hanks"));
		System.out.println("String Equals: " + str.equals(str1));
		System.out.println("String Compare To: " + str.compareTo(str1));
		System.out.println("String Compare To: " + str1.compareTo(str));
		System.out.println("String Compare To: " + str1.compareTo(str1));
	}

}
