package Prep;

public class Secondlargest {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 4};
        int max = arr[0];
        int smax = 0;
        for(int i = 0 ;i< arr.length;i++){
            if(arr[i] > max){
                smax = max;
                max = arr[i];
            }
            else if(arr[i] > smax && arr[i] != max){
                smax = arr[i];
            }
        }
        System.out.println(smax);
    }
}
