package chatGPTQuestion;
public class IntegerReverser {
    public static void main(String[] args) {
        int number = 12345; // Replace this with the desired number.
        int reversedNumber = reverseInteger(number);
        System.out.println("The reversed number is: " + reversedNumber);
    }
    
    public static int reverseInteger(int number) {
        
        int rem = 0;
        int rev = 0;
        while (number > 0) {
            rem = number % 10;
            rev = rev * 10 + rem;
            number = number / 10;
        }
        return rev;
    }
}
