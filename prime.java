import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("Number :      " + num);
        if(num <= 1){
            System.out.println("Not Prime");
        }
        else if(num == 2){
            System.out.println("Prime Number");
        }
        else{
            boolean isprime = true;
            for(int i =2 ;i< Math.sqrt(num);i++){
                if(num % i ==0 ){
                    isprime = false;
                    break;
                }
            }
            if(isprime){
                System.out.println("Prime Number");
            }
            else{
                System.out.println("Not Prime");
            }
        }
    }
}
