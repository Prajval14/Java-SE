import javax.swing.JOptionPane;

public class IfDemo {

	public static void main(String[] args) {
		int num1 = 70;
		int num2 = 40;
		
		System.out.println(num1>num2);		
		
		System.out.println(num1<num2);
		
		System.out.println(num1==num2);
		
		System.out.println(num1!=num2);
		
		if(num1>num2) {
			System.out.println("Number 1 is greater than number 2");
		}
		
		if(num1<num2) {
			System.out.println("Number 2 is greater than number 1");
		}
		
		String input = JOptionPane.showInputDialog("Please enter your marks: ");
		
		int marks = Integer.parseInt(input);
		
		if (marks > 0 && marks < 35) {
			System.out.println("Sorry, you are failed.");
			JOptionPane.showMessageDialog(null, "Sorry, you are failed.");
		}
		else if (marks > 35 && marks < 80) {
			System.out.println("Your grade is B");
			JOptionPane.showMessageDialog(null, "Your grade is B");
		}
		else if (marks > 80 && marks <= 100) {
			System.out.println("Your grade is A");
			JOptionPane.showMessageDialog(null, "Your grade is A");
		}
		else {
			System.out.println("Please enter valid marks");
			JOptionPane.showMessageDialog(null, "Please enter valid marks");
		}		
	}
}
