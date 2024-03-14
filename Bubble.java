public class Bubble {

    public static void PrintArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String args[]) {
        // Insertion sort---------------
        
        int arr[] = { 2, 5, 4, 0, 1 };
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;

            }
            arr[j+1] = current ;
        }
        PrintArray(arr);
    }
}
