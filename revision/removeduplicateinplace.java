package revision;

public class removeduplicateinplace {
    public static void main(String[] args) {
        int arr[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        for(int i =0;i<arr.length;i++){
            int count=1;
            if(arr[i] == -1){
                continue;
            }
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                    arr[j] =-1;
                }
            }
            System.out.println(arr[i] + "  " + count);
        }
        System.out.println();
        int count = arr.length;
        for(int i =0;i<arr.length;i++){
            for(int j = 0;j<arr.length-1;j++){
               if(arr[j] == -1){
                 int temp = arr[j];
                arr[j] =arr[j+1];
                arr[j+1] = temp;
               }
            }
        }
        for(int i =0;i<arr.length;i++){
            if(arr[i] == -1){
                count--;
            }
            if(arr[i] != -1)
                 System.out.println(arr[i]);
        }
        System.out.println("New arrat size is " +  count);

    }
}
