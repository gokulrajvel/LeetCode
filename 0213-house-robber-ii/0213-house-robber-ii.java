class Solution {
    public static int rob(int[] nums) { 
    if (nums.length == 0) return 0; 
    if (nums.length == 1) return nums[0];
    int case1 = robLinear(nums, 0, nums.length - 2);
    int case2 = robLinear(nums, 1, nums.length - 1); 
    return Math.max(case1, case2); 
    } 
    private static int robLinear(int[] nums, int start, int end) {
      int prev1 = 0, prev2 = 0; 
      for (int i = start; i <= end; i++) { 
            int temp = prev1; 
            prev1 = Math.max(prev2 + nums[i], prev1); 
            prev2 = temp; 
        } 
        return prev1; 
      }
}
    // public int rob(int[] nums) {
    //     if(nums.length==0)
    //         return 0;
    //     if(nums.length==1)
    //         return nums[0];
    //     if(nums.length==3){
    //         int max=Math.max(nums[0],nums[1]);
    //         max=Math.max(max,nums[2]);
    //         return max;
    //     }
    //     int left=0,right=nums.length-1,maxValue=0;
    //     while(left<=right){
    //         if(left+2<=right){
    //             if(right==nums.length-1&&left!=0)
    //                 maxValue=Math.max(maxValue,nums[left]+nums[left+2]);
    //             else if(left==0)
    //                 maxValue=Math.max(maxValue,nums[left]+nums[left+2]);
    //         }
    //         else
    //             maxValue=Math.max(maxValue,nums[left]);

    //         left++;
    //     }
    //     return maxValue;
    // }