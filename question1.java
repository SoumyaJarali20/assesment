package assesment;

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prices of games
        int[] prices = {1500, 1200, 1000, 800, 500};
        int total = 0;

        while (true) {
            // Display menu
            System.out.println("\nWelcome to the Game Store!");
            System.out.println("1. Call of Warfare   - ₹1500");
            System.out.println("2. Speed Racers      - ₹1200");
            System.out.println("3. Mystery Mansion   - ₹1000");
            System.out.println("4. Pixel Adventure   - ₹800");
            System.out.println("5. Puzzle Mania      - ₹500");
            System.out.println("6. Checkout / Exit");
            System.out.print("Enter your choice (1-6): ");
            
            int choice = scanner.nextInt();

            if (choice >= 1 && choice <= 5) {
                System.out.print("Enter quantity: ");
                int quantity = scanner.nextInt();
                total += prices[choice - 1] * quantity;
                System.out.println("Game(s) added to your cart!");
            } else if (choice == 6) {
                System.out.println("Total cost: ₹" + total);
                System.out.println("Thank you for shopping with us!");
                break;
            } else {
                System.out.println("Invalid choice! Please select from 1 to 6.");
            }
        }

        scanner.close();
    }
}
