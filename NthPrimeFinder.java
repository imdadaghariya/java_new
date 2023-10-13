public class NthPrimeFinder {
    public static void main(String[] args) {
        int n = 5; // Replace this with the desired value of n.
        int result = findNthPrime(n);
        
        System.out.println("The " + n + "th prime number is: " + result);
    }
    
    public static int findNthPrime(int n) {
        int count = 0;
        int num =3;
        while(count < n){
            if(isPrime(num)){
                count++;
            }
            num++;
        }
        return num-1;
    }

    public static boolean isPrime(int num) {
        if(num<=1){
            return false;
        }
        else{
            for(int i =2;i< num/2;i++){
                if(num %i== 0){
                    return false;
                }
            }
            return true;
        }
    }
}
