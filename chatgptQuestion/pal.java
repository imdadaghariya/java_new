package chatgptQuestion;

public class pal {
    public static void main(String[] args) {
        String str = "madam";
        int j = str.length()-1;
        boolean ispali = true;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) != str.charAt(j)){
                ispali =false;
                break;
            }
            j--;
        }
        if(ispali){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
