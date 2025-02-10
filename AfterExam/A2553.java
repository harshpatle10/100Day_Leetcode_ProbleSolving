package leetcodeQ.AfterExam;

import FileHandling.MethodOfFile.List;

import java.util.ArrayList;

/*
Input: nums = [13,25,83,77]
Output: [1,3,2,5,8,3,7,7]

 */
public class A2553 {
    public static void main(String[] args) {
        int nums[] = {13,25,83,77};



        String str ="";
        for(int i: nums)
        {
            str = str.concat(String.valueOf(i));
        }
        int arr[] = new int[str.length()];
        for(int i=0;i<str.length();i++)
        {
            arr[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }



        for(int i: arr)
        {
            System.out.println(i);
        }


    }
}
