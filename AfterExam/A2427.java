package leetcodeQ.AfterExam;
/*
Input: a = 12, b = 6
Output: 4
Explanation: The common factors of 12 and 6 are 1, 2, 3, 6.
Example 2:

Input: a = 25, b = 30
Output: 2
Explanation: The common factors of 25 and 30 are 1, 5.
 */
public class A2427 {
    public static void main(String[] args) {
        int a=32;
        int b=408;

        int min = Math.min(a,b);
        System.out.println(min);
        int count=0;
        for(int i=1;i<=min;i++)
        {
            if(a%i==0 && b%i==0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
