package Prep;

public class sumofnumberrecursion {
    public static void main(String[] args) {
        int num = 5;
        int sum = summ(num);
        System.out.println(sum);
    }

    public static int summ(int num){
        if(num == 0 || num == 1){
            return 1;
        }
        else{
            return num * summ(num-1);
        }
    }
}
