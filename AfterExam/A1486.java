package leetcodeQ.AfterExam;
/*
Input: n = 5, start = 0
Output: 8
Explanation: Array nums is equal to [0, 2, 4, 6, 8] where (0 ^ 2 ^ 4 ^ 6 ^ 8) = 8.
Where "^" corresponds to bitwise XOR operator.
 */
public class A1486 {
    public static void main(String[] args) {
        int n = 5;
        int start = 0;

         int nums = 0;
        for(int i=0;i<n;i++)
        {
           nums =  nums^start;
            start +=2;
        }
        System.out.println(nums);
    }
}
