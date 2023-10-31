public class allStrongNumber {
    public static void main(String[] args) {
        for (int num = 1; num <= 100; num++) {
            if (isStrongNumber(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isStrongNumber(int num) {
        int ori = num;
        int factSum = 0;
        while (num != 0) {
            int rem = num % 10;
            int fact = factorial(rem);
            factSum += fact;
            num = num / 10;
        }
        return factSum == ori;
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
