public class gfg_occ {
    public static void main(String []args){
        int arr[] = {1, 1, 2, 2, 2, 2, 3,};
        int x = 2;
        int count = 0;
        for(int i=0 ;i< arr.length;i++){
            if(arr[i] == x){
                count++;
            }
        }
        if(count >=1){
            System.out.println(count);
        }
        else{
            System.out.println("Not Present");
        }
    }
}
