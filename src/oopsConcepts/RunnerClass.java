package oopsConcepts;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassA Emp1 = new ClassA(1000, "Sridhar", "ABC");
		
		/*Emp1.Name = "Sridhar";
		Emp1.OrgName = "ABC";
		Emp1.Salary = 10000;*/
		
		Emp1.Display();
		
		ClassB obj1 = new ClassB();
		
		obj1.Name = "Sri";
		obj1.OrgName = "PWD";
		obj1.Salary = 10000;
		
		obj1.Display();
		obj1.show();
		
		ClassC obj2 = new ClassC();
		
		obj2.Name = "Oracle";
		obj2.OrgName = "PWD";
		obj2.Salary = 1000;
		
		obj2.run();
		obj2.Display();
	}

}
