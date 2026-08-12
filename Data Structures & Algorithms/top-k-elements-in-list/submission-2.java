class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       int[] res = new int[k];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		List<Integer>[] counts = new List[nums.length + 1];

		for (int i = 0; i < counts.length; i++) {
			counts[i] = new ArrayList<Integer>();
		}

		var entrySet = map.entrySet();

		for (var entry : entrySet) {
			counts[entry.getValue()].add(entry.getKey());
		}
		int count = 0;

		for (int i = counts.length - 1; i >= 0; i--) {
			for (int num : counts[i]) {
				if (count == k)
					break;
				res[count++] = num;
			}
		}

		return res;
    }
}