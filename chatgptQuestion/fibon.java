package chatgptQuestion;

public class fibon {
    public static void main(String[] args) {
        int f0 =0;
        int f1 =1;
        
        for(int i =0;i< 15;i++){
            System.out.print(f0);
            int sum = f0+f1;
            f0 =f1;
            f1 =sum;
        }
    }
}
