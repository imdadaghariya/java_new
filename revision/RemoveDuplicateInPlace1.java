package revision;

public class RemoveDuplicateInPlace1 {
    public static void main(String[] args) {
        int arr[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int n = arr.length;
        n = removeDuplicates(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nNew array size is " + n);
    }

    // Function to remove duplicates in place and return new size
    public static int removeDuplicates(int arr[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n - 1];
        return j;
    }
}
