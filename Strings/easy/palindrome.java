import java.util.Scanner;

public class palindrome {

    public static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter String: ");
            String str = sc.nextLine();

            if (isPalindrome(str)) {
                System.out.println("Palindrome String");
            } else {
                System.out.println("Not Palindrome String");
            }
        }
    }
}