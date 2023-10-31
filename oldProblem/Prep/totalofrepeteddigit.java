package Prep;

public class totalofrepeteddigit {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,5,6,7,7,8,5};
        int sum =0;
        for(int i = 0;i<arr.length;i++){
            int count = 1;
            boolean repeated = false;
            if(arr[i] == -1){
                continue;
            }
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                    repeated = true;
                }
            }
            if(repeated){
                int add = arr[i]*count;
                sum = sum + add;
            }
            if(arr[i] != -1){
                System.out.println(arr[i] + "  occurs  "+ count + "times" + "And the sum of the repeted character is " + sum);
            }
        }
    }
}
