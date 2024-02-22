import java.util.Scanner;

public class UserData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        String result = printCredentials(username, password);
        System.out.println("Credentials: " + result);
    }
    
    public static String printCredentials(String username, String password) {
        return "Username: " + username + ", Password: " + password;
    }
}
