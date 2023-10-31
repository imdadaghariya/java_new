package Prep;

public class evenSum {
    public static void main(String[] args) {
        int start = 10;
        int end = 20;
        int sum =0;
        for(int i = start;i<=end;i++){
            if(i <=1){
                break;
            }
            boolean isprime = true;
            for(int j = 2;j<i/2;j++){
                if(i %j == 0){
                    isprime = false;
                    break;
                }
            }
            if(isprime){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
