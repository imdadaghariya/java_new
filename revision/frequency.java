package revision;

public class frequency {
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,4,5,6,6,7,8,5,4,3,9};
        for(int i =0;i<arr.length;i++){
            int count = 1;
            if(arr[i] == -1){
                continue;
            }
            for(int j =i+1;j<arr.length;j++){
                if(arr[i] ==  arr[j]){
                    count++;
                    arr[j] =-1;
                }
            }
            System.out.println(arr[i] + "Number" + "  Occurs   "+ count);
        }
    }
}
