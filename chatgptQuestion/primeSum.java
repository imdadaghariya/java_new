package chatgptQuestion;

public class primeSum {
    public static void main(String[] args) {
        int start = 20;
        int end = 45;
        int sum = 0;
        for(int i = start;i<=end;i++){
            boolean isPrime = true;
            if(i <= 1){
                break;
            }
            for(int j = 2;j<i/2;j++){
                if(i%j == 0){
                    isPrime =false;
                    break;
                }
            }
            if(isPrime){
                sum = sum +i;
            }
        }
        System.out.println(sum);
    }
}
