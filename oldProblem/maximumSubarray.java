public class maximumSubarray{
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxsofar = 0;
        int currentsum = 0;
        for(int num : arr){
            currentsum = currentsum+ num;
            if(currentsum > maxsofar){
                maxsofar = currentsum;
            }

            if(currentsum < 0){
                currentsum =0;
            }
        }
        System.out.println(maxsofar + "  " + currentsum);
    }
}