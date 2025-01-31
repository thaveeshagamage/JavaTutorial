package tutorialExcercises;

import java.util.Scanner;

class ManualCalculator{
	
	
	public int add (int x, int y) {
		
		int result;
		result = x + y;
		
		System.out.println("total is " +result );
		return result;

		
		
		
		
		
	}
}

public class JavaClassAndObject {

	public static void main(String [] args) {
		int Num1;
		int Num2;
		int resultmain;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two values");
		Num1 = sc.nextInt();
		Num2 = sc.nextInt();
		
		ManualCalculator calc = new ManualCalculator();
		resultmain= calc.add(Num1,Num2);
		sc.close();
		System.out.println("Value returned from method is " + resultmain);
		


		
	
}
}