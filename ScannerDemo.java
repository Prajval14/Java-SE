import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter employee name: ");
		String empName = sc.nextLine();
		System.out.println(empName);
		
		System.out.print("Please enter employee age: ");
		int empAge = sc.nextInt();
		System.out.println(empAge);
		
		sc.nextLine();
		
		System.out.print("Please enter city: ");
		String empCity = sc.nextLine();
		System.out.println(empCity);
		
		System.out.print("Please enter employee salary: ");
		int empSalary = sc.nextInt();
		System.out.println(empSalary);
		
		sc.nextLine();
		
		double taxedSalary = empSalary - empSalary * (0.13);
		
		System.out.print("Salary after tax is: " + taxedSalary);
	}
}
