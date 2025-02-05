package methodOverloading;

import java.util.Scanner;

public class ExcerciseOverload {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number of numbers you want to add");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		float[] num = new float[count+1];
		JavaOverload AddNumbers = new JavaOverload();
		for(int i =1; i<=count; i++) {
			
			System.out.println("Enter Number" + i);
			num[i] = sc.nextFloat();
					
		}
		if(count == 3) {
			
			float total = AddNumbers.add(num[1], num[2], num[3]);
			System.out.println("Total is " + total);
		}
		else if(count == 2) {
			float total = AddNumbers.add(num[1], num[2]);
			System.out.println("Total is " + total);
		}
	}

}
