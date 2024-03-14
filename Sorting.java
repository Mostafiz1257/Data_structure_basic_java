import java.util.Scanner;

public class Sorting {

    public static void PrintArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("The sort array is" +  array[i] + " ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the int array size and values:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        // int arr[] = { 3, 4, 5, 6, 6, 7 };
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }

        PrintArray(arr);

    }
}