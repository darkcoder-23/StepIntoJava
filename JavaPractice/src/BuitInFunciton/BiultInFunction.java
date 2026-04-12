package BuitInFunciton;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class BiultInFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Predicate Functional Interface.
		Predicate<Integer> isEven = x->x%2==0;
		System.out.println(isEven.test(10));
		
		Predicate<Integer> isGreaterThan10 = x -> x>10;
		System.out.println(isGreaterThan10.test(11));
		
		System.out.println(isGreaterThan10.negate().test(11));
		
		//Predicate Chaining
		Predicate<Integer> isEvenGreaterThan10 = isEven.or(isGreaterThan10);
		System.out.println(isEvenGreaterThan10.test(15));
		
		
		//Function in Java
		Function<String, Integer> length = str->str.length();
		System.out.println(length.apply("ShayanRaza"));
		
		Function<String, Integer> check = str->str.length();
		System.out.println(check.apply("Java Programming"));
		
		// Consumer 
		Consumer<String> printString = str-> System.out.println(str);
		printString.accept("Hello Shayan Print by Consumer");
		Consumer<String> printStringMulti = str-> {
			System.out.println(str);
			System.out.println(str.length());
		};
		printStringMulti.accept("Printing Consumer Via Consumer Muliple Line");
		// Supplier functional Interface
		Supplier<String> printStr = ()->"I am Printing by Supplier Interface";
		System.out.println(printStr.get());
		
		// Unary Operator
		UnaryOperator<String> unaryPerform = str->str +" "+str; 
		System.out.println(unaryPerform.apply("UnaryOperator"));
		
		
		BinaryOperator<String> binaryPerform = (str1,str2)->str1+str2; 
		System.out.println(binaryPerform.apply("Bianry", "Operator"));
		
		BinaryOperator<Integer> binIntergerPerform = (num1,num2) -> num1+num2;
		System.out.println(binIntergerPerform.apply(10, 10));
		
		// BiFunction 
		BiFunction<String, String, Integer> biFunc = (str1,str2) -> (str1+str2).length();
		System.out.println(biFunc.apply("Hello", "BiFucniton"));
		
		
	}

}
