
public class DigitSumCalculator {
    public static void main(String[] args) {
        int number = 12345; // Replace this with the desired number.
        int sum = calculateDigitSum(number);
        System.out.println("The sum of digits is: " + sum);
    }
    
    public static int calculateDigitSum(int number) {
       String numStr = String.valueOf(number);
       System.out.println(numStr);
       int sum =0;
       for(int i =0;i<numStr.length();i++){
            sum = sum + numStr.charAt(i)- '0';
       }
       return sum;
    }
}
