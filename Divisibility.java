import java.util.Scanner;

public class DivisibleBy3And5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the range from the user
        System.out.print("Enter the starting number of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number of the range: ");
        int end = scanner.nextInt();

        boolean found = false; // Flag to check if any number is found

        System.out.println("Numbers divisible by both 3 and 5 in the range " + start + " to " + end + ":");

        // Find and print numbers divisible by 3 and 5
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No numbers found divisible by both 3 and 5 in the given range.");
        }

        scanner.close();
    }
}
