public class stringReverse {
    public static void main(String[] args) {
        String input = "Imdadhusain ,aghariya";
        char []Original = input.toCharArray();
        char []reversed = new char[input.length()];
        int j =0;
        for(int i =Original.length-1;i>=0;i--){
            reversed[j] = Original[i];
            j++;
        }
        String rev = new String(reversed);
        System.out.println(rev);
    }
}
