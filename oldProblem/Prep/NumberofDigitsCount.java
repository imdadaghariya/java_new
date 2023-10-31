package Prep;

public class NumberofDigitsCount {
    public static void main(String[] args) {
        String input = "imdad12345";
        int count = 0;
        for (char c : input.toCharArray()) {
            if (c >= '0' && c <= '9') {
                count++;
            }
        }
        System.out.println(count);
    }
}
