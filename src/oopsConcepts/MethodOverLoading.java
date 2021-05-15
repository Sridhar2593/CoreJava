package oopsConcepts;

public class MethodOverLoading {

		public void add(int a, int b) {
			
			int sum = a+b;
			System.out.println("Int Sum :" + sum);
		}
		public void add(double a, double b) {
			
			double sum = a+b;
			System.out.println("Double Sum :" + sum);
		}
		public void add(String a, String b) {
			
			String sum = a+b;
			System.out.println("Double Sum :" + sum);
		}
	}


