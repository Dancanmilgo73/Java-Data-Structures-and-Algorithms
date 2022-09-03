package LeetCode;
// Given an integer x, return true if x is palindrome integer.

// An integer is a palindrome when it reads the same backward as forward.

// For example, 121 is a palindrome while 123 is not.
 

// Example 1:

// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.
// Example 2:

// Input: x = -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
// Example 3:

// Input: x = 10
// Output: false
// Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

// Constraints:

// -231 <= x <= 231 - 1

class Solution {
public boolean isPalindrome(int x) {
    //store a copy of x
    int xcopy=x;
    int pop,reversed=0;
    while(xcopy>0){
        //Get the last element from xcoy
        pop=xcopy%10;
        //Building back a reverse of x
        reversed=(reversed*10)+pop;
        //updated the latest xcopy//Each time without the last element
        xcopy=xcopy/10;
    }
    if(x==reversed){
        return true;
    }
    return false;
}
}  