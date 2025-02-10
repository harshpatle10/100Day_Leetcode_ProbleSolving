package leetcodeQ.AfterExam;

import java.util.Arrays;

/*
Input: nums = [1,2,3,3,2,2]
Output: 2
Explanation:
The maximum possible bitwise AND of a subarray is 3.
The longest subarray with that value is [3,3], so we return 2.
Example 2:

Input: nums = [1,2,3,4]
Output: 1
Explanation:
The maximum possible bitwise AND of a subarray is 4.
The longest subarray with that value is [4], so we return 1.
 */
public class A2419 {
    public static void main(String[] args) {
        int nums[] = {1,2,3,3,2,2};

        int max=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(max<nums[i])
             max= nums[i];
        }
        int n = 0;
        for(int i=0;i<nums.length;i++) {
            if(max==nums[i]) {
                count++;
                if(count>n)
                    n = count;
            }
            else
                count=0;
        }
        System.out.println(n);
    }
}
