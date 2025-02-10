package leetcodeQ.AfterExam;

/*
 Input: num = 7
Output: 1
Explanation: 7 divides itself, hence the answer is 1.
Example 2:

Input: num = 121
Output: 2
Explanation: 121 is divisible by 1, but not 2. Since 1 occurs twice as a digit, we return 2.
Example 3:

Input: num = 1248
Output: 4
Explanation: 1248 is divisible by all of its digits, hence the answer is 4.
*/

import java.util.Scanner;

public class A2520 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter num : ");
        int num = kb.nextInt();
        int tem =0;
        int count=0;
        int n = num;


        while (n>0)
        {
            tem = n%10;
            n = n/10;

            if(num%tem ==0)
                count++;

        }
        System.out.println(count);
    }
}
