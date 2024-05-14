package day7;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = new String("hello");
		String str1 = new String("Hello");
		String s = "hello";
		
		System.out.println(str==str1);
		System.out.println(str.equalsIgnoreCase(str1));
		
		System.out.println(str.intern() == s);
		
		System.out.println(str==s);
		
		String s2 = s.replace('e','a');
		System.out.println(s2);
		System.out.println(s2 += " employee");

	}

}
