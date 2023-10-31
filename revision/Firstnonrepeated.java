package revision;

public class Firstnonrepeated{
    public static void main(String[] args) {
        String str = "imdadhusain";
        for(int i =0;i<str.length();i++){
            boolean repeated = true;
            for(int j =0;j<str.length();j++){
                if(i !=j && str.charAt(i) == str.charAt(j) ){
                    repeated = false;
                    break;
                }
            }
            if(repeated){
                System.out.println("First Non Repeated Character in the String is " +  str.charAt(i));
                break;
            }
        }
    }
}