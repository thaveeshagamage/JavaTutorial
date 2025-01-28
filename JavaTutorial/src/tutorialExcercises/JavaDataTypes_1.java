package tutorialExcercises;

import java.util.Scanner;

public class JavaDataTypes_1 {
	public static void main(String[] args) {
		int time;
		long lightSpeedPerSecond = 186282;
		long distance;
		
		System.out.println("Enter the time of flight");
		Scanner sc = new Scanner(System.in);
		time = sc.nextInt();
		distance = time*60*lightSpeedPerSecond;
		System.out.println("Total Distance is " + distance + " Miles");
		sc.close();
		
	}

}
