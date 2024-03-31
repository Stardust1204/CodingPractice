public class Solution {
    public boolean isPalindrome(int x) {
        // Special cases: Negative numbers and numbers ending with 0 (except 0 itself) are not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedNum = 0;
        while (x > reversedNum) {
            reversedNum = reversedNum * 10 + x % 10;
            x /= 10;
        }

        // If the number of digits in x is odd, we can get rid of the middle digit of the reversed number
        // to compare with the original x
        return x == reversedNum || x == reversedNum / 10;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(121));  // Output: true
        System.out.println(solution.isPalindrome(-121)); // Output: false
        System.out.println(solution.isPalindrome(10));   // Output: false
    }
}
