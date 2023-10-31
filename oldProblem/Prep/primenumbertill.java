package Prep;

public class primenumbertill {
    public static void main(String[] args) {
        int num = 20;
        int sum = 0;
        for(int i = 2;i<=num;i++){
            boolean isprime = true;
            for(int j = 2;j<=i/2;j++){
                if(i %j == 0){
                    isprime = false;
                    break;
                }
            }
            if(isprime){
                sum =sum + i;
                System.out.println(i);
            }
        }
        System.out.println(sum);
    }
}
