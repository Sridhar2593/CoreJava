package oopsConcepts;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =10;
		int b = 0;
		
		try {
			
			int result = a/b;
			//System.out.println(result);
			
		}catch(ArithmeticException e) {
			
			System.out.println("Arithmetic Exception Handled");
			
		}catch(Exception e) {
		
			
			System.out.println("Exception Handled");
		}finally {
			
			System.out.println("Try Catch Executed Succssfully");
		}
		
		int arr [] = {2,3,4,5,6};
		
		try {
			
			System.out.println("Value of array :" + arr[6]);
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("AOB Exception Handled");
		}
		
		
	}

}
