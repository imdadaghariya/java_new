package chatGPTQuestion;
public class thirdmax {
    public static void main(String[] args) {
        int []arr = {5,4,3,2};
        int thirdmax = 0;
        int secondmax = 0;
        int firstmax= 0;
        for(int num : arr){
            if(firstmax ==0 || num > firstmax){
                thirdmax = secondmax;
                secondmax = firstmax;
                firstmax = num;
            }
            else if(secondmax ==0 || num > secondmax){
                thirdmax  = secondmax;
                secondmax = num;
            }
            else if(thirdmax ==0 || num > thirdmax){
                thirdmax = num;
            }
        }
        if(thirdmax == 0 ){
            System.out.println("No third Largest");
        }
        else{
            System.out.println(thirdmax);
        }
    }
}
