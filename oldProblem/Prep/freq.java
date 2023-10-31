package Prep;

public class freq {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 3, 2, 1, 6, 7};
        for(int i =0;i<numbers.length;i++){
            int count=1;
            if(numbers[i] == -1){
                continue;
            }
            for(int j = i+1;j<numbers.length;j++){
                if(numbers[i] == numbers[j]){
                    count++;
                    numbers[j] = -1;
                 }
            }

            if(numbers[i] != -1){
                System.out.println("Frequency "+ numbers[i] + " occurs " +     count+ " times");
            }
        }
    }
}
