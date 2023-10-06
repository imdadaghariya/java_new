public class contains_dup {
        public static void main(String[] args) {
            int[] numbers = {12, 45, 7, 32, 19, 54, 8, 23};
            for(int i =0;i< numbers.length;i++){
                for(int j=i+1;j< numbers.length;j++){
                    if(numbers[i] == numbers[j]){
                        System.out.println("Contains Duplicate");
                    }
            }
        }
        System.out.println("No duplicates");
        }
}
