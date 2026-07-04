class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int n = nums.length;
        int maxI = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for(int ind = k;ind < n;ind++){
            maxI = Math.max(maxI,nums[ind-k]);
            max = Math.max(max,(maxI+nums[ind]));
        }
        return max;
    }
}