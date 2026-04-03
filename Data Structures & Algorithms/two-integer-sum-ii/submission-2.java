class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int res[] = new int[2];

        // for(int i=0; i< nums.length-1; i++){
        //     for(int j=i+1; j< nums.length; j++){
        //     if(nums[i]+ nums[j] == target) return new int[]{i+1, j+1};
        // }
        // }

        // return new int[]{-1,-1};

        int l = 0, r = nums.length -1;

        while(l < r){
            int sum = nums[l] + nums[r];
             if(target < sum) {r--;}
             else if(target > sum) {l++;}
             else return new int[]{l+1, r+1};
        }

        return new int[0];
    }
}
