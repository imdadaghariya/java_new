package Prep;

public class reverseString {
    public static void main(String[] args) {
        String input = "Imdadhusain Aghariya";
        int j = 0;
        char[] reverse = new char[input.length()];
        StringBuilder sb1 =  new StringBuilder();
        for(int i = input.length()-1;i>=0;i--){
            sb1.append(input.charAt(i));
            reverse[j] = input.charAt(i);
            j++;
        }

        System.out.println(sb1);


        for(int i = 0;i<reverse.length;i++){
            System.out.print(reverse[i]+ " ");
        }
        


        System.out.println("String Reverse");


        
    }
}
