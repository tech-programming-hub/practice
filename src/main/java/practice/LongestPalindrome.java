package practice;

class LongestPalindrome {
    static String longestPalin(String s) {
        int count = -1;
        String ans = "";
        int n = s.length();
        boolean[][] dp = new boolean[n][n];

        for (int g = 0; g < n; g++) {
            for (int i = 0, j = g; j < n; i++, j++) {
                if (g == 0) {
                    dp[i][j] = true;
                } else if (g == 1) {
                    // Check if the substring is of length 2 (base case).
                    dp[i][j] = (s.charAt(i) == s.charAt(j));
                } else {
                    dp[i][j] = (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]);
                }
                if (dp[i][j] && count < s.substring(i, j + 1).length()) {
                    ans = s.substring(i, j + 1);
                    count = ans.length();
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // Input string
        String str = "abc";

        // Print the longest palindromic substring.
        System.out.println(longestPalin(str));
    }
}