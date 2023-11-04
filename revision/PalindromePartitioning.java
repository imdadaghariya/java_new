package revision;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

    public static List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(s, result, new ArrayList<>(), 0);
        return result;
    }

    private static void backtrack(String s, List<List<String>> result, List<String> tempList, int start) {
        if (start == s.length()) {
            result.add(new ArrayList<>(tempList));
        } else {
            for (int i = start; i < s.length(); i++) {
                if (isPalindrome(s, start, i)) {
                    tempList.add(s.substring(start, i + 1));
                    backtrack(s, result, tempList, i + 1);
                    tempList.remove(tempList.size() - 1);
                }
            }
        }
    }

    private static boolean isPalindrome(String s, int low, int high) {
        while (low < high) {
            if (s.charAt(low++) != s.charAt(high--)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        s = s.replaceAll("[^a-zA-Z0-9]","");
        List<List<String>> partitions = partition(s);
        for (List<String> partition : partitions) {
            System.out.println(partition);
        }
    }
}
