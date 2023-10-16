public class StrongPrimeChecker {
    public static void main(String[] args) {
        int number = 97; // Replace this with the desired number.
        if (isStrongPrime(number)) {
            System.out.println(number + " is a strong prime.");
        } else {
            System.out.println(number + " is not a strong prime.");
        }
    }
    
    public static boolean isStrongPrime(int number) {
        int prevPrime = number-1;
        int nextPrime = number +1;
        while(!isPrime(prevPrime)){
            prevPrime--;
        }
        while(!isPrime(nextPrime)){
            nextPrime++;
        }
        System.out.println(prevPrime + "    "+ nextPrime);
        int sum  = prevPrime + nextPrime;
        System.out.println(sum/2);
        if(sum/2 < number){
            return true;
        }
        return false;
        
    }

    public static boolean isPrime(int num) {
        if(num <=1){
            return false;
        }
        for(int i =2;i<= num/2;i++){
            if(num % i== 0){
                return false;
            }
        }
        return true;
    }
}
