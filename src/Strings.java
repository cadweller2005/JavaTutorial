
public class Strings {

	public static void main(String[] args) {
		String str = "This is the test string. ";
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "Welcome";
		String str4 = "";
		String str5 = "            Spaces all around     ";
		String str6 = "Hello";

		System.out.println(str.length());
		System.out.println(str.charAt(1));
		System.out.println(str.concat(str3));
		System.out.println(str.contains(str6));
		System.out.println(str.contains("is"));
		System.out.println(str.startsWith("Th"));
		System.out.println(str3.startsWith("W"));
		System.out.println(str.endsWith("ng. "));
		System.out.println(str.equals(str2));
		System.out.println(str.indexOf("T"));
		System.out.println(str.isEmpty());
		System.out.println(str4.isEmpty());
		System.out.println(str5.trim());
		
		
		System.out.println(str.replace('t','T'));
		System.out.println(str.substring(1));
		System.out.println(str.substring(1, 3));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		
		
		
		
		
		
		
	}

}
