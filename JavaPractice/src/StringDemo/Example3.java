package StringDemo;

public class Example3 {
	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		StringBuilder s3 = new StringBuilder("Hello");
		StringBuilder s4 = new StringBuilder("Hello");
		
		StringBuffer s5 = new StringBuffer("Hello");
		StringBuffer s6 = new StringBuffer("Hello");
		
		String s7 = "Hello";
		String s8 = "Hello";
		
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		System.out.println(s5==s6);
		System.out.println(s7==s8);
		
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(s5.equals(s6));
		System.out.println(s7.equals(s8));
		
		
		
		
	}

}
