package leetcodeQ.AfterExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Input: nums = [2,5,6,9,10]
Output: 2
Explanation:
The smallest number in nums is 2.
The largest number in nums is 10.
The greatest common divisor of 2 and 10 is 2.

 */
public class A1989 {
    public static void main(String[] args) {
        int []nums = {8,5,8,7,4};

        int small = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]>max) {
                max = nums[i];
            }
            if(nums[i]<small) {
                small = nums[i];
            }
        }
        int ans = Integer.MIN_VALUE;
       for(int i=2;i<=small;i++)
       {
           if(small%i==0 && max%i==0) {
               if(ans<i)
                   ans = i;
           }
       }
       if(ans<1)
           System.out.println(1);
       else
           System.out.println(ans);
    }
}
