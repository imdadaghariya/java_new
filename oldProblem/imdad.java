public class imdad{
    public static void main(String[] args) {
        int[] numbers = {4, 7, 2, 9, 1, 5, 6};
        int fsmall = numbers[0];
        int ssmall = 0;
        for(int num : numbers){
            if(num<fsmall){
                ssmall = fsmall;
                fsmall = num;
            }
            else if(num < ssmall && num != fsmall){
                ssmall = num;
            }
        }
        System.out.println(fsmall + "   "+  ssmall );
    }
}