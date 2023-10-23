package chatgptQuestion;
public class PerfectNumberChecker {
    public static void main(String[] args) {
        int number = 28;
        boolean isPerfect = isPerfectNumber(number);
        if (isPerfect) {
            System.out.println("The number is a perfect number.");
        } else {
            System.out.println("The number is not a perfect number.");
        }
    }

    public static boolean isPerfectNumber(int number) {
        int perfect =0;
        for(int i = 1;i<=number/2;i++){
            if(number%i == 0){
                perfect= perfect +i;
            }
        }
        if(perfect == number){
            return true;
        }

        return false; 
    }
}
