package Prep;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int target =10;
        int result = binarySearchfun(arr, target);
        if(result ==-1){
            System.out.println("Elemnt not found");
        }
        else{
            System.out.println("Element found at " + result);
        }
    }


    public static int binarySearchfun(int []arr, int target){
        int left = 0;
        int right = arr.length-1;
        int mid;
        while(left<=right){
            mid = (left+right)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                left = mid +1;
            }
            else{
                right = mid- 1;
            }
        }
        return -1;
    }
}
