public class max {
    public static void main(String[] args) {
        int arr[] = {2,3,4,6,8,10};
        int firstmax =0;
        int secondmax= 0;
        int thirdmax =0;
        for(int num : arr){
            if(num > firstmax){
                thirdmax = secondmax;
                secondmax = firstmax;
                firstmax =num;
            }
            else if(num > secondmax && num !=firstmax){
                thirdmax = secondmax;
                secondmax = num;
            }
            else if(num > thirdmax && num != secondmax & num != firstmax){
                thirdmax = num;
            }
        }
        System.out.println("First Max" +    firstmax);
        System.out.println("Second  Max" + secondmax);
        System.out.println("Third Max"+ thirdmax);
    }
}
