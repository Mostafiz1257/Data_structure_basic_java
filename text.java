import java.util.Scanner;

public class text {

    // Function for bit stuffing
    static void bitStuffing(int N, int[] arr, int[] brr) {
        int i = 0, j = 0, k; // Variables to traverse arrays
        int count = 1; // Stores the count of consecutive ones

        // Loop to traverse in the range [0, N)
        while (i < N) {
            // If the current bit is a set bit
            if (arr[i] == 1) {
                brr[j] = arr[i]; // Insert into array brr[]
                // Loop to check for next 5 bits
                for (k = i + 1; k < N && arr[k] == 1 && count < 5; k++) {
                    j++;
                    brr[j] = arr[k];
                    count++;
                    // If 5 consecutive set bits are found insert a 0 bit
                    if (count == 5) {
                        j++;
                        brr[j] = 0;
                    }
                    i = k;
                }
            } else {
                brr[j] = arr[i]; // Otherwise insert arr[i] into the array brr[]
            }
            i++;
            j++;
        }

        // Print Answer
        for (i = 0; i < j; i++)
            System.out.print(brr[i]);
    }

    // Function for bit de-stuffing
    static void bitDestuffing(int N, int[] arr) {
        int[] brr = new int[30]; // Stores the de-stuffed array
        int i = 0, j = 0, k; // Variables to traverse the arrays
        int count = 1; // Stores the count of consecutive ones

        // Loop to traverse in the range [0, N)
        while (i < N) {
            // If the current bit is a set bit
            if (arr[i] == 1) {
                brr[j] = arr[i]; // Insert into array brr[]
                // Loop to check for the next 5 bits
                for (k = i + 1; k < N && arr[k] == 1 && count < 5; k++) {
                    j++;
                    brr[j] = arr[k];
                    count++;
                    // If 5 consecutive set bits are found skip the next bit in arr[]
                    if (count == 5) {
                        k++;
                    }
                    i = k;
                }
            } else {
                brr[j] = arr[i]; // Otherwise insert arr[i] into the array brr
            }
            i++;
            j++;
        }

        // Print Answer
        for (i = 0; i < j; i++)
            System.out.print(brr[i]);
    }

    // Driver Code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int N = scanner.nextInt();

        int[] arr = new int[N];
        System.out.print("Enter the elements of the array (0s and 1s only): ");
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        // Clearing the screen or printing newlines to hide input
        for (int i = 0; i < 20; i++) {
            System.out.println();
        }

        int[] stuffedArr = new int[30];

        System.out.print("Original Array: ");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i]);
        }

        System.out.print("\n\nStuffed Array: ");
        bitStuffing(N, arr, stuffedArr);

        System.out.print("\n\nDestuffed Array: ");
        bitDestuffing(N, stuffedArr);

        scanner.close();
    }
}
