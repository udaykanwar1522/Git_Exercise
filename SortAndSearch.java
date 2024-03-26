import java.util.Scanner;

public class SortAndSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the number of elements in the array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        // Input the elements
        int[] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Sorting using Bubble Sort
        bubbleSort(array);
        
        // Displaying the sorted array
        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
        // Performing Linear Search
        System.out.print("Enter the number to search: ");
        int searchKey = scanner.nextInt();
        int index = linearSearch(array, searchKey);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }
        
        scanner.close();
    }
    
    // Bubble Sort Algorithm
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    // Linear Search Algorithm
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // return the index if found
            }
        }
        return -1; // return -1 if not found
    }
}
