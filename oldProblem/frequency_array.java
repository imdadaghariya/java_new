package chatGPTQuestion;
public class frequency_array{
    public static void main(String []args){
        int[] array = {1, 2, 3, 4, 2, 2, 3, 1};
        int freq[] = new int[array.length];
        int visited = -1;
        for(int i =0;i< array.length;i++){
            int count = 1;
            for(int j=i+1;j< array.length;j++){
                if(array[i] == array[j]){
                    count++;
                    freq[j]= visited;
                }
                if(freq[i] != visited){
                    freq[i] = count;
                }
            }
        }
        System.out.println("Frequency");
        for(int i = 0;i< freq.length;i++){
            if(freq[i] !=visited){
                System.out.println("Number            |        frequency");
                System.out.println(array[i]          + "                              " +     freq[i]);
            }
        }
    }
}