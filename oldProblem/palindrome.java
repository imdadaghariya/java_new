
public class palindrome {
    public static void main(String[] args) {
        int num =121;
        int number =num ;
        int rev = 0;
        while(number >0){
            int rem = number %10;
            rev = rev*10 + rem;
            number = number/10;
        }
        if(rev == num){
            System.out.println("Is palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
