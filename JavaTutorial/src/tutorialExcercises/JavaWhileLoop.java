package tutorialExcercises;

import java.util.Scanner;

public class JavaWhileLoop { 
	public static void main(String[] args) {
		
		int i =1;
		
		int outer;
		int inner;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter OUTER Loop number");
		outer = sc.nextInt();
		System.out.println("Enter INNER Loop Number");
		inner = sc.nextInt();
		
		while (i<=outer) {
			
			System.out.println("OUTER LOOP" + i);
			int j =1;
			while(j<=inner) {
				
				System.out.println("\t INNER LOOP" + j);
				j++;	
			}
			
			i++;
		}
		
		sc.close();
	} 

}
