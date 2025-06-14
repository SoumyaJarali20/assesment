package assesment;

import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int original = number;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;         // Get last digit
            reversed = reversed * 10 + digit; // Build reversed number
            number = number / 10;             // Remove last digit
        }

        if (original == reversed) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }

        scanner.close();
    }
}
