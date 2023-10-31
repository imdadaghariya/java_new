public class MaximumNonAdjacentSubarraySum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int currentsum = 0;
        int maxsofar =0;
        for(int i =0;i<arr.length-1;i++){
            currentsum = currentsum+ arr[i+1];
            if(currentsum  > maxsofar){
                maxsofar = currentsum;
            }
        }
        System.out.println(maxsofar);
    }
}
