package revision;

public class reversString {
    public static void main(String[] args) {
        String str = "Imdad, husain!";
        char []arr = str.toCharArray();
        int end = str.length()-1;
        int start =0;
        while(start < end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        for(char ch: arr){
            System.out.print(ch+ " ");
        }
    }
}
