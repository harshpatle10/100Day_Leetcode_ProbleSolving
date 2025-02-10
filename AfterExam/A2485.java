package leetcodeQ.AfterExam;

import java.util.Scanner;

public class A2485 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter num :");
        int n = kb.nextInt();
        int sum1=0;
        int sum2=0;

        for(int i=1;i<=n;i++)
        {
         sum1 = 0;
         sum2 = 0;
            for(int k=1;k<=i;k++)
            {
                sum1 = sum1 + k;
            }
            for(int j=n;j>=i;j--)
            {
                sum2 = sum2 + j;
            }
            if(sum1==sum2)
            {
                System.out.println("Answer  : "+i);
                break;
            }
        }


    }
}
