class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];

        Map<Integer,Integer> numMap = new HashMap<>();
        for(int i=0 ; i<nums.length ; i++){
            int balance = target-nums[i];
            if(numMap.containsKey(balance)){
                res[0]=i;
                res[1]=numMap.get(balance);
                return res;
            }
            numMap.put(nums[i],i);
        }



        return res;
    }
}