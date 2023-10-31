package revision;

public class binarySearch {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,8,9,10};
        int target = 10;
        int index = binary(arr, target);
        System.out.println(index);
    }
    public static int binary(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;
        while(left <= right){
             int mid = (left + right)/2;
             if(arr[mid]== target){
            return mid;
             }
            else if(arr[mid] < target){
                    left = mid +1;
                }
             else{
                    right = mid -1;
             }
        }
        return -1;
    }
}
