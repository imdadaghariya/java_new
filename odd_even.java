public class odd_even {
        public static void main(String[] args) {
            int []arr = {1,3,5,4,7,9,20};
            for(int num : arr){
                if(num % 2 == 0){
                    System.out.println(num +"        Even number");
                }
                else if(num % 2 != 0 ){
                    System.out.println(num + "        Odd Number");
                }
            }
        }
}
