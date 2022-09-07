// Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

// Return the sum of the three integers.

// You may assume that each input would have exactly one solution.

 

// Example 1:

// Input: nums = [-1,2,1,-4], target = 1
// Output: 2
// Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
// Example 2:

// Input: nums = [0,0,0], target = 1
// Output: 0


package LeetCode;

import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closest = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length;i++){
            int left = i+1;
            int right = nums.length-1;
        while(left<right){
            int curr = nums[i] + nums[left] + nums[right];
            if(Math.abs(curr-target) < Math.abs(closest-target)){
                closest = curr;
            }
            if(target < curr){
                right--;
            }else{
                left++;
            }
            
          
        }
        
        }
        return closest;
}
}