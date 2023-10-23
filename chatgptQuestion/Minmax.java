package chatgptQuestion;

public class Minmax {
    public static void main(String[] args) {
        int arr[] = {1,3,2,8,7,9,5,0};
        int flarge = Integer.MIN_VALUE;
        int slarge = Integer.MIN_VALUE;
        int tlarge = Integer.MIN_VALUE;
        for(int num: arr){
            if(num > flarge){
                tlarge = slarge;
                slarge = flarge; 
                flarge = num;
            }
            else if(num > slarge && num != flarge){
                tlarge = slarge; 
                slarge = num;
            }
            else if(num > tlarge && num !=slarge && num != flarge){
                tlarge= num;
            }
    }    
    System.out.println(flarge + "   "+ slarge+ "  " + tlarge);
    }
}

