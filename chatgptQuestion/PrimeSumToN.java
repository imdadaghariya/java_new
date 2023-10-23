package chatgptQuestion;

public class PrimeSumToN {
    public static void main(String[] args) {
        int n =15;
        int sum = 0;
        for(int i = 2;i<=n;i++){
            boolean isPrime = true;
            if(i <=1){
                isPrime = false;
                break;
            }
            for(int j = 2;j<i/2;j++){
                if(i %j == 2){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
