
public class PrimeSumCalculator {
    public static void main(String[] args) {
        int start = 10; 
        int end = 20; 
        
        long primeSum = calculatePrimeSum(start, end);
        
        System.out.println("The sum of prime numbers from " + start + " to " + end + " is: " + primeSum);
    }
    
    public static long calculatePrimeSum(int start, int end) {
        int primeSum = 0;
            for(int i = start ;i<=end;i++){
                 boolean isprime = true;
               if(i <= 1){
                isprime = false;
               }
               else{
                for(int j = 2;j<i/2;j++){
                    if(i % j == 0){
                        isprime = false;
                        break;
                    }
                }
               }
               if(isprime){
                primeSum = primeSum + i;
               }
            }
            return primeSum;
    }

}
