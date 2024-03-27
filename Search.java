public class Search {
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
