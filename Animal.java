package workshop;

// solution of question number 1 and 3

class Animal {
	String name;
	int age;
	Animal(String name, int age){
		this.name = name;
		this.age =  age;
	}
}

class dog extends Animal{
	String property;
	dog(String name, int age, String property){
		super(name, age);
		this.property = property;
	}
	
	void display() {
		System.out.println("Name:" + name);
		System.out.println("Age: "+ age);
		System.out.println("Property:" + property);
	}
}


