class Solution {
    public int maxRotateFunction(int[] nums) {

        int f = 0;
        int s = 0;
        for(int i = 0;i<nums.length;i++)
        {
            f+=nums[i]*i;
            s+=nums[i];
        }
        int max = f;
        for(int i = nums.length-1;i>=1;i--)
        {
            int curr = s + f - nums.length*nums[i];
            f = curr;
            max = Math.max(max,curr);
        }
        return max;

    }

}