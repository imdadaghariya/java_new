package Prep;

public class factRecursion {
    public static void main(String[] args) {
        int num = 5;
        long fact = factorial(num);
        System.out.println(fact);
    }

    public static int factorial(int num){
        if(num == 1 || num == 0){
            return 1;
        }
        else{
            return num * factorial(num -1);
        }
    }
}
