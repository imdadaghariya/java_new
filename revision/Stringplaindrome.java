package revision;

public class Stringplaindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        str = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        System.out.println(str);
        int j = str.length()-1;
        int i = 0;
        boolean ispali = true;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                ispali = false;
                break;
            }
            j--;
            i++;
        }
        if(ispali){
            System.out.println("The String is Correct palindrome");
        }
        else{
            System.out.println("The String is not  Correct palindrome");
        }
    }
}
