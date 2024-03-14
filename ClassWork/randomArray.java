import java.util.Random;
import java.util.Scanner;

public class randomArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] array = generateArray(size);
        
        System.out.println("Array items:");
        displayArray(array);
        
        scanner.close();
    }
    
    public static int[] generateArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }
    
    public static void displayArray(int[] array) {
        for (int item : array) {
            System.out.println(item);
        }
    }
}
