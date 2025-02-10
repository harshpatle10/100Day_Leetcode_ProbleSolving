package leetcodeQ.AfterExam;

import java.util.HashSet;
import java.util.Set;

public class A1748 {
    public static void main(String[] args) {
        int []nums = {1,1,1,1,1};
        int sum =0;
       for(int i=0;i<nums.length;i++) {
           int k=0;
           for( k=0;k<nums.length;k++) {
               if(nums[i]==nums[k] && k!=i)
                   break;
           }
           if(k==nums.length)
               sum+=nums[i];
       }
        System.out.println(sum);
    }
}
