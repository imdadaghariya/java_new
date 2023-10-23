package chatgptQuestion;

public class Amstrong {
    public static void main(String[] args) {
        int number = 153;
        int rem = 0;
        int sum = 0;
        int ori = number;
        int temp = number;
        int count = 0;
        while(temp != 0){
            count++;
            temp =temp/10;
        }
        while(number != 0){
            rem = number%10;
            sum = sum + rem*3;
            number = number/10;
        }
        System.out.println("yes");
        
    }
}
