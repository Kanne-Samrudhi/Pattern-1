package comm;
import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input from user
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        for (int i = 0; i < rows; i++) {
            // Printing spaces
            for (int j = 0; j < i * 3; j++) {
                System.out.print(" ");
            }
            // Printing numbers
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
