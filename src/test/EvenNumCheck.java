package test;

import java.util.Scanner;

public class EvenNumCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Value" );
		int num = sc.nextInt();
		
		if(num%2==0) {
			
			System.out.println("Even number");
			
		}
		else
		{
			System.out.println("Not Even number");
		}
		
	}
	

}
