package revision;

public class firstnonrepeatedcharacter {
    public static void main(String[] args) {
        String str = "TmDadhusain";
        str = str.toLowerCase();
        for(int i =0;i<str.length();i++){
            boolean firstnon = false;
            for(int j = 0;j<str.length();j++){
                if(i != j && str.charAt(i) == str.charAt(j)){
                    firstnon = true;
                    break;
                }
            }
            if(!firstnon){
                System.out.println(str.charAt(i));
                break;
            }
        }

    }
}
