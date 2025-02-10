package leetcodeQ.AfterExam;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/*
Input: nums = [0,1,1,0]

Output: [0,1]

Explanation:

The numbers 0 and 1 each appear twice in the array.


 */

public class A214 {
    public static void main(String[] args) {
   int nums[] = {7,1,5,4,3,4,6,0,9,5,8,2};
        Set <Integer> hs = new HashSet<>();
        for(int i=0;i<nums.length-1;i++){
            for(int k=i+1;k<nums.length;k++)
            {
                if(nums[i]==nums[k])
                    hs.add(nums[i]);
            }
        }
        int arr[] = new int[hs.size()];
        int i=0;
        for(int a : hs)
        {
            arr[i]=a;
            System.out.println(arr[i]);
            i++;
        }



    }
}
