package Prep;

public class maxandmin {
    public static void main(String[] args) {
        int arr[] = {7,8,5,6,8,3};
        int max = 0;
        int smax =0;
        int min = arr[0];
        int smin =0;
        for(int num : arr){
            if(num > max){
                smax = max;
                max = num;
            }
            else if(num > smax && num != max){
                smax = num;
            }

            if(num < min){
                smin = min;
                min = num;
            }
            else if(num < smin && num != min){
                smin = num;
            }
        }
        System.out.println(max+ "   "+ min);
        System.out.println(smax+ "   "+ smin);
    }
}
