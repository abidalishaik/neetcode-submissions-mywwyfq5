class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        s = s.toLowerCase();

        if (s.length() == 2) {
            if(!Character.isLetterOrDigit(s.charAt(0))) return true;
            if(!Character.isLetterOrDigit(s.charAt(1))) return true;
            if (s.charAt(0) == s.charAt(1)) return true;
            return false;
        }

        while (left < right) {
            if (Character.isLetterOrDigit(s.charAt(left)) && Character.isLetterOrDigit(s.charAt(right))) {
                if (s.charAt(left++) != s.charAt(right--)) return false;
            }
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
        }

        return true;
    }
}
