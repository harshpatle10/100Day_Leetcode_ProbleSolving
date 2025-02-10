package leetcodeQ.AfterExam;
/*
Input: nums = [12,345,2,6,7896]
Output: 2
Explanation:
12 contains 2 digits (even number of digits).
345 contains 3 digits (odd number of digits).
2 contains 1 digit (odd number of digits).
6 contains 1 digit (odd number of digits).
7896 contains 4 digits (even number of digits).
There  only 12 and 7896 contain an even number of digits.

 */
public class A1295 {
    public static void main(String[] args) {
        int nums[] = {555,901,482,1771};
        int result =0;
        for(int i=0;i<nums.length;i++){
            String n = nums[i]+"";
            int k=0;
            for(k=0;k<n.length();k++)
            {
                if(Integer.parseInt(String.valueOf(n.charAt(k)))%2!=0)
                    break;
            }
            if(k==n.length())
                result++;
        }
        System.out.println(result);
    }
}
