class Solution {
    public int longestConsecutive(int[] is) {
        Set<Integer> set = new HashSet<Integer>();
		int res = 0;
		
		for (int i = 0; i < is.length; i++) {
			set.add(is[i]);
		}
		
		for (int i = 0; i < is.length; i++) {
			if(!set.contains(is[i] -1)) {
				int length = 1;
				while(set.contains(is[i] + length)) {
					length++;
				}
				res = Math.max(res, length);
			}
		}
		
		return res;
    }
}
