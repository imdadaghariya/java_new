package revision;

public class palindrome {
    public static void main(String[] args) {
        int num = 11222113;
        int rev =0;
        int rem;
        int ori = num;
        while(num !=0){
            rem = num %10;
            rev = rev *10 +rem;
            num = num/10;
        }

       if(rev == ori){
        System.out.println("Is palindrome");
       }
       else{
        System.out.println("not palindrome");
       }
    }
}
