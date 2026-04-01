package workshop;

public class main_q7 {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		// adding two integers
		System.out.println("Sum of 7 and 8: " + cal.add(7, 8));
		
		// adding three integers
		System.out.println("Sum of 5, 6 and 7: " + cal.add(5, 6, 7));
		
		// adding two doubles
		System.out.println("Sum of 5.5 and 8.75: " + cal.add(5.5, 8.75));
		
		// adding three doubles
		System.out.println("Sum of 10.1, 20.2 and 30.3: " + cal.add(10.1, 20.2, 30.3));
	}
}
