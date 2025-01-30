package tutorialExcercises;

import java.util.Scanner;

public class JavaSwitchStatementNew {
	public static void main(String [] args) {
		
		int ex1;
		Scanner sc = new Scanner(System.in);
		System.out.println("NEW Enter a number from 1 to 7");
		ex1 = sc.nextInt();
		
		switch (ex1) {
			case 1:
					System.out.println("Monday");
					break;
					
			case 2:
				System.out.println("Tuesday");
				break;
				
			case 3:
				System.out.println("Wednesday");
				break;
					
			case 4:
				System.out.println("Thursday");
				break;
				
			case 5:
				System.out.println("Friday");
				break;
				
			case 6:
				System.out.println("Saturday");
				break;
				
			case 7:
				System.out.println("Sunday");
				break;
				
			default:
				System.out.println("Incorrect number entered");
				
		}
		sc.close();
	}
	
	
}

