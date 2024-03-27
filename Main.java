import java.util.Scanner;

public class Main 
{
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
        
        // Sorting the array
        Sort.bubbleSort(array);
        
        // Displaying the sorted array
        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
        // Performing Linear Search
        System.out.print("Enter the number to search: ");
        int searchKey = scanner.nextInt();
        int index = Search.linearSearch(array, searchKey);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }
        
        scanner.close();
    }
    
}
