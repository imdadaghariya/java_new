package Prep;
public class longestsubarray{
    public static void main(String[] args) {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxsofar = 0;
        int currentsum = 0;

        for(int i = 0;i<array.length;i++){
            currentsum = currentsum + array[i];
            if(currentsum > maxsofar){
                maxsofar = currentsum;
            }

            if(currentsum < 0){
                currentsum = 0;
            }
        }
        System.out.println(maxsofar);
    }
}