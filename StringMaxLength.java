import java.util.Scanner;

public class MaxLengthString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of strings
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String[] strings = new String[n];
        System.out.println("Enter the strings:");

        // Input strings from the user
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }

        // Find the string with the maximum length
        String maxLengthString = strings[0];
        for (String str : strings) {
            if (str.length() > maxLengthString.length()) {
                maxLengthString = str;
            }
        }
    
       /* for (int i = 1; i < strings.length; i++) { // Start from index 1
            if (strings[i].length() > maxLengthString.length()) {
                maxLengthString = strings[i];
            }
        }*/

        System.out.println("The string with the maximum length is: " + maxLengthString);
        System.out.println("Length of the string: " + maxLengthString.length());
    }
}
