public class FactorialCalculator {
    public static void main(String[] args) {
        int n = 5; // Replace this with the integer for which you want to calculate the factorial.
        long factorial = calculateFactorial(n);
        
        System.out.println(n + "! = " + factorial);
    }
    
    public static long calculateFactorial(int n) {
        long fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }
}
