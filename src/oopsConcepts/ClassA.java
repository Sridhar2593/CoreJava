package oopsConcepts;

public class ClassA {

	public int Salary;
	public String Name;
	protected String OrgName;
	
	//Default Constructor
	public ClassA() {
		
		System.out.println("Inside Constructor");
	}
	
	//Parameterized Constructor
	public ClassA(int val1, String val2, String val3) {
		
		System.out.println("Inside Parameterized Constructor");
		
		this.Salary = val1;
		this.Name = val2;
		this.OrgName = val3;
	}
	
	//Method
	public void Display(){
		
		System.out.println("Name of the Emp: " + Name);
		System.out.println("Name of the Org: " + OrgName);
		System.out.println("Salary of the Emp: " + Salary);
		
		
	}
}
