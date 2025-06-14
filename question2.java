package assesment;

public class question2 {
    public static void main(String[] args) {
        int levels = 5;

        for (int i = 0; i < levels; i++) {
            // Print spaces
            for (int s = 0; s < levels - i - 1; s++) {
                System.out.print("  ");
            }
            // Print stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
