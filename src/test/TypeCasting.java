package test;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// ------------- Implicit Type Casting -----------
		
		char a = 'a';
		
		System.out.println(a);
		
		int b = 'b';
		System.out.println(b);
		
		// -------------- Explicit Type Casting ------------
		
		double num = 23.3;
		long num2 = (long) 50.3;
		int num1 = (int) num;
		
		System.out.println(num1);
		System.out.println(num2);
	}

}
