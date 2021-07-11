package java8;

import java.util.ArrayList;
import java.util.List;

public class Java8Tester {

	public static void main(String[] args) {
		Java8Tester tester = new Java8Tester();
//		tester.execute();
//		tester.execute2();
		tester.execute3();
		 
		
	}
	
	private void execute3() {
		Runnable r1 = () -> System.out.println("qwerty"); 
		pr(r1);
		
	}

	public void pr(Runnable r1){
		r1.run();
	}

	private void execute2() {
		List<String> names = new ArrayList<String>();
		
	      names.add("Mahesh");
	      names.add("Suresh");
	      names.add("Ramesh");
	      names.add("Naresh");
	      names.add("Kalpesh");
			
	      names.forEach(System.out::println);
		
	}

	private void execute() {
		// with type declaration
		MathOperation addition = (int a, int b) -> a + b;

		// with out type declaration
		MathOperation subtraction = (a, b) -> a - b;

		// with return statement along with curly braces
		MathOperation multiplication = (int a, int b) -> {
			return a * b;
		};

		// without return statement and without curly braces
		MathOperation division = (int a, int b) -> a / b;

		System.out.println("10 + 5 = " + this.operate(10, 5, addition));
		System.out.println("10 - 5 = " + this.operate(10, 5, subtraction));
		System.out.println("10 x 5 = " + this.operate(10, 5, multiplication));
		System.out.println("10 / 5 = " + this.operate(10, 5, division));

		
		
	}

	interface MathOperation {
		int operation(int a, int b);
	}

	interface GreetingService {
		void sayMessage(String message);
	}

	private int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}

}
