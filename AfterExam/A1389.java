package leetcodeQ.AfterExam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
Output: [0,4,1,3,2]
Explanation:
nums       index     target
0            0        [0]
1            1        [0,1]
2            2        [0,1,2]
3            2        [0,1,3,2]
4            1        [0,4,1,3,2]

 */
public class A1389 {
    public static void main(String[] args) {
        int nums[] = {0,1,2,3,4};
        int index[] = {0,1,2,2,1};

        List<Integer> numlist = new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
            numlist.add(index[i],nums[i]);
        }
        int arr[] = new int[numlist.size()];
        int i=0;
        for(int a: numlist)
        {
            arr[i] = a;
            i++;
        }

    }
}
