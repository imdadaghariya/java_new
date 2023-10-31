package Prep;

public class sortAscending {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 9, 4, 3, 7, 6};

// bubble sort....



        for(int j = 0;j<array.length-1;j++){
            for(int i = 0;i<array.length-1;i++){
                if(array[i] > array[i+1]){
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
            }
        }

        for(int i = 0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
