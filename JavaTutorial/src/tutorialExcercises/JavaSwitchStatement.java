package tutorialExcercises;

import java.util.Scanner;

public class JavaSwitchStatement {
	public static void main(String [] args) {
		
		int ex1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number from 1 to 7");
		ex1 = sc.nextInt();
		
		switch (ex1) {
			case 1 ,10 -> System.out.println("Monday");
					
					
			case 2 -> System.out.println("Tuesday");
				
				
			case 3 -> System.out.println("Wednesday");
				
					
			case 4 -> System.out.println("Thursday");
				
				
			case 5 -> System.out.println("Friday");
				
				
			case 6 -> System.out.println("Saturday");
				
				
			case 7 -> System.out.println("Sunday");
				
			default-> System.out.println("Incorrect number entered");
				
		}
		sc.close();
	}
	
	
}

