package Prep;

public class sumofarrayrecursion {
    public static void main(String[] args) {
        int arr[] = {2,3,2,5,6,7,8};
        int index =0;
        int result = sum(arr, index);
        System.out.println(result);
    }

    public static int sum(int []arr, int index){
        if(arr.length ==index ){
            return 0;
        }
        else{
            return arr[index] + sum(arr, index+1);
        }
    }
}
