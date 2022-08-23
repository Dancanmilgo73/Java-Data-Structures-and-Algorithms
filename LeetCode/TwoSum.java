package LeetCode;
import java.util.Arrays;
import java.util.HashMap;

// Given an array of integers nums and an integer 
// target, return indices of the two numbers such that 
// they add up to target.

// You may assume that each input would have exactly one solution, 
// and you may not use the same element twice.

// You can return the answer in any order.

// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:

// Input: nums = [3,2,4], target = 6
// Output: [1,2]


// ----------------SOLUTION-----------------
class Solution{
    public static void main(String[] args) {
        Solution TestCases = new Solution();
        int[] test1 = {2,7,11,15};
        int[] test2 = {3,2,4};
        int[] test3 = {};
  
        System.out.println(Arrays.toString(TestCases.twoSum(test1, 9)));
        System.out.println(Arrays.toString(TestCases.twoSum(test2, 6)));
        System.out.println(Arrays.toString(TestCases.twoSum(test3, 9)));


    }

    public int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> values= new HashMap<Integer, Integer>();
        for(int i = 0; i<nums.length;i++){
            int numRequired = target - nums[i];
            if(values.containsKey(numRequired)){
                int[] result = {values.get(numRequired), i};
                return result;
            }
            values.put(nums[i], i);
        }
        return null;
    }

    
}

