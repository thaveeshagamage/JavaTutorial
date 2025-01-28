package tutorialExcercises;

public class JavaLogicalOperators {

	public static void main(String[] args) {
		
		int ex1 = 4;
		int ex2 = 5;
		int ex3 = 6;
		boolean result ;
		System.out.println("Logical Operators\n int ex1 = 4\n int ex2 = 5\n int ex3 = 6");
		
		//& Operator
		result = ex1<ex2 & ex3>ex2;
		System.out.println("& Logical Operator : ex1<ex2 & ex3>ex2 is "+ result);
		
		//| Operator
		result = ex1<ex2 | ex3<ex2;
		System.out.println("| Logical Operator : ex1<ex2 | ex3<ex2 is "+ result);
		
		//| Operator
		result = ex1==ex2 | ex3<ex2;
		System.out.println("| Logical Operator : ex1==ex2 | ex3<ex2 is "+ result);
		
		
	}
}
