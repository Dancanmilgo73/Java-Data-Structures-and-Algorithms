package LeetCode;
// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

// Notice that the solution set must not contain duplicate triplets.

 

// Example 1:

// Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]
// Explanation: 
// nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
// nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
// nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
// The distinct triplets are [-1,0,1] and [-1,-1,2].
// Notice that the order of the output and the order of the triplets does not matter.
// Example 2:

// Input: nums = [0,1,1]
// Output: []
// Explanation: The only possible triplet does not sum up to 0.
// Example 3:

// Input: nums = [0,0,0]
// Output: [[0,0,0]]
// Explanation: The only possible triplet sums up to 0.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length == 0 || nums == null) return result;
        for(int i = 0; i<nums.length-2; i++){
            //Avoid duplicates
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int left = i+1;
            int target = -nums[i];
            int right = nums.length-1;
            helperSearch(nums, left, right, target, result);
        }
        return result;
    }
    
    public void helperSearch(int[] nums, int left, int right, int target, List result){
        while(left<right){
        int currentSum = nums[left] + nums[right];
        if(target==currentSum){
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(-target);
            temp.add(nums[left]);
            temp.add(nums[right]);
            result.add(temp);
            left++;
            right--;
            //Move the left pointer up until we find a different number
            //from the current one
               while(left < right && nums[left] == nums[left-1]){
                left++;
            }
            //Move the right pointer down until we find a different number
            //from the current one
             while(left < right && nums[right] == nums[right+1]){
                right--;
            }
        }
        if(target<currentSum){
            right--;
        }
        if(target>currentSum){
            left++;
        }
    } 
    }
}