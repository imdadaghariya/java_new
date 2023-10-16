package chatGPTQuestion;
public class SumOfPrimes {
    public static void main(String[] args) {
        int n = 5; // Replace this with the desired value of n.
        int sum = findSumOfPrimes(n);
        
        System.out.println("The sum of the first " + n + " prime numbers is: " + sum);
    }
    
    public static int findSumOfPrimes(int n) {
        int primeSum = 2;
        int num = 3;
        int count =1;
        while(count <= n){
            if(isPrime(num)){
                primeSum = primeSum + num;
                count++;
            }
            num++;
        }
        return primeSum;
    }

    public static boolean isPrime(int num) {
        if(num <=1){
            return false;
        }
        for(int i = 2;i<=Math.sqrt(num);i++){
            if(num % i==0){
                return false;
            }
        }
        return true;
    }
}
