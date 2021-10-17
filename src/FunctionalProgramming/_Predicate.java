package FunctionalProgramming;

import java.util.function.Predicate;

public class _Predicate{
		
	
	public static void main(String[] args) {
		System.out.println(isBiggerThan5.test(6));
	}
	
	
	public static Predicate<Integer> isBiggerThan5 = number -> {
		return (number > 5) ? true : false;
	};
		
	
	
}




