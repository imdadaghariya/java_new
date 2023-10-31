package revision;

public class factorialrecursion {
    public static void main(String[] args) {
        int num = 5;
        long fact = factorial(num);
        System.out.println(fact);
    }
    public static long factorial(int num){
        if(num == 0 || num ==1){
            return 1;
        }
        else{
            return num * factorial(num-1);
        }
    }
}
