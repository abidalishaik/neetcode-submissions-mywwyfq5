class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();

		for (int i = 0; i < strs.length; i++) {
			char[] charArray = strs[i].toCharArray();
			int[] ints = new int[26];
			for (char j : charArray) {
				ints[j - 'a']++;
			}
			String string = Arrays.toString(ints);
			if (!map.containsKey(string))
				map.put(string, new ArrayList<String>());
			map.get(string).add(strs[i]);
		}

		return new ArrayList<>(map.values());
    }
}