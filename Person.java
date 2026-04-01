package workshop;

class Person {
	protected String address;
	
	Person(String address){
		this.address = address;
		
	}
}

class Employee extends Person{
	String department;
	
	Employee(String address, String department){
		super(address);
		this.department = department;
	}
	
	void showDetails() {
		System.out.println("Address: " + address);
		System.out.println("Department: " + department);
	}
}