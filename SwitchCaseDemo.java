import javax.swing.JOptionPane;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Please enter your salary: ");
		
		int pay = Integer.parseInt(input);
		
		switch(pay) {
			case 20000: {
				System.out.println("You will get 5000 bonus.");
				JOptionPane.showMessageDialog(null, "You will get 5000 bonus.");
				break;
			}			
			case 10000: {
				System.out.println("You will get 4000 bonus.");
				JOptionPane.showMessageDialog(null, "You will get 4000 bonus.");
				break;
			}
			default : {
				System.out.println("You will get 500 bonus.");
				JOptionPane.showMessageDialog(null, "You will get 500 bonus.");
				break;
			}
		}
	}
}
