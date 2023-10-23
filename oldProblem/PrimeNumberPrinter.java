
public class PrimeNumberPrinter {
    public static void main(String[] args) {
        int start = 10; // Replace this with the desired start of the range.
        int end = 20;   // Replace this with the desired end of the range.
        
        System.out.println("Prime numbers between " + start + " and " + end + " are: ");
        printPrimes(start, end);
    }
    
    public static void printPrimes(int start, int end) {
        int primeSum = 0;
        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                primeSum = primeSum + num;
            }
        }
        System.out.print(primeSum + " ");
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
