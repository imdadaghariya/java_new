import java.util.Scanner;

public class isAmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int  temp =num;
        int count =0;
        while(temp !=0){
            count++;
            temp = temp/10;
        }
        int temp2= num;
        int rem = 0;
        int sum =0;
        while(temp2 !=0){
            rem = temp2%10;
            sum = sum + rem*count;
            temp2 = temp2/10;
        }

        if(num == sum){
            System.out.println("Is Ammstrong");
        }
        else{
            System.out.println("Is Not Ammstrong");
        }

    }
}
