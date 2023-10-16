package chatGPTQuestion;
public class LargestPrimeFactor {
    public static void main(String[] args) {
        int number = 57; // Replace this with the desired number.
        int largestPrime = findLargestPrimeFactor(number);
        
        System.out.println("The largest prime factor of " + number + " is: " + largestPrime);
    }
    
    public static int findLargestPrimeFactor(int number) {
        int i = 2;
        int num =0;
        int prevPrime = 0;
        while(i< number){
            if(number % i == 0){
                num = i;
                if(isPrime(num)){
                    if(prevPrime < num){
                        prevPrime = num;
                        
                    }
                }
            }
            i++;
        }
        return prevPrime;
    }

    public static boolean isPrime(int num) {
       if(num <= 1){
        return false;
       }       
       for(int i =2;i<=num/2;i++){
        if(num %i == 0){
            return false;
        }
       }
       return true;
    }
}
