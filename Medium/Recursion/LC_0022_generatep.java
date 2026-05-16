import java.util.ArrayList;
import java.util.List;

public class LC_0022_generatep {

    public static void main(String[] args) {
        int n = 3;
        List<String> result = generateParenthesis(n);
        System.out.println(result);
        // Output: [((())), (()()), (())(), ()(()), ()()()]
    }

    // Main method called by LeetCode or user
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    // Helper method for backtracking
    private static void backtrack(List<String> result, String current, int open, int close, int max) {
        // Base case: If the current string has reached the required length
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        // Rule 1: Add '(' if we haven't used all '(', i.e., open < max
        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }

        // Rule 2: Add ')' if it won't make the string invalid, i.e., close < open
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, max);
        }
    }
}