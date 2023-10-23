
import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks ");
        int num  = sc.nextInt();
        if(num >= 90 && num<=100){
            System.out.println(num +"   A");
        }
        else if(num >=80 && num <=89){
            System.out.println(num + "B");
        }
        else if(num >=60 && num <=70){
            System.out.println(num + "C");
        }
        else if(num >=50 && num <=60){
            System.out.println(num + "D");
        }
        else{
            System.out.println("Fail");
        }
    }
}
