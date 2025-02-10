package leetcodeQ.AfterExam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Input: nums1 = [1,2,3], nums2 = [2,4,6]
Output: [[1,3],[4,6]]
Explanation:
For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3].
For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4 and nums2[2] = 6 are not present in nums2. Therefore, answer[1] = [4,6].
Example 2:

Input: nums1 = [1,2,3,3], nums2 = [1,1,2,2]
Output: [[3],[]]
Explanation:
For nums1, nums1[2] and nums1[3] are not present in nums2. Since nums1[2] == nums1[3], their value is only included once and answer[0] = [3].
Every integer in nums2 is present in nums1. Therefore, answer[1] = [].


 int arr[][] = new int[str.length()/2][2];
       int n =0;
        for(int i=0;i<str.length()/2;i++) {
            for(int j=0;j<2;j++) {
                arr[i][j]=Integer.parseInt(String.valueOf(str.charAt(n)));
                n++;
            }
        }
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);

 */
public class A2215 {
    public static void main(String[] args) {
       int []nums1 = {1,2,3};
       int nums2[] =  {2,4,6};

        List <List<Integer>> numslist = Collections.singletonList(new ArrayList<Integer>());
        String str = "";
       for(int i=0;i<nums1.length;i++) {
           int j=0;
           for( j=0;j<nums2.length;j++) {
               if(nums1[i]==nums2[j])
                   break;
           }
           if(j==nums2.length && numslist.contains(i)!=true)
               numslist.add(Collections.singletonList(nums1[i]));
       }
       for(int i=0;i<nums2.length;i++) {
           int j=0;
           for( j=0;j<nums1.length;j++) {
               if(nums2[i]==nums1[j])
                 break;
           }
           if(nums1.length==j && numslist.contains(i)!=true)
              numslist.add(Collections.singletonList(nums2[i]));
       }
        System.out.println(numslist);

    }
}
