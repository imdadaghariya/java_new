package revision;

public class firstnon{
    public static void main(String[] args) {
        String str = "leetcode";
        for(int i=0;i<str.length();i++){
            boolean isrepeated = true;
            for(int j =0;j<str.length();j++){
                if(i!=j && str.charAt(i)== str.charAt(j)){
                    isrepeated =false;
                    break;
                }
            }
            if(isrepeated){
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}