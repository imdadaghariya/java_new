public class containsWords {
    public static void main(String[] args) {
        String input = "This is a sample sentence. It contains eight words. ";
        String []arr = input.split("[\\s.,!?]+");
        System.out.println(arr.length);
    }
}
