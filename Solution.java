
import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        // System.out.println(number);
        if (number >= 0 && number < 200000000) {

            DecimalFormat decimal = new DecimalFormat("#,###");
            String formattedNumber = decimal.format(number);
            System.out.println(formattedNumber);
        }
    }

}

// import java.text.DecimalFormat;
// import java.util.Scanner;

// public class Solution {
// public static void main(String[] args) {
// // Create a Scanner object to read input from the user
// Scanner scanner = new Scanner(System.in);

// // Prompt the user to enter an integer
// System.out.print("Enter an integer: ");

// // Read the integer input
// int number = scanner.nextInt();

// // Close the scanner
// scanner.close();

// // Format the integer with commas
// DecimalFormat decimalFormat = new DecimalFormat("#,###");
// String formattedNumber = decimalFormat.format(number);

// // Print the formatted number
// System.out.println("Formatted number with commas: " + formattedNumber);
// }
// }