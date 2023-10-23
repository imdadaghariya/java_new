package chatgptQuestion;

public class StrongNumber {
    public static void main(String[] args) {
        int number = 145;
        int ori = number;
        int factSum = 0;
        int rem = 0;
        while(number != 0){
            int fact = 1;
            rem = number %10;
            for(int i = 1;i<=rem;i++){
                fact = fact *i;
            }
            factSum = factSum + fact;
            number = number/10;
        }

        if(factSum == ori){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
    }
}
