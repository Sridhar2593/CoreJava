package oopsConcepts;

public class ThrowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThrowsExample obj = new ThrowsExample();
		try {
			
			obj.eligibility(17);
		}catch(ArithmeticException e) {
			
			System.out.println("Exeption Handled");
		}
		
		
	}
	
	public void eligibility(int age){
		
		if(age<18) {
			
			throw new ArithmeticException("Not Eligible");
			
		}else {
			System.out.println("Eligible for Voting");
		}
	}

}
