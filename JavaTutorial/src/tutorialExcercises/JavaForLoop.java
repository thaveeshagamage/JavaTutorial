package tutorialExcercises;

import java.util.Scanner;

public class JavaForLoop {
	public static void main(String[]args) {
		
		int OLoopCount;
		int ILoopCount;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter OUTER the Loop Count");
		OLoopCount = sc.nextInt();
		System.out.println("Enter INNER the Loop Count");
		ILoopCount = sc.nextInt();
		
		
		for(int i =1 ; i<=OLoopCount; i++) {
			System.out.println("OUTER LOOP"+ i );
			
			for(int j =1; j<=ILoopCount; j++) {
				
				System.out.println("\t INNER LOOP"+ i );

				
			}

			
		}
		
		
		sc.close();
	}

}
