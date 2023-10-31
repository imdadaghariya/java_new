package Prep;

public class firstmin {
    public static void main(String[] args) {
        int arr[] = {5,3,4,6,7,4,2,46,8};
        int min = arr[0];
        int smin = 0;
        for(int num : arr){
            if(num < min){
                smin = min;
                min = num;
            }
            else if(num < smin && num!= min){
                smin = num;
            }
        }
        System.out.println(min + "    " +  smin);
    }
}
