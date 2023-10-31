package revision;

public class fibonacciRecursion {
    public static void main(String[] args) {
        int num = 10;
        int f1 = 0;
        int f2 = 1;
        for(int i =0;i<num;i++){
            System.out.print(f1+ " ");
            int sum = f1+f2;
            f1 =f2;
            f2 = sum;
        }
    }
}
