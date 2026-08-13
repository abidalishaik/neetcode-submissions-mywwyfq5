class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		int left = 0;

		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				left = Math.max(left, map.get(s.charAt(i)) + 1);
			}
			map.put(s.charAt(i), i);
			res = Math.max(res, i - left + 1);
		}

		return res;
    }
}
