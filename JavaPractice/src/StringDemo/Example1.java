package StringDemo;

public class Example1 {
	public static void main(String[] args) {
		String name = "Shayan";
		String name1 = "Shayan"; 
		String name2 = "Shayan";
		
		System.out.println(name==name1);
		System.out.println(name1==name2);
		System.out.println(name==name2);
		
		name = "Shivam";
		String name3 = new String("Shivam");
		
		System.out.println(name==name1);
		System.out.println(name==name2);
		System.out.println(name1==name2);
		System.out.println(name==name3);
		
		String s1 = "Hello";
		String s2 = s1 + " World";
		String s3 = "Hello World";
		String s4 = new String("Hello World");
		System.out.println(s2);
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));
		System.out.println(s2==s4);
		System.out.println(s3==s4);
		
	}

}
