package StringImmutable;

public class StringImmutableExample {
	public static void main(String[] args) {
		String name = "Shayan";
		String anotherName = "Shayan";
		
		String otherName = new String("Shayan");
		
		
		System.out.println("Compare the String is same - " + (name==anotherName) );
		System.out.println("Compare the String is same - " + (name==otherName.intern()) );

	}

}
