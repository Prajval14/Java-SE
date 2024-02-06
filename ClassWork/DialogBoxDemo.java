import javax.swing.JOptionPane;

public class DialogBoxDemo {

	public static void main(String[] args) {		
		String input = JOptionPane.showInputDialog("Please enter the book name you need: ");
		
		String book_name = input;
		
		input = JOptionPane.showInputDialog("For how many days do you need this book?");
		
		int days = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog("Please enter your full name: ");
		
		String full_name = input;
		
		input = JOptionPane.showInputDialog("Please enter publishing material grade you need: ");
		
		char pub_grade = input.charAt(0);
		
		JOptionPane.showMessageDialog(null, "Book name: " + book_name + "\nNumber of days: " + days + "\nFull Name: " + full_name + "\n Publishing Grade: " + pub_grade);
		
		System.exit(0);
	}

}
