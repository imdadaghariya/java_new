

public class string {
    public static void main(String []args){
        String str = "Imdad husain Aghariya";
        String str1 = str.substring(0, 6)+ '\0' + str.substring(7, 12);
        System.out.println(str1);
        System.out.println(str.substring(0, 6)+ '\0' + str.substring(7, 12));
        System.out.println(str.substring(0, 5));
    }
}
