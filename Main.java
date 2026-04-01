package workshop;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Signup signup = new Signup();
		
		while(true) {
			System.out.println("\nPlease enter 1 for Sign up.");
			System.out.println("Please enter 2 for display the details.");
			System.out.println("Please enter 3 to quit.");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			if (choice == 1) {
				signup.registerUser();
			}
			else if (choice == 2) {
				System.out.println("\nPlease enter 2 for display the details.");
				int id = sc.nextInt();
				signup.displayUser(id);
			}
			else if (choice == 3) {
				System.out.println("Thank you for using the application.");
				break;
			}
			else {
				System.out.println("Invalid input. Try again!!");
			}
		}
		sc.close();
	}
}
