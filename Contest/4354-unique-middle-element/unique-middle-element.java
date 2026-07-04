class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        
        int middle = nums[nums.length/2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int val : nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        if(map.get(middle) == 1) return true;
        return false;
    }
}