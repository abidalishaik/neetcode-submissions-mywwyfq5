class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int length = s1.length();
		char[] charS1 = new char[26];
		for (int i = 0; i < s1.length(); i++) {
			charS1[s1.charAt(i) - 'a']++;
		}

		for (int i = 0; i <= s2.length() - length; i++) {
			String s = s2.substring(i, i + length);
			char[] charS2 = new char[26];
			for (int j = 0; j < s.length(); j++) {
				charS2[s.charAt(j) - 'a']++;
			}
			if (Arrays.equals(charS1, charS2))
				return true;

		}

		return false;
    }
}
