
public class MinMaxFinder {
    public static void main(String[] args) {
        int[] numbers = {4, 7, 2, 9, 1, 5, 6};
        
        findMinMax(numbers);
    }
    
    public static void findMinMax(int[] arr) {
        int min = arr[0];
        int max = Integer.MIN_VALUE;
        for(int i : arr){
            if(i> max){
                max = i;
            }
            else if(i<min&& i!=max){
                min = i;
            }
        }
        System.out.println(min     + "    " + max);
    }
}
