class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
		int res = 0;
		for (int i : nums) {
			set.add(i);
		}
		for (Integer integer : nums) {
			if(!set.contains(integer -1)) {
				int length = 1;
				while (set.contains(integer + length)) {
					length++;
				}
				res = Math.max(length, res);
			}
		}
		return res;
    }
}
