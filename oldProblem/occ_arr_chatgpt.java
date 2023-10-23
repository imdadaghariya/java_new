
public class occ_arr_chatgpt {
    public static void main(String []args){
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        for(int i = 0;i<characters.length();i++)
        {
            char  currentchar = characters.charAt(i);
            if(currentchar == '\0'){
                continue;
            }
            int count = 1;
            for(int j = i+1;j< characters.length();j++){
                if(characters.charAt(j) == currentchar){
                    count++;
                    characters = characters.substring(0, j) + '\0' + characters.substring(j+1);
                }
            }
            if(currentchar != '\0'){
                    System.out.println(currentchar + " ----------- Times-----------       " + count);
                }
        }
    }
}
