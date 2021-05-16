package oopsConcepts;

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			int age = 15;
			
			if(age<18) {
				
				throw new ArithmeticException("Not Eligible");
			}else {
				
				System.out.println("Eligible for Voting");
			}
		}catch(ArithmeticException e) {
			
			System.out.println("Exception Handled");
		}
		
		
	}

}
