import java.util.Arrays;

public class annagram_array {
    public static void main(String[] args) {
        String str1 = "listeen";
        String str2 = "silhent";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char []one = str1.toCharArray();
        char []two = str2.toCharArray();

        if(str1.length() != str2.length()){
            System.out.println("Not annagram");
        }
        else{
            java.util.Arrays.sort(one);
            java.util.Arrays.sort(two);
            if(Arrays.equals(one,two)){
                System.out.println("Is annagram");
            }
            else{
                System.out.println("Not annagram");
            }
        }
    }
}
