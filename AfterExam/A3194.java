package leetcodeQ.AfterExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
* Input: nums = [7,8,3,4,15,13,4,1]

Output: 5.5

Explanation:

step	nums	averages
0	[7,8,3,4,15,13,4,1]	[8]
1	[7,8,3,4,13,4]	[8,8]
2	[7,8,4,4]	[8,8,6]
3	[7,4]	[8,8,6,5.5]
The smallest element of averages, 5.5, is returned.
Example 2:

Input: nums = [1,9,8,3,10,5]

Output: 5.5

Explanation:

step	nums	averages
0	[1,9,8,3,10,5]	[]
1	[9,8,3,5]	[5.5]
2	[8,5]	[5.5,6]
3	[]	[5.5,6,6.5]
*/
public class A3194 {
    public static void main(String[] args) {
        int nums[] = {7,8,3,4,15,13,4,1};

        List <Double> numslist = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0,k=nums.length-1;i<nums.length/2;i++,k--)
        {

            double avg = (double)(nums[i]+nums[k])/2;
            numslist.add(avg);
        }
        System.out.println(Collections.min(numslist));


    }
}
