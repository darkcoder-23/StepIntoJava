package StringDemo;

public class Example2 {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = s1.concat(" World");
		System.out.println(s2);
		String s3 = "Hello World";
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));
	}

}
