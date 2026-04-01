package workshop;

class Shape {
	double getperimeter() {
		return 0;
	}
	double getArea() {
		return 0;
	}
}

class Circle extends Shape{
	double radius;
	
	Circle (double radius){
		this.radius = radius;
	}
	
	@Override
	double getperimeter() {
		return 2 * Math.PI * radius;
	}
	
	@Override 
	double getArea() {
		return Math.PI * radius * radius;
	}
}



