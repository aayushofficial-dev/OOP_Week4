package workshop;

final class FinalClass {
	void show() {
		System.out.println("This is a final class.");
	}
}

class child extends FinalClass{
	@Override
	void show(){
		System.out.println("This is a child class");
	}
}
