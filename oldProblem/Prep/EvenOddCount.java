package Prep;

public class EvenOddCount {
    public static void main(String[] args) {
        int arr[] = {34, 56, 78, 90, 12, 34, 56, 78, 90, 12,13};
        int evenCount = 0;
        int oddCount = 0;
        for(int num : arr){
            if(num %2 == 0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }

        System.out.println("Even Count"  + evenCount);
        System.out.println("Odd Count"  + oddCount);


        for(int i = 0;i<arr.length;i++){
            for(int j =0;j<arr.length-1;j++){
                if(arr[j] > arr[j+ 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        int length = arr.length;
        int median;
        if(length%2== 0){
            int sum = arr[length/2] + arr[length/2 + 1];
            median = sum/2;
            System.out.println(median);
        }
        else{
            System.out.println(arr[length/2]);
        }

    }
}
