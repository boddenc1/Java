package counter;

import java.util.Scanner;// Import Scanner

public class counterDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); // Initialize Scanner
		
		
		System.out.println("What is the number you would like to add up to?");
		
		int num = sc.nextInt(); // User Input number
		int counter = 0;// Initialize counter
		
		for(int i=0; i<num; i++)
		{
			counter = counter + i; // counter starts at 0, then as 'i' increments till it equals inputted number and adds i during each iteration. 
		}
		
		System.out.println(counter);// Prints counter
	}
}
