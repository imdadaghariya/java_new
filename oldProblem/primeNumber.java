package chatGPTQuestion;
import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        int num;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to find is Prime or not");
        num = sc.nextInt();
        if(num <= 1){
            System.out.println("Number is not prime");
        }
        else{
            for(int i= 2;i<num/2;i++){
                if(num % i == 0){
                    System.out.println("Not Prime");
                    break;
                }
            }
            System.out.println("Prime Number");
        }
    }
}
