
public class Ex9_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="apple";
		String str2="Apple";
		String str3="Have a Good Day";
		String str4="   Happy        ";
		
		System.out.println(str3.length());
		System.out.println(str1.toLowerCase());
		System.out.println(str2.toUpperCase());
		System.out.println(str3.substring(5));
		System.out.println(str3.substring(7, 11));
		System.out.println(str3.charAt(0));
		System.out.println(str3.charAt(7));
		System.out.println(str3.indexOf('a'));
		System.out.println(str3.lastIndexOf('a'));
		System.out.println(str4.length());
		System.out.println(str4.trim().length());
		System.out.println(str3.startsWith("Have"));
		System.out.println(str3.endsWith("day"));
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.compareTo("apple"));
		



	}

}
