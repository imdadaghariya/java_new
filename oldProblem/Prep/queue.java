package Prep;
import java.util.Scanner;
public class queue {
    static int front = 0;
    static int rear = 0;
    static int[] queue = new int[10];
    static int size = queue.length-1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println(" 1::  Push");
            System.out.println(" 2::  Pop");
            System.out.println(" 3::  Dispaly");
            System.out.println();
            
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the Element to Add");
                    int elem = sc.nextInt();
                    push(elem);
                    break;
                case 2:
                     pop();
                     break;
                case 3: 
                    Display();
                    break;
                default:
                    System.out.println("Invalid choice ");
                    break;
            }
        }
    }

    public static void push(int elem){
        if(rear == size ){
            System.out.println("Queue Is full");
        }
        else{
            queue[rear] = elem;
            rear++;
            System.out.println("The Element is added in the queue");
        }
    }

    public static void pop(){
        if(front >= rear){
            System.out.println("The Queue is Empty");
        }
        else{
            System.out.println("The element is POPED    " + "  "+queue[front]);
            front++;
        }
    }

    public static void Display(){

        if(front == rear){
           System.out.println("Queue is Empty");
        }
        else{
             for(int i=front;i<rear;i++){
            System.out.println("|"+queue[i]+"|");
        }
        }
    }
}
