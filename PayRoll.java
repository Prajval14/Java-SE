import javax.swing.JOptionPane;

public class PayRoll {

	public static void main(String[] args) { 
		
		for (int i = 0; i < 3; i++) {
			
			int payRate = 20;
			
			String input = JOptionPane.showInputDialog("Please enter your name: ");
			
			String worker_name = input;
			
			input = JOptionPane.showInputDialog("For how many hours do you work?");
			
			int work_hours = Integer.parseInt(input);
			
			input = JOptionPane.showInputDialog("For how many hours do you work extra?");
			
			int extra_hours = Integer.parseInt(input);
			
			double total_pay = work_hours * payRate + extra_hours * (payRate * 2);
			
			double gst = total_pay * 0.13;
			
			double final_pay = total_pay - gst;
			
			JOptionPane.showMessageDialog(null, "Final Pay: " + final_pay);
		}
			
		System.exit(0);		
	}
}
