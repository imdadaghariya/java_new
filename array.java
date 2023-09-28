

public class array {
    public static void main(String []args){
        int[] array = new int[10];
        System.out.println("Array");
        for(int i = 0;i< array.length;i++){
            array[i] = i+1;
        }
        System.out.println("Ascending Order");
        for(int i = 0; i<array.length;i++){
            System.out.println(array[i]);
        }
        System.out.println("Descending Order");
        // System.out.println(array.length);
        for(int i = array.length-1;i>=0;i--){
            System.out.println(array[i]);
        }
        System.out.println("Descending Order till 5 ");
        for(int i = array.length-1;i>=5;i--){
            System.out.println(array[i]);
        }
        System.out.println("Even Number From the array");
        for(int i = array.length-1;i>0;i--){
            if(array[i]%2 == 0){
                System.out.println(array[i]);
            }
        }
        System.out.println("Maximum Value in the array");
        int max = 0;
        for(int i = 0;i<array.length-1;i++){
             max = array[i];
            if(array[i]<array[i+1]){
                max = array[i+1];
            }
        }
        System.out.println(max);

        System.out.println("Sum of Array");
        int sum =0;
        for(int i =0;i<array.length;i++){
            sum = sum+array[i];
        }
        System.out.println(sum);

        System.out.println("Average of the array");
        int avg = 0;
        int sum_avg = 0;
        for(int i =0;i<array.length;i++){
            sum_avg = sum_avg + array[i];
        }
        avg = sum_avg/array.length;
        System.out.println(avg);

        System.out.println("Sum and average of even number in array");
        int su =0;
        int av = 0;
        int count =0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2 == 0){
                su = su+array[i];
                count++;
            }
        }
        av = su/count;
        System.out.println("Sum   "+ su + "  Average  " + av);

        System.out.println("Smallest and Largest");
        int small = array[0];
        int large =0;
        for(int i =0 ;i<array.length;i++){
            if(array[i] < small){
                small = array[i];
            }
            if(array[i] > large){
                large = array[i];
            }
            
        }
        System.out.println("Smallest  " + small + "  Largest  " + large);
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("Second largest in the array");
        int second_largest = 0;
        int largest = 0;
        for(int number : array){
            if(number > largest){
                second_largest = largest;
                largest = number;
            }
            else if(number != largest &&  number > second_largest ){
                second_largest = number;
            }
        }
        System.out.println(largest + " "+ second_largest);
        
    }
}
