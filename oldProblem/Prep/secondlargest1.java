package Prep;

public class secondlargest1 {
    public static void main(String[] args) {
        int arr[] ={1,3,4,5,4,3,2};
        int max = arr[0];
        int smax = 0;
        for(int num : arr){
            if(num > max){
                smax = max;
                max = num;
            }
            else if(num > smax && num !=max){
                smax = num;
            }
        }
        System.out.println(smax);

    }
}
