package leetcodeQ.AfterExam;

import org.w3c.dom.ls.LSOutput;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true]

 */
public class A1431 {
    public static void main(String[] args) {
        int [] candies = {2,3,5,1,3};
        int extraCandies = 3;

        List <Boolean> bool = new ArrayList<>();
        int max=0;
        for(int i=0;i<candies.length;i++)
        {
                if(candies[i]>max)
                max = candies[i];
        }
        for(int i=0;i<candies.length;i++)
        {
            int n = candies[i]+extraCandies;
            if(n>=max)
                bool.add(true);
            else
                bool.add(false);
        }
        System.out.println(bool);
        }
    }

