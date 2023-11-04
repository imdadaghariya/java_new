package Prep;
import java.util.Scanner;
public class stack {
    static int arr[] = new int[10];
    static int top = 0;
    static int size = arr.length-1;
    
    public static void main(String[] args) {
        
        
        while(true){
            System.out.println("Enter 1 to Push the Data");
            System.out.println("Enter 2 to print the Data");
            System.out.println("Enter 3 to pop the Data");
            Scanner sc1 = new Scanner(System.in);
            int choice = sc1.nextInt();
            if(choice ==1){
            System.out.println("Enter the Element to add in stack");
            Scanner sc = new Scanner(System.in);
            int elem = sc.nextInt();
            boolean pushed =push(elem);
            if(pushed){
                System.out.println("The data is entered");
            }
            else{
                System.out.println("The data is not entered");
            }
            
        }
        else if(choice == 2){
            display();
        }
        else if(choice == 3){
            pop();
        }

        }
    }

    public static  boolean push(int elem){
        if(top == size){
            System.out.println("Stack Overflow");
            return false;
        }
        else{
            arr[top] = elem;
            top++;
            return true;
        }
    }

    public static  void display(){
        if(top == 0){
            System.out.println("Stack Underflow");
        }
        else{
                System.out.println("The element in the stack are");
                System.out.println();
                for(int i =0;i<top;i++){
                System.out.println(arr[i]);
            }
        }
    }

    public static boolean pop(){
        if(top == 0){
            System.out.println("Stack Underflow");
            return false;
        }
        else{
            top--;
            System.out.println(arr[top] + "  The Data is Poped");
            return true;
        }
        

    }
}
