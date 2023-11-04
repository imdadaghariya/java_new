package revision;

public class primenumberusum {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 30;
        int sum =0;
        for(int i = num1;i<=num2;i++){
            boolean isprime = true;
            if(i <=1){
                continue;
            }
            for(int j = 2;j<=i/2;j++){
                if(i % j == 0){
                    isprime = false;
                    continue;
                }
            }
            if(isprime){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
