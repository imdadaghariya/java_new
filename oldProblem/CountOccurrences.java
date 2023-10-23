


import java.util.Arrays;

public class CountOccurrences {
    public static void main(String[] args) {
        int[] a = {2, 5, 6, 6, 7, 8, 9, 9, 9, 10, 11};
        int x = 9;
        int n = a.length;
        int c = count(a, x, n);
        System.out.println(x + " occurs " + c + " times in the array");
    }

    public static int count(int[] a, int x, int n) {
        int low = Arrays.binarySearch(a, x);

        if (low < 0)
            return 0;

        int high = low;
        while (high < n && a[high] == x) {
            high++;
        }

        return high - low;
    }
}
