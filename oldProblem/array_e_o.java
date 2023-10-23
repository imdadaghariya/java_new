
public class array_e_o {
    public static void main(String[] args) {
        int []arr = {2, 7, 4, 9, 12, 17, 22, 31, 6, 1};
        char []arr_ch = new char[arr.length];
        for(int i = 0;i< arr.length;i++){
            if(arr[i] % 2 == 0){
                arr_ch[i] = 'e';
            }
            else if(arr[i] % 2!= 0){
                arr_ch[i] = 'o';
            }
        }
        System.out.println("Char Array");
        for(char ch : arr_ch){
            System.out.println(ch);
        }
    }
}
