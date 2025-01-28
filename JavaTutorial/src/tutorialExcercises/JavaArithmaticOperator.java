package tutorialExcercises;

public class JavaArithmaticOperator {
	public static void main(String[] args) {
		
		int ex1 = 10;
		int ex2 = 11;
		int Result;
		
		System.out.println("JAVA Arithmatic Oporators");
		// % Operator
		Result = ex1%ex2;
		System.out.println("% Operator " + Result );
		
		// += Operator
				ex1 += 2;
				System.out.println("+= Operator " + ex1  );
				ex1 = 10;
				
				// -= Operator
				ex1 -= 1;
				System.out.println("-= Operator " + ex1 );
				ex1 = 10;
				
				// *= Operator
				ex1 *= 2;
				System.out.println("*= Operator " + ex1 );
				ex1 = 10;
				
				// /= Operator
				ex1 /= 2;
				System.out.println("/= Operator " + ex1 );
				ex1 = 10;
				
				// ++X Operator - Increment first and then print the amount
				
				System.out.println("++X Operator " + ++ex1 );
				ex1 = 10;
				
				// X++ Operator - Increment first and then print the amount
				
				System.out.println("++X Operator " + ex1++ );
				ex1 = 10;
				
				
				
	}

}
